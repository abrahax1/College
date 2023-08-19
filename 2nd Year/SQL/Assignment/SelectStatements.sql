--SELECT 
SELECT * FROM Requirements;
SELECT * FROM Teachers;
SELECT * FROM Childrens;
SELECT * FROM Grades;

--BASIC SELECTS WITH CONDITIONS 
SELECT COUNT(*) FROM Grades;
SELECT * FROM Childrens WHERE Course = 2 AND Age = 15;

--INNER JOIN (i wanted to get the records that had matching values in both tables)
SELECT * FROM Childrens INNER JOIN Requirements 
ON Childrens.Skills = Requirements.Previous_Skills 
AND Childrens.Age = Requirements.Age_Group;

--OUTER JOIN (selects the records from the teachers table and matching records from the requirements table)
SELECT * FROM Teachers LEFT JOIN Requirements
ON Teachers.Course = Requirements.Course_ID;

--UNION (Combines the results of the two selects)
SELECT C_ID, First_Name FROM Childrens 
UNION SELECT C_ID, Proeficient FROM Grades
ORDER BY C_ID;

--MINUS (Select records cid, name from children table minus records of the cid and grade from grade table
SELECT C_ID, First_Name FROM Childrens MINUS SELECT C_ID, Grade FROM GRADES;

--VIEW (wanted to create a view so that there is a backup)
CREATE OR REPLACE VIEW Child_Table AS SELECT * FROM Childrens 
JOIN Grades USING (C_ID);

--SELECT VIEW
SELECT * FROM Child_Table;
SELECT * FROM Child_Table WHERE Course >= 3 AND Age >= 11;

--Allows click schema to select, update, insert values in the view created above
GRANT SELECT ON Child_Table TO Click;
GRANT UPDATE ON Child_Table TO Click;
GRANT INSERT ON Child_Table TO Click;
