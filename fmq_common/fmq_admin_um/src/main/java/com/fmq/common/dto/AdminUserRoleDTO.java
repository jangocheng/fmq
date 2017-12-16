package com.fmq.common.dto;

import java.util.Date;

import com.fmq.common.base.BaseDTO;
/**
 * 
 * @author ljg
 *
 */
public class AdminUserRoleDTO extends BaseDTO {

	/**
	 * 用户权限
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 角色编码
	 */
	private String roleId;
	/**
	 * 是否有效，1有效，0无效
	 */
	private String isValidity;
	/**
	 * 创建时间
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
	 * 更新人
	 * 
	 */
	private String updatedBy;

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

	@Override
	public String toString() {
		return "AdminUserRoleDTO [id=" + id + ", userId=" + userId + ", roleId=" + roleId + ", isValidity=" + isValidity
				+ ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", updatedDate=" + updatedDate
				+ ", updatedBy=" + updatedBy + "]";
	}

}
