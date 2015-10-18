/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.wits.portal.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Connector}.
 * </p>
 *
 * @author Administrator
 * @see Connector
 * @generated
 */
public class ConnectorWrapper implements Connector, ModelWrapper<Connector> {
	public ConnectorWrapper(Connector connector) {
		_connector = connector;
	}

	@Override
	public Class<?> getModelClass() {
		return Connector.class;
	}

	@Override
	public String getModelClassName() {
		return Connector.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("connectorId", getConnectorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("comanyName", getComanyName());
		attributes.put("type", getType());
		attributes.put("name", getName());
		attributes.put("versionCode", getVersionCode());
		attributes.put("versionName", getVersionName());
		attributes.put("url", getUrl());
		attributes.put("status", getStatus());
		attributes.put("updateLog", getUpdateLog());
		attributes.put("remark", getRemark());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long connectorId = (Long)attributes.get("connectorId");

		if (connectorId != null) {
			setConnectorId(connectorId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String comanyName = (String)attributes.get("comanyName");

		if (comanyName != null) {
			setComanyName(comanyName);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String versionCode = (String)attributes.get("versionCode");

		if (versionCode != null) {
			setVersionCode(versionCode);
		}

		String versionName = (String)attributes.get("versionName");

		if (versionName != null) {
			setVersionName(versionName);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String updateLog = (String)attributes.get("updateLog");

		if (updateLog != null) {
			setUpdateLog(updateLog);
		}

		String remark = (String)attributes.get("remark");

		if (remark != null) {
			setRemark(remark);
		}
	}

	/**
	* Returns the primary key of this connector.
	*
	* @return the primary key of this connector
	*/
	@Override
	public long getPrimaryKey() {
		return _connector.getPrimaryKey();
	}

	/**
	* Sets the primary key of this connector.
	*
	* @param primaryKey the primary key of this connector
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_connector.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the connector ID of this connector.
	*
	* @return the connector ID of this connector
	*/
	@Override
	public long getConnectorId() {
		return _connector.getConnectorId();
	}

	/**
	* Sets the connector ID of this connector.
	*
	* @param connectorId the connector ID of this connector
	*/
	@Override
	public void setConnectorId(long connectorId) {
		_connector.setConnectorId(connectorId);
	}

	/**
	* Returns the group ID of this connector.
	*
	* @return the group ID of this connector
	*/
	@Override
	public long getGroupId() {
		return _connector.getGroupId();
	}

	/**
	* Sets the group ID of this connector.
	*
	* @param groupId the group ID of this connector
	*/
	@Override
	public void setGroupId(long groupId) {
		_connector.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this connector.
	*
	* @return the company ID of this connector
	*/
	@Override
	public long getCompanyId() {
		return _connector.getCompanyId();
	}

	/**
	* Sets the company ID of this connector.
	*
	* @param companyId the company ID of this connector
	*/
	@Override
	public void setCompanyId(long companyId) {
		_connector.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this connector.
	*
	* @return the user ID of this connector
	*/
	@Override
	public long getUserId() {
		return _connector.getUserId();
	}

	/**
	* Sets the user ID of this connector.
	*
	* @param userId the user ID of this connector
	*/
	@Override
	public void setUserId(long userId) {
		_connector.setUserId(userId);
	}

	/**
	* Returns the user uuid of this connector.
	*
	* @return the user uuid of this connector
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connector.getUserUuid();
	}

	/**
	* Sets the user uuid of this connector.
	*
	* @param userUuid the user uuid of this connector
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_connector.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this connector.
	*
	* @return the user name of this connector
	*/
	@Override
	public java.lang.String getUserName() {
		return _connector.getUserName();
	}

	/**
	* Sets the user name of this connector.
	*
	* @param userName the user name of this connector
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_connector.setUserName(userName);
	}

	/**
	* Returns the create date of this connector.
	*
	* @return the create date of this connector
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _connector.getCreateDate();
	}

	/**
	* Sets the create date of this connector.
	*
	* @param createDate the create date of this connector
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_connector.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this connector.
	*
	* @return the modified date of this connector
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _connector.getModifiedDate();
	}

	/**
	* Sets the modified date of this connector.
	*
	* @param modifiedDate the modified date of this connector
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_connector.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the comany name of this connector.
	*
	* @return the comany name of this connector
	*/
	@Override
	public java.lang.String getComanyName() {
		return _connector.getComanyName();
	}

	/**
	* Sets the comany name of this connector.
	*
	* @param comanyName the comany name of this connector
	*/
	@Override
	public void setComanyName(java.lang.String comanyName) {
		_connector.setComanyName(comanyName);
	}

	/**
	* Returns the type of this connector.
	*
	* @return the type of this connector
	*/
	@Override
	public java.lang.String getType() {
		return _connector.getType();
	}

	/**
	* Sets the type of this connector.
	*
	* @param type the type of this connector
	*/
	@Override
	public void setType(java.lang.String type) {
		_connector.setType(type);
	}

	/**
	* Returns the name of this connector.
	*
	* @return the name of this connector
	*/
	@Override
	public java.lang.String getName() {
		return _connector.getName();
	}

	/**
	* Sets the name of this connector.
	*
	* @param name the name of this connector
	*/
	@Override
	public void setName(java.lang.String name) {
		_connector.setName(name);
	}

	/**
	* Returns the version code of this connector.
	*
	* @return the version code of this connector
	*/
	@Override
	public java.lang.String getVersionCode() {
		return _connector.getVersionCode();
	}

	/**
	* Sets the version code of this connector.
	*
	* @param versionCode the version code of this connector
	*/
	@Override
	public void setVersionCode(java.lang.String versionCode) {
		_connector.setVersionCode(versionCode);
	}

	/**
	* Returns the version name of this connector.
	*
	* @return the version name of this connector
	*/
	@Override
	public java.lang.String getVersionName() {
		return _connector.getVersionName();
	}

	/**
	* Sets the version name of this connector.
	*
	* @param versionName the version name of this connector
	*/
	@Override
	public void setVersionName(java.lang.String versionName) {
		_connector.setVersionName(versionName);
	}

	/**
	* Returns the url of this connector.
	*
	* @return the url of this connector
	*/
	@Override
	public java.lang.String getUrl() {
		return _connector.getUrl();
	}

	/**
	* Sets the url of this connector.
	*
	* @param url the url of this connector
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_connector.setUrl(url);
	}

	/**
	* Returns the status of this connector.
	*
	* @return the status of this connector
	*/
	@Override
	public int getStatus() {
		return _connector.getStatus();
	}

	/**
	* Sets the status of this connector.
	*
	* @param status the status of this connector
	*/
	@Override
	public void setStatus(int status) {
		_connector.setStatus(status);
	}

	/**
	* Returns the update log of this connector.
	*
	* @return the update log of this connector
	*/
	@Override
	public java.lang.String getUpdateLog() {
		return _connector.getUpdateLog();
	}

	/**
	* Sets the update log of this connector.
	*
	* @param updateLog the update log of this connector
	*/
	@Override
	public void setUpdateLog(java.lang.String updateLog) {
		_connector.setUpdateLog(updateLog);
	}

	/**
	* Returns the remark of this connector.
	*
	* @return the remark of this connector
	*/
	@Override
	public java.lang.String getRemark() {
		return _connector.getRemark();
	}

	/**
	* Sets the remark of this connector.
	*
	* @param remark the remark of this connector
	*/
	@Override
	public void setRemark(java.lang.String remark) {
		_connector.setRemark(remark);
	}

	@Override
	public boolean isNew() {
		return _connector.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_connector.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _connector.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_connector.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _connector.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _connector.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_connector.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _connector.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_connector.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_connector.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_connector.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ConnectorWrapper((Connector)_connector.clone());
	}

	@Override
	public int compareTo(com.wits.portal.model.Connector connector) {
		return _connector.compareTo(connector);
	}

	@Override
	public int hashCode() {
		return _connector.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.wits.portal.model.Connector> toCacheModel() {
		return _connector.toCacheModel();
	}

	@Override
	public com.wits.portal.model.Connector toEscapedModel() {
		return new ConnectorWrapper(_connector.toEscapedModel());
	}

	@Override
	public com.wits.portal.model.Connector toUnescapedModel() {
		return new ConnectorWrapper(_connector.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _connector.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _connector.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_connector.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConnectorWrapper)) {
			return false;
		}

		ConnectorWrapper connectorWrapper = (ConnectorWrapper)obj;

		if (Validator.equals(_connector, connectorWrapper._connector)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Connector getWrappedConnector() {
		return _connector;
	}

	@Override
	public Connector getWrappedModel() {
		return _connector;
	}

	@Override
	public void resetOriginalValues() {
		_connector.resetOriginalValues();
	}

	private Connector _connector;
}