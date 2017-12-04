package com.fmq.common.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fmq.common.dto.UserDTO;


/**
 * DAO 接口类
 *
 */
@Mapper
public interface UserInfoDao {

	List<UserDTO>  findAll();
	
	UserDTO findById(@Param("id") String id);

	int deleteUser(@Param("id") String id);

	int saveUser(UserDTO userDto);

	int updateUser(UserDTO userDto); 

}
