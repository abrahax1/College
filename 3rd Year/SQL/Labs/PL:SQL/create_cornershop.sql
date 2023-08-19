DROP TABLE sh_SALE;
DROP TABLE sh_STAFF;
DROP TABLE sh_stock;
DROP TABLE sh_supplier;
CREATE TABLE sh_supplier (
  supplier_id number(8) primary key,
  sname varchar2(40) not null,
  sph char(13)
);
INSERT INTO sh_supplier VALUES (1040,'Cadbury','5555555');
INSERT INTO sh_supplier VALUES (1050,'Tayto','5555555');
INSERT INTO sh_supplier VALUES (1060,'Eason','5555555');
INSERT INTO sh_supplier VALUES (1070,'Tesco','5555555');

CREATE TABLE sh_stock (
       stock_code      CHAR(8) primary key,
       supplier_id number(8) not null references sh_supplier,
       stock_name      VARCHAR2(20),
       QuantityInstock INTEGER,
       price           NUMBER(5,2)
);
INSERT INTO sh_stock VALUES ('A11111',1060,'Notepad',20,2.95);
INSERT INTO sh_stock VALUES ('A11112',1060,'Blue biro',40,.55);
INSERT INTO sh_stock VALUES ('A11113',1060,'Red biro',40,.55);
INSERT INTO sh_stock VALUES ('A11114',1060,'Ring binder',10,2.60);
INSERT INTO sh_stock VALUES ('A11115',1060,'Eraser',40,.30);
INSERT INTO sh_stock VALUES ('B11111',1040,'Snack bar',24,.80);
INSERT INTO sh_stock VALUES ('B11112',1040,'Chocolate bar',24,.80);
INSERT INTO sh_stock VALUES ('E11111',1050,'Cheese+onion crisps',24,.70);
INSERT INTO sh_stock VALUES ('D11111',1070,'Chicken sandwich',24,2.95);
INSERT INTO sh_stock VALUES ('F11111',1070,'Mineral drink',12,2.20);
INSERT INTO sh_stock VALUES ('C11111',1060,'Newspaper',12,1);
--
select * from sh_supplier natural join sh_stock;


CREATE TABLE sh_Staff (
       Staff_no   NUMBER(5) PRIMARY KEY,
       Staff_name VARCHAR2(25) NULL
);


INSERT INTO sh_STAFF VALUES (1, 'Damian');
INSERT INTO sh_STAFF VALUES (2, 'Bing');
INSERT INTO sh_STAFF VALUES (3, 'Fred');
INSERT INTO sh_STAFF VALUES (4, 'Deirdre');
INSERT INTO sh_STAFF VALUES (5, 'Richard');
INSERT INTO sh_STAFF VALUES (6, 'Patricia');
INSERT INTO sh_STAFF VALUES (7, 'June');
INSERT INTO sh_STAFF VALUES (8, 'Mark');
--

CREATE TABLE sh_sale (
       stock_code CHAR(8) REFERENCES sh_stock,
       Staff_no   NUMBER(5) REFERENCES sh_STAFF,
       SaleDate   DATE,
       quantity   INTEGER,
       PRIMARY KEY (stock_code, Staff_no, SaleDate)
);

desc sh_sale;
select * from sh_sale;

INSERT INTO sh_sale(stock_code, staff_no, saledate,quantity) 
VALUES ('A11111',
1,
SYSDATE-8,
1);
select * from sh_stock where stock_code = 'A11111';
select * from sh_staff where staff_no = 1;
INSERT INTO sh_sale VALUES ('A11111',1,SYSDATE-7,1);
INSERT INTO sh_sale VALUES ('A11111',1,SYSDATE-6,3);
INSERT INTO sh_sale VALUES ('B11111',1,SYSDATE-5,2);
INSERT INTO sh_sale VALUES ('B11111',2,SYSDATE-5,2);
INSERT INTO sh_sale VALUES ('B11112',1,SYSDATE-5,2);
INSERT INTO sh_sale VALUES ('B11112',2,SYSDATE-5,2);
INSERT INTO sh_sale VALUES ('C11111',1,SYSDATE-4,1);
INSERT INTO sh_sale VALUES ('A11111',3,SYSDATE-3,1);
INSERT INTO sh_sale VALUES ('A11114',3,SYSDATE-2,1);
INSERT INTO sh_sale VALUES ('E11111',3,SYSDATE-1,1);
INSERT INTO sh_sale VALUES ('F11111',3,SYSDATE-9,1);
INSERT INTO sh_sale VALUES ('D11111',3,SYSDATE-10,2);
INSERT INTO sh_sale VALUES ('A11111',5,SYSDATE-12,1);
INSERT INTO sh_sale VALUES ('A11112',1,SYSDATE-4,1);
INSERT INTO sh_sale VALUES ('A11113',1,SYSDATE-4,1);
INSERT INTO sh_sale VALUES ('A11114',1,SYSDATE-4,1);
INSERT INTO sh_sale VALUES ('A11115',1,SYSDATE-4,1);
INSERT INTO sh_sale VALUES ('D11111',1,SYSDATE-4,1);
INSERT INTO sh_sale VALUES ('E11111',1,SYSDATE-4,1);
INSERT INTO sh_sale VALUES ('F11111',1,SYSDATE-4,1);
commit;
grant select on sh_supplier to public;
grant select on sh_stock to public;
grant select on sh_staff to public;
grant select on sh_sale to public;
