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
 * Provides a wrapper for {@link ConnectorLocalService}.
 *
 * @author Administrator
 * @see ConnectorLocalService
 * @generated
 */
public class ConnectorLocalServiceWrapper implements ConnectorLocalService,
	ServiceWrapper<ConnectorLocalService> {
	public ConnectorLocalServiceWrapper(
		ConnectorLocalService connectorLocalService) {
		_connectorLocalService = connectorLocalService;
	}

	/**
	* Adds the connector to the database. Also notifies the appropriate model listeners.
	*
	* @param connector the connector
	* @return the connector that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.wits.portal.model.Connector addConnector(
		com.wits.portal.model.Connector connector)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.addConnector(connector);
	}

	/**
	* Creates a new connector with the primary key. Does not add the connector to the database.
	*
	* @param connectorId the primary key for the new connector
	* @return the new connector
	*/
	@Override
	public com.wits.portal.model.Connector createConnector(long connectorId) {
		return _connectorLocalService.createConnector(connectorId);
	}

	/**
	* Deletes the connector with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param connectorId the primary key of the connector
	* @return the connector that was removed
	* @throws PortalException if a connector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.wits.portal.model.Connector deleteConnector(long connectorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.deleteConnector(connectorId);
	}

	/**
	* Deletes the connector from the database. Also notifies the appropriate model listeners.
	*
	* @param connector the connector
	* @return the connector that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.wits.portal.model.Connector deleteConnector(
		com.wits.portal.model.Connector connector)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.deleteConnector(connector);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _connectorLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.wits.portal.model.impl.ConnectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.wits.portal.model.impl.ConnectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.wits.portal.model.Connector fetchConnector(long connectorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.fetchConnector(connectorId);
	}

	/**
	* Returns the connector with the primary key.
	*
	* @param connectorId the primary key of the connector
	* @return the connector
	* @throws PortalException if a connector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.wits.portal.model.Connector getConnector(long connectorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.getConnector(connectorId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the connectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.wits.portal.model.impl.ConnectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connectors
	* @param end the upper bound of the range of connectors (not inclusive)
	* @return the range of connectors
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.wits.portal.model.Connector> getConnectors(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.getConnectors(start, end);
	}

	/**
	* Returns the number of connectors.
	*
	* @return the number of connectors
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConnectorsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.getConnectorsCount();
	}

	/**
	* Updates the connector in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param connector the connector
	* @return the connector that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.wits.portal.model.Connector updateConnector(
		com.wits.portal.model.Connector connector)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.updateConnector(connector);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _connectorLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_connectorLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _connectorLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.wits.portal.model.Connector addEntry(
		com.wits.portal.model.Connector entry)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.addEntry(entry);
	}

	@Override
	public java.util.List<com.wits.portal.model.Connector> getEntries()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.getEntries();
	}

	@Override
	public com.wits.portal.model.Connector getLasteVersion(long companyId,
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectorLocalService.getLasteVersion(companyId, groupId, status);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ConnectorLocalService getWrappedConnectorLocalService() {
		return _connectorLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedConnectorLocalService(
		ConnectorLocalService connectorLocalService) {
		_connectorLocalService = connectorLocalService;
	}

	@Override
	public ConnectorLocalService getWrappedService() {
		return _connectorLocalService;
	}

	@Override
	public void setWrappedService(ConnectorLocalService connectorLocalService) {
		_connectorLocalService = connectorLocalService;
	}

	private ConnectorLocalService _connectorLocalService;
}