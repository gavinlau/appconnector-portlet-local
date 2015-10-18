AUI().use(
	'aui-base',
	'aui-io-plugin-deprecated',
	'liferay-util-window',
	function(A)
	{
		Liferay.namespace('AppConnector');
		Liferay.AppConnector = {
			init:function(param)
			{
				var instance = this;
				instance._namespace = param.namespace;
				instance._listURL = param.listURL;
			},
			/**getPopup start**/
			getPopup: function() {
				var instance = this;

				if (!instance._popup) {
					instance._popup = Liferay.Util.Window.getWindow(
						{
							dialog: {
								align: {
									node: null,
									points: ['tc', 'tc']
								},
								constrain2view: true,
								cssClass: 'tasks-dialog',
								modal: true,
								resizable: false,
								width: 600
							}
						}
					).plug(
						A.Plugin.IO,
						{autoLoad: false}
					).render();
				}

				instance._popup.io.set('form', null);
				instance._popup.io.set('uri', null);

				return instance._popup;
			},
			/**getPopup end**/
			
			/**displayPopup start**/
			displayPopup: function(url, title) {
				var instance = this;

				var viewportRegion = A.getBody().get('viewportRegion');

				var popup = instance.getPopup();

				popup.show();

				popup.titleNode.html(title);

				popup.io.set('uri', url);
				popup.io.start();
			},
			
			/**displayPopup end**/
			
			/**closePopup start**/
			closePopup: function() {
				var instance = this;

				instance.getPopup().hide();
			},
			/**closePopup end**/
			
			/**updateConnectorList start**/
			updateList: function(url, showAll) {
				var instance = this;

				instance._list = A.one('.app-connector-list-wrapper');

				
				if (!instance._list.io) {
					instance._list.plug(
						A.Plugin.IO,
						{autoLoad: false}
					);
				}

				if (!url) {
					url = instance._listURL;

					var data = {};

					//data[instance._namespace + 'assetTagIds'] = instance._getAssetTagIds();
					//data[instance._namespace + 'groupId'] = instance._getGroupId();
					//data[instance._namespace + 'tabs1'] = instance._currentTab;
					//data[instance._namespace + 'tabs2'] = showAll ? 'all' : 'open';

					instance._list.io.set('data', data);
				}
              
				instance._list.io.set('uri', url);

				instance._list.io.start();
			}
			/**updateConnectorList end**/

		}
	}
);