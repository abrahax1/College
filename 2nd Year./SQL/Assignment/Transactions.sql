SELECT * FROM Abraham.Child_Table;

--TRANSACTIONS WITH PROMPTING VALUES
SELECT * FROM ABRAHAM.Child_Table WHERE Course LIKE '%&Course%' AND grade LIKE '%&Grade%';
SELECT * FROM ABRAHAM.Child_Table WHERE  Age LIKE '%&Age%' AND Skills LIKE '%&Skills%';

--UPDATES
UPDATE ABRAHAM.Child_Table SET First_Name = '&First_Name' WHERE C_ID = &C_ID;
UPDATE ABRAHAM.Child_Table SET Grade = '&Grade' WHERE C_ID = &C_ID;

COMMIT;