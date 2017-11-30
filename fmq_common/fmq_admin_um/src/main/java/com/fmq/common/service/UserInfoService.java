package com.fmq.common.service;

import com.fmq.common.dto.UserInfoDTO;

public interface UserInfoService {

	void saveUserInfo(UserInfoDTO dto);

	public UserInfoDTO fundUserInfoByUserName(String userName) ;


}
