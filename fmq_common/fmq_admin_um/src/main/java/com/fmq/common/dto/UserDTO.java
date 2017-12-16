package com.fmq.common.dto;

import java.util.Date;

import com.fmq.common.base.BaseDTO;

/**
 * 实体类
 * @author ljg
 *
 */
public class UserDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;

	public int id;
	public String userName;
	public String passWord;
	public Date createDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", createDate=" + createDate
				+ "]";
	}

}
