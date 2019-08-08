create schema PUBLIC;

create table BUS
(
    ID INTEGER not null
        primary key,
    NUMBER VARCHAR(255)
);

create table ENTITYBUS
(
    EID INTEGER not null
        primary key,
    ENUMBER VARCHAR(255)
);

create table NAMINGSTRTEST
(
    ID INTEGER not null
        primary key,
    NUMBER VARCHAR(255)
);

create table "prefix$MyEntity"
(
    EID INTEGER not null
        primary key,
    ENUMBER VARCHAR(255),
    "prefix$column" INTEGER
);

INSERT INTO "prefix$MyEntity"  VALUES('1','1prefix$MyEntity', '1');
INSERT INTO "prefix$MyEntity" VALUES('2','2prefix$MyEntity', '2');


