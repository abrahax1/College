--Q1
SELECT * FROM CR_HAS_EATEN;
SELECT * FROM cr_consumer;
SELECT * FROM CR_CRISP_TYPE;

--Q2
CREATE VIEW Consumed AS SELECT CN_NAME, CP_NAME FROM cr_crisp_type, CR_Consumer;
SELECT * FROM Consumed;

GRANT SELECT ON Consumed TO click;

--Q3
--QA
DESCRIBE CR_crisp_type; 
INSERT INTO cr_crisp_type VALUES('&&crispkey', '&CP_Name'); 
UNDEFINE crispkey;

--QB
DESCRIBE CR_has_eaten;
INSERT INTO cr_has_eaten VALUES('&&ConsumerID', '&&Crispkey', &&Quantity);
UNDEFINE ConsumerID, Crispkey;

--QC
/* CONSUMED VIEW */

--QD

--QE
COMMIT;

--QF 
/* UNDEFINE DONE IN PREVIOUS QUESTIONS */

--QG 
SELECT * FROM Consumed;
