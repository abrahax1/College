DROP TABLE driver_schedule;
DROP TABLE driver_car;
DROP TABLE car;
DROP TABLE driver;
CREATE TABLE car (
    car_reg           VARCHAR2(12) NOT NULL PRIMARY KEY,
    make              VARCHAR2(40),
    service_startdate VARCHAR2(20),
    lastdate_service  VARCHAR2(20),
    mileage           NUMBER(38)
);

CREATE TABLE driver (
    driver_no         NUMBER(38) NOT NULL PRIMARY KEY,
    driver_name       VARCHAR2(50),
    homedepot         VARCHAR2(60),
    working_startdate VARCHAR2(20)
);

--Weak Entity 1
CREATE TABLE driver_car (
    driver_no     NUMBER(38) NOT NULL,
    FOREIGN KEY (driver_no)
    REFERENCES driver(driver_no),
    
    car_reg      VARCHAR2(12) NOT NULL,
    FOREIGN KEY (car_reg)
    REFERENCES car(car_reg)
);

DROP TABLE customers_contract;
DROP TABLE contract_schedule;
DROP TABLE schedule;
DROP TABLE contract;
DROP TABLE c_record;
DROP TABLE customers;

CREATE TABLE customers (
    customer_no   NUMBER(38) NOT NULL PRIMARY KEY,
    cust_name     VARCHAR2(50),
    address       VARCHAR2(50)
);

CREATE TABLE c_record (
    record_id         NUMBER(38) NOT NULL PRIMARY KEY,
    credit_limit      NUMBER(38),
    customer_debt     NUMBER(38),
    customer_no       NUMBER(38) NOT NULL,
    FOREIGN KEY (customer_no)
    REFERENCES customers(customer_no)
);

CREATE TABLE contract (
    contract_no     NUMBER(38) NOT NULL PRIMARY KEY,
    price           NUMBER(38)
);

--Weak Entity 2
CREATE TABLE customers_contract (
    customer_no     NUMBER(38) NOT NULL,
    FOREIGN KEY (customer_no)
    REFERENCES customers(customer_no),
    
    contract_no      NUMBER(38) NOT NULL,
    FOREIGN KEY (contract_no)
    REFERENCES contract(contract_no)
    
);

CREATE TABLE schedule (
    schedule_id     NUMBER(38) NOT NULL PRIMARY KEY,
    start_date      VARCHAR2(20),
    end_date        VARCHAR2(20),
    start_time      VARCHAR2(20),
    end_time        VARCHAR2(20),
    origin          VARCHAR2(80),
    destination     VARCHAR2(80),
    s_description   VARCHAR2(50)
);

--Weak Entity 3
CREATE TABLE contract_schedule (
    shipment_no          NUMBER(38) NOT NULL,
    
    contract_no    NUMBER(38) NOT NULL,
    FOREIGN KEY (contract_no)
    REFERENCES contract(contract_no),
    
    schedule_id       NUMBER(38) NOT NULL,
    FOREIGN KEY (schedule_id)
    REFERENCES schedule(schedule_id)
);
           
--Weak Entity 4                 
CREATE TABLE driver_schedule (
    driver_no    NUMBER(38) NOT NULL,
    FOREIGN KEY (driver_no)
    REFERENCES driver(driver_no),
    
    schedule_id  NUMBER(38) NOT NULL,
    FOREIGN KEY (schedule_id)
    REFERENCES schedule(schedule_id)
);
