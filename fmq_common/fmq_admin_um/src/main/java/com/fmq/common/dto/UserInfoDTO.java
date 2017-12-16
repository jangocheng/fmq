package com.fmq.common.dto;


import com.fmq.common.base.BaseDTO;
/**
 * 
 * @author ljg
 *
 */
public class UserInfoDTO extends BaseDTO {
	private static final long serialVersionUID = 1L;
	private String id;
	private String userName;
	private String passWord;
	private String idCard;
	/**
	 *  0：男 1:女
	 */
	private String sex; 
	private String mobilePhone;
	private String ip;
	/**
	 *  0 :是 1:否
	 */
	private String userVIP; 

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

	@Override
	public String toString() {
		return "UserInfoDTO [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", idCard=" + idCard
				+ ", sex=" + sex + ", mobilePhone=" + mobilePhone + ", ip=" + ip + ", userVIP=" + userVIP + "]";
	}
	

}
