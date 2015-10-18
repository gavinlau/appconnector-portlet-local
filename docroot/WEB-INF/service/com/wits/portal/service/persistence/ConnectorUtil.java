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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.wits.portal.model.Connector;

import java.util.List;

/**
 * The persistence utility for the connector service. This utility wraps {@link ConnectorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Administrator
 * @see ConnectorPersistence
 * @see ConnectorPersistenceImpl
 * @generated
 */
public class ConnectorUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Connector connector) {
		getPersistence().clearCache(connector);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Connector> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Connector> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Connector> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Connector update(Connector connector)
		throws SystemException {
		return getPersistence().update(connector);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Connector update(Connector connector,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(connector, serviceContext);
	}

	/**
	* Returns all the connectors where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @return the matching connectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.wits.portal.model.Connector> findBycompanyId_groupId_Status(
		long companyId, long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycompanyId_groupId_Status(companyId, groupId, status);
	}

	/**
	* Returns a range of all the connectors where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.wits.portal.model.impl.ConnectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of connectors
	* @param end the upper bound of the range of connectors (not inclusive)
	* @return the range of matching connectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.wits.portal.model.Connector> findBycompanyId_groupId_Status(
		long companyId, long groupId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycompanyId_groupId_Status(companyId, groupId, status,
			start, end);
	}

	/**
	* Returns an ordered range of all the connectors where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.wits.portal.model.impl.ConnectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of connectors
	* @param end the upper bound of the range of connectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching connectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.wits.portal.model.Connector> findBycompanyId_groupId_Status(
		long companyId, long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycompanyId_groupId_Status(companyId, groupId, status,
			start, end, orderByComparator);
	}

	/**
	* Returns the first connector in the ordered set where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connector
	* @throws com.wits.portal.NoSuchConnectorException if a matching connector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.wits.portal.model.Connector findBycompanyId_groupId_Status_First(
		long companyId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.wits.portal.NoSuchConnectorException {
		return getPersistence()
				   .findBycompanyId_groupId_Status_First(companyId, groupId,
			status, orderByComparator);
	}

	/**
	* Returns the first connector in the ordered set where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connector, or <code>null</code> if a matching connector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.wits.portal.model.Connector fetchBycompanyId_groupId_Status_First(
		long companyId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycompanyId_groupId_Status_First(companyId, groupId,
			status, orderByComparator);
	}

	/**
	* Returns the last connector in the ordered set where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connector
	* @throws com.wits.portal.NoSuchConnectorException if a matching connector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.wits.portal.model.Connector findBycompanyId_groupId_Status_Last(
		long companyId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.wits.portal.NoSuchConnectorException {
		return getPersistence()
				   .findBycompanyId_groupId_Status_Last(companyId, groupId,
			status, orderByComparator);
	}

	/**
	* Returns the last connector in the ordered set where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connector, or <code>null</code> if a matching connector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.wits.portal.model.Connector fetchBycompanyId_groupId_Status_Last(
		long companyId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycompanyId_groupId_Status_Last(companyId, groupId,
			status, orderByComparator);
	}

	/**
	* Returns the connectors before and after the current connector in the ordered set where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param connectorId the primary key of the current connector
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next connector
	* @throws com.wits.portal.NoSuchConnectorException if a connector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.wits.portal.model.Connector[] findBycompanyId_groupId_Status_PrevAndNext(
		long connectorId, long companyId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.wits.portal.NoSuchConnectorException {
		return getPersistence()
				   .findBycompanyId_groupId_Status_PrevAndNext(connectorId,
			companyId, groupId, status, orderByComparator);
	}

	/**
	* Removes all the connectors where companyId = &#63; and groupId = &#63; and status = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBycompanyId_groupId_Status(long companyId,
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBycompanyId_groupId_Status(companyId, groupId, status);
	}

	/**
	* Returns the number of connectors where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching connectors
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycompanyId_groupId_Status(long companyId,
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBycompanyId_groupId_Status(companyId, groupId, status);
	}

	/**
	* Caches the connector in the entity cache if it is enabled.
	*
	* @param connector the connector
	*/
	public static void cacheResult(com.wits.portal.model.Connector connector) {
		getPersistence().cacheResult(connector);
	}

	/**
	* Caches the connectors in the entity cache if it is enabled.
	*
	* @param connectors the connectors
	*/
	public static void cacheResult(
		java.util.List<com.wits.portal.model.Connector> connectors) {
		getPersistence().cacheResult(connectors);
	}

	/**
	* Creates a new connector with the primary key. Does not add the connector to the database.
	*
	* @param connectorId the primary key for the new connector
	* @return the new connector
	*/
	public static com.wits.portal.model.Connector create(long connectorId) {
		return getPersistence().create(connectorId);
	}

	/**
	* Removes the connector with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param connectorId the primary key of the connector
	* @return the connector that was removed
	* @throws com.wits.portal.NoSuchConnectorException if a connector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.wits.portal.model.Connector remove(long connectorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.wits.portal.NoSuchConnectorException {
		return getPersistence().remove(connectorId);
	}

	public static com.wits.portal.model.Connector updateImpl(
		com.wits.portal.model.Connector connector)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(connector);
	}

	/**
	* Returns the connector with the primary key or throws a {@link com.wits.portal.NoSuchConnectorException} if it could not be found.
	*
	* @param connectorId the primary key of the connector
	* @return the connector
	* @throws com.wits.portal.NoSuchConnectorException if a connector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.wits.portal.model.Connector findByPrimaryKey(
		long connectorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.wits.portal.NoSuchConnectorException {
		return getPersistence().findByPrimaryKey(connectorId);
	}

	/**
	* Returns the connector with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param connectorId the primary key of the connector
	* @return the connector, or <code>null</code> if a connector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.wits.portal.model.Connector fetchByPrimaryKey(
		long connectorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(connectorId);
	}

	/**
	* Returns all the connectors.
	*
	* @return the connectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.wits.portal.model.Connector> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.wits.portal.model.Connector> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the connectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.wits.portal.model.impl.ConnectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connectors
	* @param end the upper bound of the range of connectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of connectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.wits.portal.model.Connector> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the connectors from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of connectors.
	*
	* @return the number of connectors
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ConnectorPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ConnectorPersistence)PortletBeanLocatorUtil.locate(com.wits.portal.service.ClpSerializer.getServletContextName(),
					ConnectorPersistence.class.getName());

			ReferenceRegistry.registerReference(ConnectorUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ConnectorPersistence persistence) {
	}

	private static ConnectorPersistence _persistence;
}