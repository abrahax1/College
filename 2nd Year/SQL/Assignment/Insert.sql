--REQUIREMENTS TABLE INSERTS
INSERT INTO Requirements VALUES (1,'Maths',16,'Programming','Honours Maths');
INSERT INTO Requirements VALUES (2,'Programming',15,'Maths','Java');
INSERT INTO Requirements VALUES (3,'Databases',17,'Programming','SQL');
INSERT INTO Requirements VALUES (4,'WebDev, Databases',18,'AI','AI WebDev');
INSERT INTO Requirements VALUES (5,'GameDev',12,'Maths','Game Dev');
INSERT INTO Requirements VALUES (6,'Robotics',17,'WebDev','Robotics');

--TEACHERS TABLE INSERTS
INSERT INTO Teachers VALUES (12813,'Jonathan','Walters','1');
INSERT INTO Teachers VALUES (27348,'Gabriela','Tamas','3');
INSERT INTO Teachers VALUES (8358,'Roger','Johnson','2');
INSERT INTO Teachers VALUES (84234,'Laura','Noon','4');
INSERT INTO Teachers VALUES (567812,'Claire','Rose','5');
INSERT INTO Teachers VALUES (14402,'Fernando','Torres','1');

--CHILDRENS TABLE INSERTS
INSERT INTO Childrens VALUES (12345,'David','White',12,'Maths','5');
INSERT INTO Childrens VALUES (12342,'Camilla','Perns',14,'Programming','1');
INSERT INTO Childrens VALUES (145,'Raul','Johnson',16,'GameDev','2');
INSERT INTO Childrens VALUES (876543,'Rachael','Sun',17,'WebDev','3');
INSERT INTO Childrens VALUES (123,'Juan','Duch',15,'Programming','2');
INSERT INTO Childrens VALUES (988,'Louise','Keqing',13,'Robotics','5');
INSERT INTO Childrens VALUES (689,'Isabella','Lemon',16,'Databases','4');
INSERT INTO Childrens VALUES (421,'Bob','Yumer',18,'Networking','3');

--GRADES TABLE INSERTS
INSERT INTO Grades VALUES ('A','Yes','Yes', 12345);
INSERT INTO Grades VALUES ('B','Yes','Yes', 12342);
INSERT INTO Grades VALUES ('C','Yes','Yes', 145);
INSERT INTO Grades VALUES ('D','No','No', 876543);
INSERT INTO Grades VALUES ('E','No','No', 123);
INSERT INTO Grades VALUES ('C','Yes','Yes', 988);
INSERT INTO Grades VALUES ('A','Yes','Yes', 689);
INSERT INTO Grades VALUES ('C','Yes','Yes', 421);

COMMIT;

