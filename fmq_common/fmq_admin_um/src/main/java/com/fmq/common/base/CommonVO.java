package com.fmq.common.base;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

public class CommonVO implements Serializable{

	/**
	 * Controller 层通用返回对象
	 */
	private static final long serialVersionUID = 1L;
	
	protected String responseCode = "0";
	protected String responseMsg="succeed";

	public CommonVO() {
	}

	public CommonVO(String responseCode) {
		this.responseCode = responseCode;
	}

	public CommonVO(String responseCode, String responseMsg) {
		this.responseCode = responseCode;
		this.responseMsg = responseMsg;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public String toString() {
		return JSONObject.toJSONString(this);
	}
}
