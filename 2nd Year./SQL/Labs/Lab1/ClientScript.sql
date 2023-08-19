DROP TABLE CLIENT PURGE; -- this allows me to run the script more than once.
CREATE TABLE CLIENT (
CNo NUMBER(6) PRIMARY KEY,
CCurrent CHAR  DEFAULT 'Y' CHECK (CCurrent IN ('Y','N')),
CName varchar2(50) NOT NULL,
CDateOfBirth DATE NOT NULL,
CAmountOwed Number(7,2),
CEMail VARCHAR2(50) NULL UNIQUE,
CNoChildren NUMBER(2) DEFAULT 0,
CRenewDate DATE DEFAULT SYSDATE+365,
CHECK (CRenewDate > CDateOfBirth + 6209));
--First insert
INSERT INTO CLIENT(
CNO, CCURRENT, CNAME, CDATEOFBIRTH, CAMOUNTOWED, CEMAIL, CNOCHILDREN, CRENEWDATE)
 VALUES (
654321, 'Y', 'Fred', '23-FEB-1960', 0,
'FRED@CLUB.IE', 2, '01-DEC-21');
--Describe the table
DESCRIBE CLIENT;
INSERT INTO CLIENT(CNO, CNAME, CDATEOFBIRTH) VALUES (123456, 'Harry Houdini','24-Mar-1874');
select * from client;
--Exploring errors
-- Adding a new row with the same primary key value:

INSERT INTO CLIENT VALUES (654321,'Y','Freddy','13-Mar-78',0,'FRED@CLUB.IE',0,'01-MAR-21');

--Adding a new row with an e-mail value that is already used
INSERT INTO CLIENT VALUES (654322, 'Y', 'Freddy', '13-Mar-78', 0, 'FRED@CLUB.IE',0, '01-MAR-21' );
-- And one that works
INSERT INTO CLIENT VALUES (654322,'Y','Freddy','13-Mar-78',0,'FREDDY@CLUB.IE',0,'01-MAR-21');
-- Check constraint violation
INSERT INTO CLIENT VALUES (654324,'y','Marty','13-Mar-58',0,'Marty@CLUB.IE',0,'01-MAR-21');
-- NOT NULL violation
INSERT INTO CLIENT (CNo, CName, CRenewDate) VALUES(654325, 'Harry','01-DEC-2021');
-- And corrected:
INSERT INTO CLIENT (CNo, CName, CDateOfBirth) VALUES(654325, 'Harry','01-JAN-1995');
COMMIT;
--ROLLBACK; -- Try commenting out the commit and running rollback instead
select * from client;