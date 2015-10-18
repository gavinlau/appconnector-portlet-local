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
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.wits.portal.model.Connector;
import com.wits.portal.service.ConnectorLocalServiceUtil;
import com.wits.portal.service.base.ConnectorServiceBaseImpl;

/**
 * The implementation of the connector remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.wits.portal.service.ConnectorService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Administrator
 * @see com.wits.portal.service.base.ConnectorServiceBaseImpl
 * @see com.wits.portal.service.ConnectorServiceUtil
 */
public class ConnectorServiceImpl extends ConnectorServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.wits.portal.service.ConnectorServiceUtil} to access the connector remote service.
	 */
	public Connector addEntry(Connector entry)throws PortalException, SystemException
	{
		return ConnectorLocalServiceUtil.addEntry(entry);
	}
	
	public List<Connector> getEntries()throws PortalException, SystemException
	{
		List<Connector> target=null;
		target=ConnectorLocalServiceUtil.getEntries();
		return target;
	}
	public Connector getLasteVersion(long companyId,long groupId,int status)throws PortalException, SystemException
	{
		
		return ConnectorLocalServiceUtil.getLasteVersion(companyId, groupId, status);
	}
}