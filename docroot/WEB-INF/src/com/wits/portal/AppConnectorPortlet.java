package com.wits.portal;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.wits.portal.model.Connector;
import com.wits.portal.model.impl.ConnectorImpl;
import com.wits.portal.service.ConnectorLocalServiceUtil;
import com.wits.portal.service.ConnectorServiceUtil;

/**
 * Portlet implementation class AppConnectorPortlet
 */
public class AppConnectorPortlet extends MVCPortlet {
	
	public void addEntry(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
		_log.info("AppConnectorPortlet->addConnectorEntry->start");
		Connector entry=new ConnectorImpl();
		BeanUtils.populate(entry,actionRequest.getParameterMap());
		
		ConnectorLocalServiceUtil.addEntry(entry);
		
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		
		jsonObject.put("success", Boolean.TRUE);

		HttpServletResponse response = PortalUtil.getHttpServletResponse(
			actionResponse);
		ServletResponseUtil.write(response, jsonObject.toString());
		_log.info("AppConnectorPortlet->addConnectorEntry->end");
	
	}
	
	public void delEntry(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
		_log.info("AppConnectorPortlet->delConnectorEntry->start");
		Connector entry=new ConnectorImpl();
		//ServiceContext serviceContext=ServiceContextFactory.getInstance(actionRequest);
		Long pk=ParamUtil.getLong(actionRequest,"connectorId");
		ConnectorLocalServiceUtil.deleteConnector(pk);
		
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		
		jsonObject.put("success", Boolean.TRUE);

		HttpServletResponse response = PortalUtil.getHttpServletResponse(
			actionResponse);
		ServletResponseUtil.write(response, jsonObject.toString());
		_log.info("AppConnectorPortlet->delConnectorEntry->end");
	
	}
 
	private Log _log = LogFactoryUtil.getLog(AppConnectorPortlet.class);
}
