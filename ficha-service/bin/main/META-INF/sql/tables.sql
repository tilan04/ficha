create table FICHA_Jornada (
	uuid_ VARCHAR(75) null,
	jornadaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	fechaFinalizacion DATE null,
	latitud LONG,
	longuitud LONG,
	horasAsignadas LONG,
	tipoServicio LONG
);

create table FICHA_tipoServicio (
	idTipoServicio LONG not null primary key,
	nombreTipoServicio VARCHAR(75) null
);