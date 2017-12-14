package com.fmq.common.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fmq.common.base.BaseController;
import com.fmq.common.controller.form.UserInfoForm;
import com.fmq.common.controller.vo.CommonVO;
import com.fmq.common.dto.UserInfoDTO;
import com.fmq.common.service.UserInfoService;

@RestController
public class UserInfoController extends  BaseController{

	@Autowired
	UserInfoService sevice;
	
	@RequestMapping("/saveUserInfo")
	public CommonVO saveUserInfo(@Valid @ModelAttribute  UserInfoForm form ) {
		CommonVO vo =new CommonVO();
		UserInfoDTO dto=new UserInfoDTO();
		//BeanHelper.copyProperties(dto, form);
		sevice.saveUserInfo(dto);
		
		return vo;
		
	}
	@RequestMapping("/fundUserInfoByUserName")
	public UserInfoDTO fundUserInfoByUserName(String userName) {
		
		return sevice.fundUserInfoByUserName(userName);
		
	}
	
}
