package com.fmq.common.dto;

import org.springframework.data.annotation.Id;

import com.fmq.common.base.BaseDTO;

public class UserInfoDTO extends BaseDTO {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String userName;
	private String passWord;
	private String idCard;
	private String sex; // 0：男 1:女
	private String mobilePhone;
	private String ip;
	private String userVIP; // 0 :是 1:否
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getUserVIP() {
		return userVIP;
	}

	public void setUserVIP(String userVIP) {
		this.userVIP = userVIP;
	}
	

}
