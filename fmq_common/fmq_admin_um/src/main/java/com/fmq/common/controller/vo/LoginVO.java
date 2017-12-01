package com.fmq.common.controller.vo;

public class LoginVO extends CommonVO{

	private static final long serialVersionUID = 1L;
	
	public LoginVO() {
	}
	
	public LoginVO(String responseCode, String responseMsg) {
		this.responseCode = responseCode;
		this.responseMsg = responseMsg;
	}

}
