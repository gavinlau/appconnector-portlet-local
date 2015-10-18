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

package com.wits.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ConnectorService}.
 *
 * @author Administrator
 * @see ConnectorService
 * @generated
 */
public class ConnectorServiceWrapper implements ConnectorService,
	ServiceWrapper<ConnectorService> {
	public ConnectorServiceWrapper(ConnectorService connectorService) {
		_connectorService = connectorService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _connectorService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_connectorService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _connectorService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.wits.portal.model.Connector addEntry(
		com.wits.portal.model.Connector entry)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectorService.addEntry(entry);
	}

	@Override
	public java.util.List<com.wits.portal.model.Connector> getEntries()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectorService.getEntries();
	}

	@Override
	public com.wits.portal.model.Connector getLasteVersion(long companyId,
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectorService.getLasteVersion(companyId, groupId, status);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ConnectorService getWrappedConnectorService() {
		return _connectorService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedConnectorService(ConnectorService connectorService) {
		_connectorService = connectorService;
	}

	@Override
	public ConnectorService getWrappedService() {
		return _connectorService;
	}

	@Override
	public void setWrappedService(ConnectorService connectorService) {
		_connectorService = connectorService;
	}

	private ConnectorService _connectorService;
}