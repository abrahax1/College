DROP TABLE Teachers;
DROP TABLE Grades;
DROP TABLE Childrens;
DROP TABLE Requirements;

CREATE TABLE Requirements
(
    Course_ID        NUMBER(6)   PRIMARY KEY,
    Course           VARCHAR(60),
    Age_Group        NUMBER(2),   
    Previous_Skills  VARCHAR(60),
    Cert_Given       VARCHAR(60)
     
);

CREATE TABLE Teachers
(
    T_ID                NUMBER(6) PRIMARY KEY,
    First_Name          VARCHAR(50),
    Surname             VARCHAR(50),
    Course              NUMBER(6),
    FOREIGN KEY(Course) REFERENCES Requirements(Course_ID)
    
);

CREATE TABLE Childrens
(
    C_ID                NUMBER(6) PRIMARY KEY,
    First_Name          VARCHAR(50),
    Surname             VARCHAR(50),
    Age                 Number(2),
    Skills              VARCHAR(60),
    Course              NUMBER(6),
    FOREIGN KEY(Course) REFERENCES REQUIREMENTS(Course_ID)
    
);

CREATE TABLE Grades
(
    Grade             VARCHAR(1),
    Proeficient       VARCHAR(3),
    Give_Cert         VARCHAR(3),
    C_ID              NUMBER(6) PRIMARY KEY,
    FOREIGN KEY(C_ID) REFERENCES Childrens(C_ID)
    
);
