package com.fmq.common.dto;

import java.util.Date;

import com.fmq.common.base.BaseDTO;
/**
 * 
 * @author ljg
 *
 */
public class AdminResourceDTO extends BaseDTO {

	/**
	 * 资源
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 资源名称
	 */
	private String resourceName;
	/**
	 * 资源编码
	 */
	private String resourceCode;
	/**
	 * 资源类别，1：系统，2菜单，3操作或功能
	 */
	private String resourceType;
	/**
	 * 资源URL
	 */
	private String resourceUrl;
	/**
	 * 描述
	 */
	private String resourceDesc;
	/**
	 * 父节点ID
	 */
	private String parentId;
	/**
	 * 是否有效，1有效，0无效
	 */
	private String isValidity;
	/**
	 * 页面地址
	 */
	private String pageUrl;
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
	 */
	private String updatedBy;
	/**
	 * 排序
	 */
	private String sort;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceCode() {
		return resourceCode;
	}

	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public String getResourceDesc() {
		return resourceDesc;
	}

	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getIsValidity() {
		return isValidity;
	}

	public void setIsValidity(String isValidity) {
		this.isValidity = isValidity;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
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

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "AdminResourceDTO [id=" + id + ", resourceName=" + resourceName + ", resourceCode=" + resourceCode
				+ ", resourceType=" + resourceType + ", resourceUrl=" + resourceUrl + ", resourceDesc=" + resourceDesc
				+ ", parentId=" + parentId + ", isValidity=" + isValidity + ", pageUrl=" + pageUrl + ", createdDate="
				+ createdDate + ", createdBy=" + createdBy + ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy
				+ ", sort=" + sort + "]";
	}

}
