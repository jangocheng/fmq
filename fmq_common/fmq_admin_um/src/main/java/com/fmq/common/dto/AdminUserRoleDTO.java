package com.fmq.common.dto;

import java.util.Date;

import com.fmq.common.base.BaseDTO;

public class AdminUserRoleDTO extends BaseDTO {

	/**
	 * 用户权限
	 */
	private static final long serialVersionUID = 1L;

	private String id;// 主键
	private String userId;// 用户id
	private String roleId;//角色编码
	private String isValidity;//是否有效，1有效，0无效
	private Date createdDate;// 创建时间
	private String createdBy;// 创建人
	private Date updatedDate;// 更新时间
	private String updatedBy;// 更新人

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getIsValidity() {
		return isValidity;
	}

	public void setIsValidity(String isValidity) {
		this.isValidity = isValidity;
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

}
