<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.wits.portal.service.ConnectorLocalServiceUtil"%>
<%@page import="com.wits.portal.AppConnectorPortlet"%>
<%@include file="/html/init.jsp"%>

<portlet:renderURL windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>" var="addRenderURL">
  <portlet:param name="mvcPath" value="/html/appconnector/add.jsp" />
</portlet:renderURL>

<div class="app-connector-list-wrapper">
	
	<liferay-ui:search-container emptyResultsMessage="no-entries-were-found">
	<aui:nav-bar>
					<aui:nav>
						<aui:nav-item href="javascript:Liferay.AppConnector.displayPopup('${addRenderURL}','Add')" label="wits-connector-add"
							iconCssClass="icon-folder-open" />
					</aui:nav>
	</aui:nav-bar>
	<liferay-ui:search-container-results>
		<%

			results=ConnectorLocalServiceUtil.getConnectors(searchContainer.getStart(), searchContainer.getEnd());
			total=ConnectorLocalServiceUtil.getConnectorsCount();
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="com.wits.portal.model.Connector" keyProperty="connectorId" modelVar="entry">
	   <liferay-ui:search-container-column-text name="wits-connector-Id" property="connectorId"/>
	   <liferay-ui:search-container-column-text name="wits-company-Id" property="companyId"/>
	   <liferay-ui:search-container-column-text name="wits-group-Id" property="groupId"/>
	   <liferay-ui:search-container-column-text name="wits-comany-Name" property="comanyName"/>
	   <liferay-ui:search-container-column-text name="wits-type" property="type"/>
	   <liferay-ui:search-container-column-text name="wits-name" property="name"/>
	   <liferay-ui:search-container-column-text name="wits-versionCode" property="versionCode"/>
	   <liferay-ui:search-container-column-text name="wits-versionName" property="versionName"/>
	   <liferay-ui:search-container-column-text name="wits-url" property="url"/>
	   <liferay-ui:search-container-column-text name="wits-status" property="status"/>
	   <liferay-ui:search-container-column-text name="wits-updateLog" property="updateLog"/>
	   <liferay-ui:search-container-column-text name="wits-remark" property="remark"/> 
	   <liferay-ui:search-container-column-text name="wits-op">
		     <portlet:renderURL windowState="<%=LiferayWindowState.POP_UP.toString() %>" var="edtRenderURL">
					<portlet:param name="mvcPath" value="/html/appconnector/edt.jsp" />
					<portlet:param name="connectorId" value="${entry.connectorId}"/>
			  </portlet:renderURL>
			
			  <portlet:actionURL name="delEnetry" var="delEnetryActionURL">
		                 <portlet:param name="connectorId" value="${entry.connectorId}"/>
	           </portlet:actionURL>
		   
		    <input onClick="if (confirm('<liferay-ui:message key="are-you-sure-you-want-to-delete-this-entry" />')){<portlet:namespace />delEntry('<%=entry.getConnectorId() %>')}" type="button" value="<liferay-ui:message key="delete" />" />
	   </liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row> 
	<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</div>
<aui:script>
	AUI().ready(
		function() {
			Liferay.AppConnector.init(
				{
					namespace: '<portlet:namespace />',
					listURL: '<portlet:renderURL windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>"><portlet:param name="mvcPath" value="/html/appconnector/view.jsp" /></portlet:renderURL>'
				}
			);
		}
	);
	Liferay.provide(
						window,
						'<portlet:namespace />delEntry',
						function(entryId) {
						 var A = AUI();
							A.io.request(
								'<portlet:actionURL name="delEntry" />',
								{
									after: {
										success: function(data) {
											Liferay.AppConnector.updateList();
										}
									},
									data: {
										<portlet:namespace />connectorId:entryId
									}
								}
							);
						}
					);
</aui:script>

