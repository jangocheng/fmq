package com.fmq.common.dto;

import java.util.Date;

import com.fmq.common.base.BaseDTO;
/**
 * 
 * @author ljg
 *
 */
public class AdminUsersDTO extends BaseDTO {

	/**
	 * 用户
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *  主键
	 */
	private String id;
	/**
	 *  用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 *  是否有效，1有效，0无效
	 */
	private String isValidity;
	/**
	 *  用户编码，与用户名相同
	 */
	private String userCode;
	/**
	 *  手机
	 */
	private String mobile;
	/**
	 *  邮件
	 */
	private String email;
	/**
	 * 部门名称
	 */
	private String deptName;
	/**
	 * 中文名称
	 */
	private String lastName;
	/**
	 *  创建时间
	 */
	private Date createdDate;
	/**
	 * 创建人
	 */
	private String createdBy;
	/**
	 * 更新时间
	 */
	private Date updatedDate;
	/**
	 *  更新人
	 */
	private String updatedBy;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIsValidity() {
		return isValidity;
	}

	public void setIsValidity(String isValidity) {
		this.isValidity = isValidity;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "AdminUsersDTO [id=" + id + ", userName=" + userName + ", password=" + password + ", isValidity="
				+ isValidity + ", userCode=" + userCode + ", mobile=" + mobile + ", email=" + email + ", deptName="
				+ deptName + ", lastName=" + lastName + ", createdDate=" + createdDate + ", createdBy=" + createdBy
				+ ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + "]";
	}

}
