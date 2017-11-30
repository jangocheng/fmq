package com.fmq.common.service;

import com.fmq.common.base.CommonVO;

public interface MongoService {

	public CommonVO queryMongo();
	public void remove(String id);

}
