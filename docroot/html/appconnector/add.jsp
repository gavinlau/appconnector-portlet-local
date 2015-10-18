<%@include file="/html/init.jsp"%>
<liferay-portlet:actionURL name="addEntry" var="addConnectorEntryURL"/>
<aui:form action="<%= addConnectorEntryURL %>" method="post" name="fm1" onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "saveForm();" %>'>
	 <div class="row-fluid">
	    <aui:fieldset cssClass="span5">
	       <aui:input name="companyId" label="wits-company-id"/>
	       <aui:input name="comanyName" label="wits-comany-name"/>
	       <aui:input name="name" label="wits-name"/>
	       <aui:input name="versionName" label="wits-version-name"/>
	       <aui:input name="status" label="wits-status"/>
	       <aui:input name="remark" label="wits-remark"/>
	    </aui:fieldset>
	    <aui:fieldset cssClass="span5">
	        <aui:input name="groupId" label="wits-group-id"/>
	    	<aui:input name="type" label="wits-type"/>
	    	<aui:input name="versionCode" label="wits-version-code"/>
	    	<aui:input name="url" label="wits-url"/>
	    	<aui:input name="updateLog" label="wits-updateLog"/>
	    	 
	    </aui:fieldset>
	    
		 <aui:fieldset cssClass="span10">
		    <aui:button-row>
		        <aui:button type="submit" />
		        <aui:button onClick="Liferay.AppConnector.closePopup();" value="close" />
		    </aui:button-row>
		 </aui:fieldset>
	 </div>
</aui:form>
<aui:script>
	function <portlet:namespace />saveForm() {
			var A = AUI();
	
			var form = A.one(document.<portlet:namespace />fm1);
	
			var popup = Liferay.AppConnector.getPopup();
	
			popup.io.set('form', {id: form.getDOM()});
			popup.io.set('uri', form.getAttribute('action'));
	
			popup.io.once(
				'success',
				function(data) {
				  
					Liferay.AppConnector.updateList();
					Liferay.AppConnector.closePopup();
				}
			);
	
			popup.io.start();
		}
</aui:script>

