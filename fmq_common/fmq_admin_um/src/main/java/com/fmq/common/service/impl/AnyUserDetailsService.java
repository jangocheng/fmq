package com.fmq.common.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fmq.common.dto.AdminUsersDTO;
import com.fmq.common.service.AdminUsersService;

@Service
public class AnyUserDetailsService implements UserDetailsService{

	private final AdminUsersService adminUsersService;

    @Autowired
    AnyUserDetailsService(AdminUsersService adminUsersService){
        this.adminUsersService = adminUsersService;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    	    AdminUsersDTO adminUsers = adminUsersService.getByUserUame(userName);
        if (adminUsers == null){
            throw new UsernameNotFoundException("用户不存在！");
        }
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = createAuthorities("");
        //查询权限表
        //  List<SimpleGrantedAuthority> simpleGrantedAuthorities = createAuthorities(adminUsers.getRoles());
        return new User(adminUsers.getUserName(), adminUsers.getPassword(), simpleGrantedAuthorities);
    }

    /**
     * 权限字符串转化
     *
     * 如 "USER,ADMIN" -> SimpleGrantedAuthority("USER") + SimpleGrantedAuthority("ADMIN")
     *
     * @param roleStr 权限字符串
     */
    private List<SimpleGrantedAuthority> createAuthorities(String roleStr){
        String[] roles = roleStr.split(",");
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
        for (String role : roles) {
            simpleGrantedAuthorities.add(new SimpleGrantedAuthority(role));
        }
        return simpleGrantedAuthorities;
    }

	
	
}
