package com.fmq.common.dao;

import com.fmq.common.dto.UserInfoDTO;

/**
 * 
 * @author ljg
 *
 */
public interface UserInfoMongoDAO {
	/**
	 * 新增
	 * 
	 * @param user
	 */
	public void saveUser(UserInfoDTO user);

	/**
	 * 查询
	 * 
	 * @param userName
	 * @return
	 */

	public UserInfoDTO findUserByUserName(String userName);

	/**
	 * 修改
	 * @param user
	 */

	public void updateUser(UserInfoDTO user);

	/**
	 * 删除
	 * @param id
	 */
	public void deleteUserById(String id);

	/**
	 * 查询密码
	 * @param password
	 * @return
	 */
	public UserInfoDTO fundUserInfoByPassword(String password);
}
