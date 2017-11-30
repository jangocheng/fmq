package com.fmq.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmq.common.base.BaseService;
import com.fmq.common.base.CommonVO;
import com.fmq.common.dao.UserInfoMongoDAO;
import com.fmq.common.service.MongoService;

//@Component
@Service
public class MongoServiceImpl extends BaseService implements MongoService {
	@Autowired
	UserInfoMongoDAO dao;

	@Override
	public CommonVO queryMongo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub
		
	}
	


}
