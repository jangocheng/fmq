package com.fmq.common.dao;

import com.fmq.common.dto.UserInfoDTO;

public interface UserInfoMongoDAO {

	public void saveUser(UserInfoDTO user);

	public UserInfoDTO findUserByUserName(String userName);

	public void updateUser(UserInfoDTO user);

	public void deleteUserById(String id);

	public UserInfoDTO fundUserInfoByPassword(String password);
}
