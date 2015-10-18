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

package com.wits.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.wits.portal.model.Connector;
import com.wits.portal.service.ConnectorLocalServiceUtil;

/**
 * @author Administrator
 * @generated
 */
public abstract class ConnectorActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public ConnectorActionableDynamicQuery() throws SystemException {
		setBaseLocalService(ConnectorLocalServiceUtil.getService());
		setClass(Connector.class);

		setClassLoader(com.wits.portal.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("connectorId");
	}
}