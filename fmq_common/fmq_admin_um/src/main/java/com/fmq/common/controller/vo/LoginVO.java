package com.fmq.common.controller.vo;
/**
 * 
 * @author ljg
 *
 */
public class LoginVO extends CommonVO{

	private static final long serialVersionUID = 1L;
	
	public LoginVO() {
	}
	
	public LoginVO(String responseCode, String responseMsg) {
		this.responseCode = responseCode;
		this.responseMsg = responseMsg;
	}

	@Override
	public String toString() {
		return "LoginVO [responseCode=" + responseCode + ", responseMsg=" + responseMsg + ", getResponseCode()="
				+ getResponseCode() + ", getResponseMsg()=" + getResponseMsg() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
