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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.wits.portal.NoSuchConnectorException;
import com.wits.portal.model.Connector;
import com.wits.portal.model.impl.ConnectorImpl;
import com.wits.portal.model.impl.ConnectorModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the connector service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Administrator
 * @see ConnectorPersistence
 * @see ConnectorUtil
 * @generated
 */
public class ConnectorPersistenceImpl extends BasePersistenceImpl<Connector>
	implements ConnectorPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ConnectorUtil} to access the connector persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ConnectorImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ConnectorModelImpl.ENTITY_CACHE_ENABLED,
			ConnectorModelImpl.FINDER_CACHE_ENABLED, ConnectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ConnectorModelImpl.ENTITY_CACHE_ENABLED,
			ConnectorModelImpl.FINDER_CACHE_ENABLED, ConnectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ConnectorModelImpl.ENTITY_CACHE_ENABLED,
			ConnectorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID_GROUPID_STATUS =
		new FinderPath(ConnectorModelImpl.ENTITY_CACHE_ENABLED,
			ConnectorModelImpl.FINDER_CACHE_ENABLED, ConnectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycompanyId_groupId_Status",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_GROUPID_STATUS =
		new FinderPath(ConnectorModelImpl.ENTITY_CACHE_ENABLED,
			ConnectorModelImpl.FINDER_CACHE_ENABLED, ConnectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycompanyId_groupId_Status",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			},
			ConnectorModelImpl.COMPANYID_COLUMN_BITMASK |
			ConnectorModelImpl.GROUPID_COLUMN_BITMASK |
			ConnectorModelImpl.STATUS_COLUMN_BITMASK |
			ConnectorModelImpl.COMANYNAME_COLUMN_BITMASK |
			ConnectorModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID_GROUPID_STATUS =
		new FinderPath(ConnectorModelImpl.ENTITY_CACHE_ENABLED,
			ConnectorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycompanyId_groupId_Status",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the connectors where companyId = &#63; and groupId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching connectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Connector> findBycompanyId_groupId_Status(long companyId,
		long groupId, int status) throws SystemException {
		return findBycompanyId_groupId_Status(companyId, groupId, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Connector> findBycompanyId_groupId_Status(long companyId,
		long groupId, int status, int start, int end) throws SystemException {
		return findBycompanyId_groupId_Status(companyId, groupId, status,
			start, end, null);
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
	@Override
	public List<Connector> findBycompanyId_groupId_Status(long companyId,
		long groupId, int status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_GROUPID_STATUS;
			finderArgs = new Object[] { companyId, groupId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID_GROUPID_STATUS;
			finderArgs = new Object[] {
					companyId, groupId, status,
					
					start, end, orderByComparator
				};
		}

		List<Connector> list = (List<Connector>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Connector connector : list) {
				if ((companyId != connector.getCompanyId()) ||
						(groupId != connector.getGroupId()) ||
						(status != connector.getStatus())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_CONNECTOR_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_GROUPID_STATUS_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYID_GROUPID_STATUS_GROUPID_2);

			query.append(_FINDER_COLUMN_COMPANYID_GROUPID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ConnectorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(status);

				if (!pagination) {
					list = (List<Connector>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Connector>(list);
				}
				else {
					list = (List<Connector>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Connector findBycompanyId_groupId_Status_First(long companyId,
		long groupId, int status, OrderByComparator orderByComparator)
		throws NoSuchConnectorException, SystemException {
		Connector connector = fetchBycompanyId_groupId_Status_First(companyId,
				groupId, status, orderByComparator);

		if (connector != null) {
			return connector;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConnectorException(msg.toString());
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
	@Override
	public Connector fetchBycompanyId_groupId_Status_First(long companyId,
		long groupId, int status, OrderByComparator orderByComparator)
		throws SystemException {
		List<Connector> list = findBycompanyId_groupId_Status(companyId,
				groupId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Connector findBycompanyId_groupId_Status_Last(long companyId,
		long groupId, int status, OrderByComparator orderByComparator)
		throws NoSuchConnectorException, SystemException {
		Connector connector = fetchBycompanyId_groupId_Status_Last(companyId,
				groupId, status, orderByComparator);

		if (connector != null) {
			return connector;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConnectorException(msg.toString());
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
	@Override
	public Connector fetchBycompanyId_groupId_Status_Last(long companyId,
		long groupId, int status, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBycompanyId_groupId_Status(companyId, groupId, status);

		if (count == 0) {
			return null;
		}

		List<Connector> list = findBycompanyId_groupId_Status(companyId,
				groupId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Connector[] findBycompanyId_groupId_Status_PrevAndNext(
		long connectorId, long companyId, long groupId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchConnectorException, SystemException {
		Connector connector = findByPrimaryKey(connectorId);

		Session session = null;

		try {
			session = openSession();

			Connector[] array = new ConnectorImpl[3];

			array[0] = getBycompanyId_groupId_Status_PrevAndNext(session,
					connector, companyId, groupId, status, orderByComparator,
					true);

			array[1] = connector;

			array[2] = getBycompanyId_groupId_Status_PrevAndNext(session,
					connector, companyId, groupId, status, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Connector getBycompanyId_groupId_Status_PrevAndNext(
		Session session, Connector connector, long companyId, long groupId,
		int status, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONNECTOR_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_GROUPID_STATUS_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYID_GROUPID_STATUS_GROUPID_2);

		query.append(_FINDER_COLUMN_COMPANYID_GROUPID_STATUS_STATUS_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ConnectorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(connector);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Connector> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connectors where companyId = &#63; and groupId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBycompanyId_groupId_Status(long companyId, long groupId,
		int status) throws SystemException {
		for (Connector connector : findBycompanyId_groupId_Status(companyId,
				groupId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(connector);
		}
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
	@Override
	public int countBycompanyId_groupId_Status(long companyId, long groupId,
		int status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID_GROUPID_STATUS;

		Object[] finderArgs = new Object[] { companyId, groupId, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CONNECTOR_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_GROUPID_STATUS_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYID_GROUPID_STATUS_GROUPID_2);

			query.append(_FINDER_COLUMN_COMPANYID_GROUPID_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(status);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COMPANYID_GROUPID_STATUS_COMPANYID_2 =
		"connector.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYID_GROUPID_STATUS_GROUPID_2 =
		"connector.groupId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYID_GROUPID_STATUS_STATUS_2 =
		"connector.status = ?";

	public ConnectorPersistenceImpl() {
		setModelClass(Connector.class);
	}

	/**
	 * Caches the connector in the entity cache if it is enabled.
	 *
	 * @param connector the connector
	 */
	@Override
	public void cacheResult(Connector connector) {
		EntityCacheUtil.putResult(ConnectorModelImpl.ENTITY_CACHE_ENABLED,
			ConnectorImpl.class, connector.getPrimaryKey(), connector);

		connector.resetOriginalValues();
	}

	/**
	 * Caches the connectors in the entity cache if it is enabled.
	 *
	 * @param connectors the connectors
	 */
	@Override
	public void cacheResult(List<Connector> connectors) {
		for (Connector connector : connectors) {
			if (EntityCacheUtil.getResult(
						ConnectorModelImpl.ENTITY_CACHE_ENABLED,
						ConnectorImpl.class, connector.getPrimaryKey()) == null) {
				cacheResult(connector);
			}
			else {
				connector.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all connectors.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ConnectorImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ConnectorImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the connector.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Connector connector) {
		EntityCacheUtil.removeResult(ConnectorModelImpl.ENTITY_CACHE_ENABLED,
			ConnectorImpl.class, connector.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Connector> connectors) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Connector connector : connectors) {
			EntityCacheUtil.removeResult(ConnectorModelImpl.ENTITY_CACHE_ENABLED,
				ConnectorImpl.class, connector.getPrimaryKey());
		}
	}

	/**
	 * Creates a new connector with the primary key. Does not add the connector to the database.
	 *
	 * @param connectorId the primary key for the new connector
	 * @return the new connector
	 */
	@Override
	public Connector create(long connectorId) {
		Connector connector = new ConnectorImpl();

		connector.setNew(true);
		connector.setPrimaryKey(connectorId);

		return connector;
	}

	/**
	 * Removes the connector with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param connectorId the primary key of the connector
	 * @return the connector that was removed
	 * @throws com.wits.portal.NoSuchConnectorException if a connector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Connector remove(long connectorId)
		throws NoSuchConnectorException, SystemException {
		return remove((Serializable)connectorId);
	}

	/**
	 * Removes the connector with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the connector
	 * @return the connector that was removed
	 * @throws com.wits.portal.NoSuchConnectorException if a connector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Connector remove(Serializable primaryKey)
		throws NoSuchConnectorException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Connector connector = (Connector)session.get(ConnectorImpl.class,
					primaryKey);

			if (connector == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConnectorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(connector);
		}
		catch (NoSuchConnectorException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Connector removeImpl(Connector connector)
		throws SystemException {
		connector = toUnwrappedModel(connector);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(connector)) {
				connector = (Connector)session.get(ConnectorImpl.class,
						connector.getPrimaryKeyObj());
			}

			if (connector != null) {
				session.delete(connector);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (connector != null) {
			clearCache(connector);
		}

		return connector;
	}

	@Override
	public Connector updateImpl(com.wits.portal.model.Connector connector)
		throws SystemException {
		connector = toUnwrappedModel(connector);

		boolean isNew = connector.isNew();

		ConnectorModelImpl connectorModelImpl = (ConnectorModelImpl)connector;

		Session session = null;

		try {
			session = openSession();

			if (connector.isNew()) {
				session.save(connector);

				connector.setNew(false);
			}
			else {
				session.merge(connector);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ConnectorModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((connectorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_GROUPID_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						connectorModelImpl.getOriginalCompanyId(),
						connectorModelImpl.getOriginalGroupId(),
						connectorModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID_GROUPID_STATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_GROUPID_STATUS,
					args);

				args = new Object[] {
						connectorModelImpl.getCompanyId(),
						connectorModelImpl.getGroupId(),
						connectorModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID_GROUPID_STATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_GROUPID_STATUS,
					args);
			}
		}

		EntityCacheUtil.putResult(ConnectorModelImpl.ENTITY_CACHE_ENABLED,
			ConnectorImpl.class, connector.getPrimaryKey(), connector);

		return connector;
	}

	protected Connector toUnwrappedModel(Connector connector) {
		if (connector instanceof ConnectorImpl) {
			return connector;
		}

		ConnectorImpl connectorImpl = new ConnectorImpl();

		connectorImpl.setNew(connector.isNew());
		connectorImpl.setPrimaryKey(connector.getPrimaryKey());

		connectorImpl.setConnectorId(connector.getConnectorId());
		connectorImpl.setGroupId(connector.getGroupId());
		connectorImpl.setCompanyId(connector.getCompanyId());
		connectorImpl.setUserId(connector.getUserId());
		connectorImpl.setUserName(connector.getUserName());
		connectorImpl.setCreateDate(connector.getCreateDate());
		connectorImpl.setModifiedDate(connector.getModifiedDate());
		connectorImpl.setComanyName(connector.getComanyName());
		connectorImpl.setType(connector.getType());
		connectorImpl.setName(connector.getName());
		connectorImpl.setVersionCode(connector.getVersionCode());
		connectorImpl.setVersionName(connector.getVersionName());
		connectorImpl.setUrl(connector.getUrl());
		connectorImpl.setStatus(connector.getStatus());
		connectorImpl.setUpdateLog(connector.getUpdateLog());
		connectorImpl.setRemark(connector.getRemark());

		return connectorImpl;
	}

	/**
	 * Returns the connector with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the connector
	 * @return the connector
	 * @throws com.wits.portal.NoSuchConnectorException if a connector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Connector findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConnectorException, SystemException {
		Connector connector = fetchByPrimaryKey(primaryKey);

		if (connector == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConnectorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return connector;
	}

	/**
	 * Returns the connector with the primary key or throws a {@link com.wits.portal.NoSuchConnectorException} if it could not be found.
	 *
	 * @param connectorId the primary key of the connector
	 * @return the connector
	 * @throws com.wits.portal.NoSuchConnectorException if a connector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Connector findByPrimaryKey(long connectorId)
		throws NoSuchConnectorException, SystemException {
		return findByPrimaryKey((Serializable)connectorId);
	}

	/**
	 * Returns the connector with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the connector
	 * @return the connector, or <code>null</code> if a connector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Connector fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Connector connector = (Connector)EntityCacheUtil.getResult(ConnectorModelImpl.ENTITY_CACHE_ENABLED,
				ConnectorImpl.class, primaryKey);

		if (connector == _nullConnector) {
			return null;
		}

		if (connector == null) {
			Session session = null;

			try {
				session = openSession();

				connector = (Connector)session.get(ConnectorImpl.class,
						primaryKey);

				if (connector != null) {
					cacheResult(connector);
				}
				else {
					EntityCacheUtil.putResult(ConnectorModelImpl.ENTITY_CACHE_ENABLED,
						ConnectorImpl.class, primaryKey, _nullConnector);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ConnectorModelImpl.ENTITY_CACHE_ENABLED,
					ConnectorImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return connector;
	}

	/**
	 * Returns the connector with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param connectorId the primary key of the connector
	 * @return the connector, or <code>null</code> if a connector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Connector fetchByPrimaryKey(long connectorId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)connectorId);
	}

	/**
	 * Returns all the connectors.
	 *
	 * @return the connectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Connector> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Connector> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Connector> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Connector> list = (List<Connector>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONNECTOR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONNECTOR;

				if (pagination) {
					sql = sql.concat(ConnectorModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Connector>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Connector>(list);
				}
				else {
					list = (List<Connector>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the connectors from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Connector connector : findAll()) {
			remove(connector);
		}
	}

	/**
	 * Returns the number of connectors.
	 *
	 * @return the number of connectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONNECTOR);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the connector persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.wits.portal.model.Connector")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Connector>> listenersList = new ArrayList<ModelListener<Connector>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Connector>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ConnectorImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CONNECTOR = "SELECT connector FROM Connector connector";
	private static final String _SQL_SELECT_CONNECTOR_WHERE = "SELECT connector FROM Connector connector WHERE ";
	private static final String _SQL_COUNT_CONNECTOR = "SELECT COUNT(connector) FROM Connector connector";
	private static final String _SQL_COUNT_CONNECTOR_WHERE = "SELECT COUNT(connector) FROM Connector connector WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "connector.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Connector exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Connector exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ConnectorPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"type"
			});
	private static Connector _nullConnector = new ConnectorImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Connector> toCacheModel() {
				return _nullConnectorCacheModel;
			}
		};

	private static CacheModel<Connector> _nullConnectorCacheModel = new CacheModel<Connector>() {
			@Override
			public Connector toEntityModel() {
				return _nullConnector;
			}
		};
}