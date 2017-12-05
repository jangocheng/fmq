package com.fmq.common.dto;

import java.util.Date;

import com.fmq.common.base.BaseDTO;

public class AdminRoleResourceDTO extends BaseDTO {

	/**
	 * 角色资源关联 岗位表
	 */
	private static final long serialVersionUID = 1L;
	private String id;// 主键
	private String roleId;// 角色编码
	private String resourceId;// 资源编码
	private String isValidity;// 是否有效，1有效，0无效
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

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
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
