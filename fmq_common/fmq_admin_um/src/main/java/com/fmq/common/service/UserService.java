package com.fmq.common.service;

import java.util.List;

import com.fmq.common.dto.UserDTO;

/**
 * 业务逻辑接口类
 * 
 * @author ljg
 *
 */
public interface UserService {
	
	public UserDTO getByUserName(String userName);
	/**
	 * 查询全部
	 * @return
	 */

	public List<UserDTO> findAll();

	/**
	 * 根据name查询
	 * @param userName
	 * @return
	 */
	UserDTO findUerById(String userName);

	/**
	 * 删除
	 * @param id
	 */
	void deleteUser(String id);

	/**
	 * 新增
	 * @param userDto
	 */
	void saveUser(UserDTO userDto);

	/**
	 * 修改
	 * @param userDto
	 */
	void updateUser(UserDTO userDto);
}
