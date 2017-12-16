package com.fmq.common.dto;

import java.util.Date;

import com.fmq.common.base.BaseDTO;
/**
 * 
 * @author ljg
 *
 */
public class AdminRoleDTO extends BaseDTO {

	/**
	 * 角色表
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 角色名称
	 */
	private String roleName;
	/**
	 *  角色描述
	 */
	private String roleDesc;
	/**
	 * 是否有效，1有效，0无效
	 */
	private String isValidity;
	/**
	 * 创建时间
	 */
	private Date createdDate;
	/**
	 *  创建人
	 */
	private String createdBy;
	/**
	 *  更新时间
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

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
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
		return "AdminRoleDTO [id=" + id + ", roleName=" + roleName + ", roleDesc=" + roleDesc + ", isValidity="
				+ isValidity + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", updatedDate="
				+ updatedDate + ", updatedBy=" + updatedBy + "]";
	}

}
