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

import com.liferay.portal.service.persistence.BasePersistence;

import com.wits.portal.model.Connector;

/**
 * The persistence interface for the connector service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Administrator
 * @see ConnectorPersistenceImpl
 * @see ConnectorUtil
 * @generated
 */
public interface ConnectorPersistence extends BasePersistence<Connector> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConnectorUtil} to access the connector persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the connectors where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @return the matching connectors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.wits.portal.model.Connector> findBycompanyId_groupId_Status(
		long companyId, long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.wits.portal.model.Connector> findBycompanyId_groupId_Status(
		long companyId, long groupId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.wits.portal.model.Connector> findBycompanyId_groupId_Status(
		long companyId, long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.wits.portal.model.Connector findBycompanyId_groupId_Status_First(
		long companyId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.wits.portal.NoSuchConnectorException;

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
	public com.wits.portal.model.Connector fetchBycompanyId_groupId_Status_First(
		long companyId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.wits.portal.model.Connector findBycompanyId_groupId_Status_Last(
		long companyId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.wits.portal.NoSuchConnectorException;

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
	public com.wits.portal.model.Connector fetchBycompanyId_groupId_Status_Last(
		long companyId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.wits.portal.model.Connector[] findBycompanyId_groupId_Status_PrevAndNext(
		long connectorId, long companyId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.wits.portal.NoSuchConnectorException;

	/**
	* Removes all the connectors where companyId = &#63; and groupId = &#63; and status = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycompanyId_groupId_Status(long companyId, long groupId,
		int status) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of connectors where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching connectors
	* @throws SystemException if a system exception occurred
	*/
	public int countBycompanyId_groupId_Status(long companyId, long groupId,
		int status) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the connector in the entity cache if it is enabled.
	*
	* @param connector the connector
	*/
	public void cacheResult(com.wits.portal.model.Connector connector);

	/**
	* Caches the connectors in the entity cache if it is enabled.
	*
	* @param connectors the connectors
	*/
	public void cacheResult(
		java.util.List<com.wits.portal.model.Connector> connectors);

	/**
	* Creates a new connector with the primary key. Does not add the connector to the database.
	*
	* @param connectorId the primary key for the new connector
	* @return the new connector
	*/
	public com.wits.portal.model.Connector create(long connectorId);

	/**
	* Removes the connector with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param connectorId the primary key of the connector
	* @return the connector that was removed
	* @throws com.wits.portal.NoSuchConnectorException if a connector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.wits.portal.model.Connector remove(long connectorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.wits.portal.NoSuchConnectorException;

	public com.wits.portal.model.Connector updateImpl(
		com.wits.portal.model.Connector connector)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the connector with the primary key or throws a {@link com.wits.portal.NoSuchConnectorException} if it could not be found.
	*
	* @param connectorId the primary key of the connector
	* @return the connector
	* @throws com.wits.portal.NoSuchConnectorException if a connector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.wits.portal.model.Connector findByPrimaryKey(long connectorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.wits.portal.NoSuchConnectorException;

	/**
	* Returns the connector with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param connectorId the primary key of the connector
	* @return the connector, or <code>null</code> if a connector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.wits.portal.model.Connector fetchByPrimaryKey(long connectorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the connectors.
	*
	* @return the connectors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.wits.portal.model.Connector> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.wits.portal.model.Connector> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.wits.portal.model.Connector> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the connectors from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of connectors.
	*
	* @return the number of connectors
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}