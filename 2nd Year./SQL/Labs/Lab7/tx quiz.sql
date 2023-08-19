--select * from cat;
drop table enrolled;
 drop table module;
 drop table student;
 create table student(
 sid char(9) primary key,
 sname varchar(50) not null);
 insert into student values ('C10101010','Dwayne');
 insert into student values ('C11111111','Venus');
 insert into student values ('C12121212','Tonya');
 insert into student values ('C13131313','James');
 
 create table module(
 modcode char(8) primary key,
 modname varchar(50) not null,
 ECTS integer,
 pctCA integer, check(pctCA between 0 and 100),
 pctEX integer, check(pctEX between 0 and 100));
 insert into module values('CMPU2007','Databases 1',5, 50,50);
 insert into module values('CMPU2016','Object Oriented Programming',10,50,50);
 insert into module values('CMPU2021','Sys Infra and Arch', 5,30,70);
 
 create table enrolled(
 sid char(9) not null references student,
 modcode char(8) not null references module,
 semyr char(6) not null,
 ca_result integer,
 ex_result integer,
 primary key (sid, modcode, semyr));
 insert into enrolled values ('C10101010', 'CMPU2021', 'S21910',23,40);
 insert into enrolled values ('C10101010', 'CMPU2021', 'S21911',60,83);
 insert into enrolled values ('C11111111', 'CMPU2021', 'S21911',80,63);
 insert into enrolled values ('C11111111', 'CMPU2007', 'S21911',85,60);
 insert into enrolled values ('C11111111', 'CMPU2016', 'Y1911',55,49);
 insert into enrolled(sid, modcode, semyr) values ('C13131313', 'CMPU2021','S22021');
 insert into enrolled(sid, modcode, semyr) values ('C13131313', 'CMPU2016','Y2021');
 insert into enrolled(sid, modcode, semyr) values ('C13131313', 'CMPU2007','S22021');
 commit;
