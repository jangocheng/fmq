package com.fmq.common.service;

import com.fmq.common.dto.UserInfoDTO;
/**
 * 
 * @author ljg
 *
 */
public interface UserInfoService {
/**
 * 新增
 * @param dto
 */
	void saveUserInfo(UserInfoDTO dto);
/**
 * 根据名字查询
 * @param userName
 * @return
 */
	public UserInfoDTO fundUserInfoByUserName(String userName) ;
/**
 * 密码
 * @param password
 * @return
 */
	public UserInfoDTO fundUserInfoByPassword(String password);

}
