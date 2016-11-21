drop database stm;
create database stm;

use stm;




create table Users(
userid int auto_increment,
roleid int,
username varchar(10) not null,
password varchar(8) default '888888' not null,
status char(1),
regdate date,
primary key(userid)
)engine=myisam;


create table Userroles(
roleid int auto_increment,
rolename varchar(10) not null,
primary key(roleid)

)engine=myisam;

create table Model(
 modid int auto_increment,
modname varchar(20),
pname varchar(20),
title varchar(50),
roleid int,
classname varchar(50) ,
methodname varchar(50) ,
primary key(modid)
)engine=myisam;

create table Department(
deptid varchar(2) not null,
deptname varchar(20) ,
primary key(deptid)
)engine=myisam;


create table Major(
deptid varchar(2) ,
majid varchar(4) not null,
majname varchar(20) not null,
primary key(majid)
)engine=myisam;

ALTER  TABLE Major ADD CONSTRAINT FK_Department_Major
FOREIGN KEY (deptid)
REFERENCES Dempartment on delete restrict on update restrict 
;


alter table Userroles add constraint FK_Userroles_Users
 foreign key(roleid)
 references Users(roleid) on delete restrict on update restrict 
;



alter table Userroles add constraint FK_Userroles_Users
 foreign key(roleid)
 references Users(roleid) on delete restrict on update restrict 
;



alter table Userroles add constraint FK_Userroles_Users
 foreign key(roleid)
 references Users(roleid) on delete restrict on update restrict 
;


alter table Userroles add constraint FK_Userroles_Model
 foreign key(roleid)
 references Model(roleid) on delete restrict on update restrict
;

insert into Department(deptid,deptname) values('01','信息工程系');
insert into Department(deptid,deptname) values('02','旅游系');
insert into Department(deptid,deptname) values('03','数学系');



insert into Major(deptid,majid,majname) values('01','0101','软件专业');
insert into Major(deptid,majid,majname) values('01','0102','网构专业');
insert into Major(deptid,majid,majname) values('02','0201','旅游专业');
insert into Major(deptid,majid,majname) values('03','0301','大学数学专业');


insert into Userroles(rolename) values('管理员');
insert into Userroles(rolename) values('老师');
insert into Userroles(rolename) values('教务');
insert into Userroles(rolename) values('学生');


insert into Users(roleid,username,password,status,regdate) values(1,'lijin','lijin','1',now());
insert into Users(roleid,username,password,status,regdate) values(2,'laoshi','laoshi','1',now());
insert into Users(roleid,username,password,status,regdate) values(3,'jiaowu','jaiowu','1',now());
insert into Users(roleid,username,password,status,regdate) values(4,'xuesheng','xuesheng','1',now());




insert into Model(modname,pname,title,roleid) values('system','','系统管理',1);
insert into Model(modname,pname,title,roleid) values('system_user','system','系统管理',1);
insert into Model(modname,pname,title,roleid) values('system_auth','system','权限管理',1);
insert into Model(modname,pname,title,roleid,classname,methodname) values('system_dent','system','院系管理',1,'Department','list');
insert into Model(modname,pname,title,roleid,classname,methodname) values('system_maj','system','专业管理',1,'Major','list');
insert into Model(modname,pname,title,roleid) values('edu','','教务管理',1);
insert into Model(modname,pname,title,roleid) values('edu','','教务管理',3);
insert into Model(modname,pname,title,roleid,classname,methodname) values('edu_students','edu','学生管理',1,'Students','list');
insert into Model(modname,pname,title,roleid,classname,methodname) values('edu_students','edu','学生管理',3,'Students','list');
insert into Model(modname,pname,title,roleid) values('edu_score','edu','课程管理',1);
insert into Model(modname,pname,title,roleid) values('edu_score','edu','课程管理',3);
insert into Model(modname,pname,title,roleid) values('score','','成绩管理',1);
insert into Model(modname,pname,title,roleid) values('score','','成绩管理',2);
insert into Model(modname,pname,title,roleid) values('score','','成绩管理',4);
insert into Model(modname,pname,title,roleid) values('score_search','score','成绩查询',1);
insert into Model(modname,pname,title,roleid) values('score_search','score','成绩查询',2);
insert into Model(modname,pname,title,roleid) values('score_search','score','成绩查询',4);






create table Students(
sid varchar(12) not null,
majid varchar(4) ,
sname varchar(20) not null,
gender char(1) default 'M' not null,
snative varchar(20),
phone varchar(20),
address varchar(50),
email varchar(50),
birthday date,
photo varchar(50),
primary key (sid)
)engine=myisam;



insert into Students(sid,majid,sname,gender,snative,birthday) values('S20120101001','0101','张三','M','四川','1992-01-14');
insert into Students(sid,majid,sname,gender,snative,birthday) values('S20120101002','0101','赵四','M','四川','1992-01-14');
insert into Students(sid,majid,sname,gender,snative,birthday) values('S20120101003','0101','王五','M','四川','1992-01-14');
insert into Students(sid,majid,sname,gender,snative,birthday) values('S20120101004','0101','张三','M','上海','1992-01-14');
insert into Students(sid,majid,sname,gender,snative,birthday) values('S20120101005','0101','张三','M','四川','1992-01-14');
insert into Students(sid,majid,sname,gender,snative,birthday) values('S20120101006','0101','张三','M','广州','1992-01-14');
insert into Students(sid,majid,sname,gender,snative,birthday) values('S20120101007','0101','张三','M','四川','1992-01-14');
insert into Students(sid,majid,sname,gender,snative,birthday) values('S20120101008','0101','张三','M','北京','1992-01-14');
insert into Students(sid,majid,sname,gender,snative,birthday) values('S20120101009','0101','张三','M','四川','1992-01-14');
insert into Students(sid,majid,sname,gender,snative,birthday) values('S20120101010','0101','张三','M','四川','1992-01-14');
insert into Students(sid,majid,sname,gender,snative,birthday) values('S20120101011','0101','张三','M','四川','1992-01-14');
insert into Students(sid,majid,sname,gender,snative,birthday) values('S20120101012','0101','张三','M','四川','1992-01-14');











