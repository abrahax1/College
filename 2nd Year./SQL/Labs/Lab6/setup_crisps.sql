 drop table CR_HAS_EATEN;
 drop table cr_consumer;
 drop table CR_CRISP_TYPE;
 CREATE TABLE CR_CRISP_TYPE 
   (CRISPKEY CHAR(10), 
	CP_NAME VARCHAR2(28), 
	 PRIMARY KEY (CRISPKEY)) ;
  Insert into CR_CRISP_TYPE (CRISPKEY,CP_NAME) values ('ChAndOnion','Cheese and Onion');
Insert into CR_CRISP_TYPE (CRISPKEY,CP_NAME) values ('SNVinegar ','Salt and Vinegar');
Insert into CR_CRISP_TYPE (CRISPKEY,CP_NAME) values ('Buffalo   ','Buffalo');
Insert into CR_CRISP_TYPE (CRISPKEY,CP_NAME) values ('SCrAndCh  ','Sour Cream and Chives');

  
 CREATE TABLE CR_CONSUMER 
   (	CONSUMERID CHAR(3), 
	CN_NAME CHAR(18), 
	 PRIMARY KEY (CONSUMERID));
Insert into CR_CONSUMER (CONSUMERID,CN_NAME) values ('J  ','John              ');
Insert into CR_CONSUMER (CONSUMERID,CN_NAME) values ('A  ','Anne              ');
Insert into CR_CONSUMER (CONSUMERID,CN_NAME) values ('K  ','Ken               ');
Insert into CR_CONSUMER (CONSUMERID,CN_NAME) values ('B  ','Barney            ');
  
  
  CREATE TABLE CR_HAS_EATEN 
   (	CONSUMERID CHAR(3) NOT NULL REFERENCES CR_CONSUMER, 
	CRISPKEY CHAR(10) NOT NULL REFERENCES CR_CRISP_TYPE, 
	QUANTITY NUMBER(7), 
	 PRIMARY KEY (CRISPKEY, CONSUMERID));
Insert into CR_HAS_EATEN values ('J  ','ChAndOnion',4);
Insert into CR_HAS_EATEN values ('J  ','SNVinegar ',3);
Insert into CR_HAS_EATEN values ('J  ','Buffalo   ',3);
Insert into CR_HAS_EATEN values ('J  ','SCrAndCh  ',1);
Insert into CR_HAS_EATEN values ('K  ','ChAndOnion',2);
Insert into CR_HAS_EATEN values ('K  ','SNVinegar ',1);
Insert into CR_HAS_EATEN values ('A  ','ChAndOnion',4);
commit;
grant select on cr_crisp_type to public;
grant select on cr_consumer to public;
grant select on cr_has_eaten to public;