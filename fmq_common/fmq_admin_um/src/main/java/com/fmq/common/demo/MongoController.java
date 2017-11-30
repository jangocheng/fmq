package com.fmq.common.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fmq.common.base.BaseController;
import com.fmq.common.base.CommonVO;
import com.fmq.common.service.UserInfoService;

@RestController
public class MongoController extends BaseController{

	@Autowired 
	UserInfoService service;
	
	public CommonVO queryMongo() {
		
		return null;
	}
	//5a179b3d27501d94263df8c7
	@RequestMapping("/remove")
	public void remove(String ids) {
		
	}
	
}
