-- EXAM
CREATE SEQUENCE student1
START WITH 1
INCREMENT BY 1
MINVALUE 1
MAXVALUE 20000000
NOCYCLE;

--select * FROM student1, module, cr_consumer

INSERT INTO student VALUES('&sid','&&sname'); 
UNDEFINE sname;

SELECT INTO student1 VALUES('sid','sname');

COMMIT;