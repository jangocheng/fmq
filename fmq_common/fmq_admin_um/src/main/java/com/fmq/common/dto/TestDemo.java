package com.fmq.common.dto;

import com.fmq.common.base.baseDTO;

public class TestDemo extends baseDTO{

	private static final long serialVersionUID = 1L;
	private long id;// 主键.
	private String name;// 测试名称.
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
