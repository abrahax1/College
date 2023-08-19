/*
MY_HOTEL MY_BOOKING tables.

1.	Connect to your own schema.  Upload the file createhotel.sql and run it.
*/

drop table h_hotel;

  CREATE TABLE H_HOTEL
   (	HOTEL_NO    NUMBER(6)     PRIMARY KEY, 
        H_NAME      VARCHAR2(20)  NOT NULL, 
        ADDRESS     VARCHAR2(50)  NOT NULL
        
   );
   
Insert into H_HOTEL (HOTEL_NO,H_NAME,ADDRESS) values (300,'Royal Herberton','16 The Way, Riverside, D14');
Insert into H_HOTEL (HOTEL_NO,H_NAME,ADDRESS) values (301,'Grand','Malahide');
Insert into H_HOTEL (HOTEL_NO,H_NAME,ADDRESS) values (302,'Arlington Hotel','Bachelors Walk, Dublin 1');
Insert into H_HOTEL (HOTEL_NO,H_NAME,ADDRESS) values (400,'Gresham Hotel','O''Connell St., Dublin 1');
Insert into H_HOTEL (HOTEL_NO,H_NAME,ADDRESS) values (401,'Burlington Hotel','Upper Leeson St., Dublin');
Insert into H_HOTEL (HOTEL_NO,H_NAME,ADDRESS) values (402,'Ashling Hotel','Parkgate St., Dublin');
Insert into H_HOTEL (HOTEL_NO,H_NAME,ADDRESS) values (403,'Camden Court Hotel','Lower Camden St., Dublin');
Insert into H_HOTEL (HOTEL_NO,H_NAME,ADDRESS) values (404,'Fitzwilliam Hotel','St. Stephens Green, Dublin');
Insert into H_HOTEL (HOTEL_NO,H_NAME,ADDRESS) values (500,'Central Hotel','Exchequer St., Temple Bar, Dublin');
COMMIT;
