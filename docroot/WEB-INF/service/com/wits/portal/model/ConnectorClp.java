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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.wits.portal.service.ClpSerializer;
import com.wits.portal.service.ConnectorLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
public class ConnectorClp extends BaseModelImpl<Connector> implements Connector {
	public ConnectorClp() {
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
	public long getPrimaryKey() {
		return _connectorId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setConnectorId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _connectorId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getConnectorId() {
		return _connectorId;
	}

	@Override
	public void setConnectorId(long connectorId) {
		_connectorId = connectorId;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setConnectorId", long.class);

				method.invoke(_connectorRemoteModel, connectorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_connectorRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_connectorRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_connectorRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_connectorRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_connectorRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_connectorRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getComanyName() {
		return _comanyName;
	}

	@Override
	public void setComanyName(String comanyName) {
		_comanyName = comanyName;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setComanyName", String.class);

				method.invoke(_connectorRemoteModel, comanyName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getType() {
		return _type;
	}

	@Override
	public void setType(String type) {
		_type = type;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_connectorRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_connectorRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVersionCode() {
		return _versionCode;
	}

	@Override
	public void setVersionCode(String versionCode) {
		_versionCode = versionCode;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setVersionCode", String.class);

				method.invoke(_connectorRemoteModel, versionCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVersionName() {
		return _versionName;
	}

	@Override
	public void setVersionName(String versionName) {
		_versionName = versionName;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setVersionName", String.class);

				method.invoke(_connectorRemoteModel, versionName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUrl() {
		return _url;
	}

	@Override
	public void setUrl(String url) {
		_url = url;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setUrl", String.class);

				method.invoke(_connectorRemoteModel, url);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_connectorRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUpdateLog() {
		return _updateLog;
	}

	@Override
	public void setUpdateLog(String updateLog) {
		_updateLog = updateLog;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdateLog", String.class);

				method.invoke(_connectorRemoteModel, updateLog);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemark() {
		return _remark;
	}

	@Override
	public void setRemark(String remark) {
		_remark = remark;

		if (_connectorRemoteModel != null) {
			try {
				Class<?> clazz = _connectorRemoteModel.getClass();

				Method method = clazz.getMethod("setRemark", String.class);

				method.invoke(_connectorRemoteModel, remark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getConnectorRemoteModel() {
		return _connectorRemoteModel;
	}

	public void setConnectorRemoteModel(BaseModel<?> connectorRemoteModel) {
		_connectorRemoteModel = connectorRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _connectorRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_connectorRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ConnectorLocalServiceUtil.addConnector(this);
		}
		else {
			ConnectorLocalServiceUtil.updateConnector(this);
		}
	}

	@Override
	public Connector toEscapedModel() {
		return (Connector)ProxyUtil.newProxyInstance(Connector.class.getClassLoader(),
			new Class[] { Connector.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ConnectorClp clone = new ConnectorClp();

		clone.setConnectorId(getConnectorId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setComanyName(getComanyName());
		clone.setType(getType());
		clone.setName(getName());
		clone.setVersionCode(getVersionCode());
		clone.setVersionName(getVersionName());
		clone.setUrl(getUrl());
		clone.setStatus(getStatus());
		clone.setUpdateLog(getUpdateLog());
		clone.setRemark(getRemark());

		return clone;
	}

	@Override
	public int compareTo(Connector connector) {
		int value = 0;

		value = getComanyName().compareTo(connector.getComanyName());

		if (value != 0) {
			return value;
		}

		value = getType().compareTo(connector.getType());

		if (value != 0) {
			return value;
		}

		if (getStatus() < connector.getStatus()) {
			value = -1;
		}
		else if (getStatus() > connector.getStatus()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConnectorClp)) {
			return false;
		}

		ConnectorClp connector = (ConnectorClp)obj;

		long primaryKey = connector.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{connectorId=");
		sb.append(getConnectorId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", comanyName=");
		sb.append(getComanyName());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", versionCode=");
		sb.append(getVersionCode());
		sb.append(", versionName=");
		sb.append(getVersionName());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", updateLog=");
		sb.append(getUpdateLog());
		sb.append(", remark=");
		sb.append(getRemark());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.wits.portal.model.Connector");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>connectorId</column-name><column-value><![CDATA[");
		sb.append(getConnectorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comanyName</column-name><column-value><![CDATA[");
		sb.append(getComanyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>versionCode</column-name><column-value><![CDATA[");
		sb.append(getVersionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>versionName</column-name><column-value><![CDATA[");
		sb.append(getVersionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateLog</column-name><column-value><![CDATA[");
		sb.append(getUpdateLog());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remark</column-name><column-value><![CDATA[");
		sb.append(getRemark());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _connectorId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _comanyName;
	private String _type;
	private String _name;
	private String _versionCode;
	private String _versionName;
	private String _url;
	private int _status;
	private String _updateLog;
	private String _remark;
	private BaseModel<?> _connectorRemoteModel;
}