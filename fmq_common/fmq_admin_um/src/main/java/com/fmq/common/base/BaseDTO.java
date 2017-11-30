package com.fmq.common.base;

import java.io.Serializable;



import com.alibaba.fastjson.JSONObject;


public class BaseDTO implements Serializable,Cloneable{

	private static final long serialVersionUID = 1L;
	
	public BaseDTO() {}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	public String toString() {
		return JSONObject.toJSONString(this);
	} 

	
	
	
}
