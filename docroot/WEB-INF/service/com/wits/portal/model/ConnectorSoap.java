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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.wits.portal.service.http.ConnectorServiceSoap}.
 *
 * @author Administrator
 * @see com.wits.portal.service.http.ConnectorServiceSoap
 * @generated
 */
public class ConnectorSoap implements Serializable {
	public static ConnectorSoap toSoapModel(Connector model) {
		ConnectorSoap soapModel = new ConnectorSoap();

		soapModel.setConnectorId(model.getConnectorId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setComanyName(model.getComanyName());
		soapModel.setType(model.getType());
		soapModel.setName(model.getName());
		soapModel.setVersionCode(model.getVersionCode());
		soapModel.setVersionName(model.getVersionName());
		soapModel.setUrl(model.getUrl());
		soapModel.setStatus(model.getStatus());
		soapModel.setUpdateLog(model.getUpdateLog());
		soapModel.setRemark(model.getRemark());

		return soapModel;
	}

	public static ConnectorSoap[] toSoapModels(Connector[] models) {
		ConnectorSoap[] soapModels = new ConnectorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConnectorSoap[][] toSoapModels(Connector[][] models) {
		ConnectorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConnectorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConnectorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConnectorSoap[] toSoapModels(List<Connector> models) {
		List<ConnectorSoap> soapModels = new ArrayList<ConnectorSoap>(models.size());

		for (Connector model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConnectorSoap[soapModels.size()]);
	}

	public ConnectorSoap() {
	}

	public long getPrimaryKey() {
		return _connectorId;
	}

	public void setPrimaryKey(long pk) {
		setConnectorId(pk);
	}

	public long getConnectorId() {
		return _connectorId;
	}

	public void setConnectorId(long connectorId) {
		_connectorId = connectorId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getComanyName() {
		return _comanyName;
	}

	public void setComanyName(String comanyName) {
		_comanyName = comanyName;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getVersionCode() {
		return _versionCode;
	}

	public void setVersionCode(String versionCode) {
		_versionCode = versionCode;
	}

	public String getVersionName() {
		return _versionName;
	}

	public void setVersionName(String versionName) {
		_versionName = versionName;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public String getUpdateLog() {
		return _updateLog;
	}

	public void setUpdateLog(String updateLog) {
		_updateLog = updateLog;
	}

	public String getRemark() {
		return _remark;
	}

	public void setRemark(String remark) {
		_remark = remark;
	}

	private long _connectorId;
	private long _groupId;
	private long _companyId;
	private long _userId;
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
}