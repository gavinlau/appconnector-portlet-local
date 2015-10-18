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

package com.wits.portal.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactory;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.wits.portal.model.Connector;
import com.wits.portal.service.ConnectorLocalServiceUtil;
import com.wits.portal.service.base.ConnectorLocalServiceBaseImpl;

/**
 * The implementation of the connector local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.wits.portal.service.ConnectorLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Administrator
 * @see com.wits.portal.service.base.ConnectorLocalServiceBaseImpl
 * @see com.wits.portal.service.ConnectorLocalServiceUtil
 */
public class ConnectorLocalServiceImpl extends ConnectorLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.wits.portal.service.ConnectorLocalServiceUtil} to access the connector local service.
	 */
	public Connector addEntry(Connector entry)throws PortalException, SystemException
	{
		
		long entryId=counterLocalService.increment(Connector.class.toString());
		entry.setConnectorId(entryId);
		connectorPersistence.update(entry);
		return entry;
	}
	
	public List<Connector> getEntries()throws PortalException, SystemException
	{
		List<Connector> target=null;
		target=connectorPersistence.findAll();
		return target;
	}
	
	public Connector getLasteVersion(long companyId,long groupId,int status)throws PortalException, SystemException
	{
		Connector target=null;
		OrderByComparator obc=OrderByComparatorFactoryUtil.create("appconnectorns_connector", "versionCode",true);
		target=connectorPersistence.fetchBycompanyId_groupId_Status_First(companyId, groupId, status, obc);
		return target;
	}
}