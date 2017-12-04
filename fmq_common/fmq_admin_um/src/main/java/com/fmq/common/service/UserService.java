package com.fmq.common.service;

import java.util.List;

import com.fmq.common.dto.UserDTO;

/**
 * 业务逻辑接口类
 *
 */
public interface UserService {

	/**
	 */
	public List<UserDTO>  findAll();
	UserDTO findUerById(String userName);

	void deleteUser(String id);

	void saveUser(UserDTO userDto);

	void updateUser(UserDTO userDto);
}
