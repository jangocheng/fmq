package com.fmq.common.base;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @author ljg
 *
 *
 */
public class BaseDTO implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	public BaseDTO() {
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
