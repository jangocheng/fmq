package com.fmq.common.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fmq.common.base.BaseController;
import com.fmq.common.base.CommonVO;
import com.fmq.common.service.MongoService;

@RestController
public class MongoController extends BaseController{

	@Autowired 
	MongoService service;
	
	public CommonVO queryMongo() {
		
		CommonVO vo =service.queryMongo();
		return vo;
	}
	//5a179b3d27501d94263df8c7
	@RequestMapping("/remove")
	public void remove(String ids) {
		 service.remove(ids);
	}
	
}
