package com.fmq.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmq.common.dao.UserInfoDao;
import com.fmq.common.dto.UserDTO;
import com.fmq.common.service.UserService;

/**
 * 业务逻辑实现类
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoDao dao;

    public UserDTO findUerByName(String userName) {
        return dao.findByName(userName);
    }

}
