create table AppConnectorNS_Connector (
	connectorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	comanyName VARCHAR(75) null,
	type_ VARCHAR(75) null,
	name VARCHAR(75) null,
	versionCode VARCHAR(75) null,
	versionName VARCHAR(75) null,
	url VARCHAR(75) null,
	status INTEGER,
	updateLog VARCHAR(75) null,
	remark VARCHAR(75) null
);