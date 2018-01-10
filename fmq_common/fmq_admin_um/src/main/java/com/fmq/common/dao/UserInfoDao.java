package com.fmq.common.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fmq.common.dto.UserDTO;

/**
 * DAO 接口类
 *
 * @author ljg
 *
 */
@Mapper
public interface UserInfoDao {

	/**
	 * 查询全部
	 * 
	 * @return
	 */
	List<UserDTO> findAll();

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */

	UserDTO findById(@Param("id") String id);
	
	UserDTO getByUserName(@Param("userName") String userName);

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */

	int deleteUser(@Param("id") String id);

	/**
	 * 新增
	 * 
	 * @param userDto
	 * @return
	 */

	int saveUser(UserDTO userDto);

	/**
	 *修改
	 * @param userDto
	 * @return
	 */

	int updateUser(UserDTO userDto);

}
