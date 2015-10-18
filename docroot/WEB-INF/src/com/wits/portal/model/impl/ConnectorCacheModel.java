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

package com.wits.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.wits.portal.model.Connector;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Connector in entity cache.
 *
 * @author Administrator
 * @see Connector
 * @generated
 */
public class ConnectorCacheModel implements CacheModel<Connector>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{connectorId=");
		sb.append(connectorId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", comanyName=");
		sb.append(comanyName);
		sb.append(", type=");
		sb.append(type);
		sb.append(", name=");
		sb.append(name);
		sb.append(", versionCode=");
		sb.append(versionCode);
		sb.append(", versionName=");
		sb.append(versionName);
		sb.append(", url=");
		sb.append(url);
		sb.append(", status=");
		sb.append(status);
		sb.append(", updateLog=");
		sb.append(updateLog);
		sb.append(", remark=");
		sb.append(remark);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Connector toEntityModel() {
		ConnectorImpl connectorImpl = new ConnectorImpl();

		connectorImpl.setConnectorId(connectorId);
		connectorImpl.setGroupId(groupId);
		connectorImpl.setCompanyId(companyId);
		connectorImpl.setUserId(userId);

		if (userName == null) {
			connectorImpl.setUserName(StringPool.BLANK);
		}
		else {
			connectorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			connectorImpl.setCreateDate(null);
		}
		else {
			connectorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			connectorImpl.setModifiedDate(null);
		}
		else {
			connectorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (comanyName == null) {
			connectorImpl.setComanyName(StringPool.BLANK);
		}
		else {
			connectorImpl.setComanyName(comanyName);
		}

		if (type == null) {
			connectorImpl.setType(StringPool.BLANK);
		}
		else {
			connectorImpl.setType(type);
		}

		if (name == null) {
			connectorImpl.setName(StringPool.BLANK);
		}
		else {
			connectorImpl.setName(name);
		}

		if (versionCode == null) {
			connectorImpl.setVersionCode(StringPool.BLANK);
		}
		else {
			connectorImpl.setVersionCode(versionCode);
		}

		if (versionName == null) {
			connectorImpl.setVersionName(StringPool.BLANK);
		}
		else {
			connectorImpl.setVersionName(versionName);
		}

		if (url == null) {
			connectorImpl.setUrl(StringPool.BLANK);
		}
		else {
			connectorImpl.setUrl(url);
		}

		connectorImpl.setStatus(status);

		if (updateLog == null) {
			connectorImpl.setUpdateLog(StringPool.BLANK);
		}
		else {
			connectorImpl.setUpdateLog(updateLog);
		}

		if (remark == null) {
			connectorImpl.setRemark(StringPool.BLANK);
		}
		else {
			connectorImpl.setRemark(remark);
		}

		connectorImpl.resetOriginalValues();

		return connectorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		connectorId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		comanyName = objectInput.readUTF();
		type = objectInput.readUTF();
		name = objectInput.readUTF();
		versionCode = objectInput.readUTF();
		versionName = objectInput.readUTF();
		url = objectInput.readUTF();
		status = objectInput.readInt();
		updateLog = objectInput.readUTF();
		remark = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(connectorId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (comanyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(comanyName);
		}

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (versionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(versionCode);
		}

		if (versionName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(versionName);
		}

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		objectOutput.writeInt(status);

		if (updateLog == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(updateLog);
		}

		if (remark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remark);
		}
	}

	public long connectorId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String comanyName;
	public String type;
	public String name;
	public String versionCode;
	public String versionName;
	public String url;
	public int status;
	public String updateLog;
	public String remark;
}