package com.fmq.common.dao;
/**
 * DAO 接口类
 *
 * @author ljg
 *
 */

import com.fmq.common.dto.AdminUsersDTO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminUsersDao {

    /**
     * 新增
     *
     * @param adminUsersDTO
     * @return
     */
    int saveAdminUsers(AdminUsersDTO adminUsersDTO);
    
    /**
     * 更加用户名查询
     *
     * @param username
     * @return AdminUsersDTO
     */
	AdminUsersDTO getByUserUame(String userName);

	/**
	 *修改
	 * @param userDto
	 * @return
	 */

	int updateAdminUsers(AdminUsersDTO adminUsersDTO);
	
	
}
