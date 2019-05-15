create index IX_E1A9BA77 on FICHA_Jornada (userId);
create index IX_C852FBF1 on FICHA_Jornada (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F99BCAB3 on FICHA_Jornada (uuid_[$COLUMN_LENGTH:75$], groupId);