package com.fmq.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmq.common.base.BaseService;
import com.fmq.common.dao.UserInfoMongoDAO;
import com.fmq.common.dto.UserInfoDTO;
import com.fmq.common.service.UserInfoService;

@Service
public class UserInfoServiceImpl extends BaseService implements UserInfoService {
	@Autowired
	UserInfoMongoDAO dao;

	@Override
	public void saveUserInfo(UserInfoDTO dto) {
		dao.saveUser(dto);
	}

	@Override
	public UserInfoDTO fundUserInfoByUserName(String userName) {
		return dao.findUserByUserName(userName);
	}

	@Override
	public UserInfoDTO fundUserInfoByPassword(String password) {
		return dao.fundUserInfoByPassword(password);
	}


}
