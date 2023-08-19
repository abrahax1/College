--MINUS (A - B) (selects drivers names with Dublin as origin and removes the ones with Cork as origin)
DROP VIEW DriverView;
CREATE VIEW DriverView AS
SELECT driver_name, origin FROM Driver
JOIN Driver_Schedule USING (driver_no)
JOIN Schedule USING (schedule_id);

SELECT Driver_Name FROM DriverView
WHERE origin = 'DUBLIN'
MINUS
(
    SELECT Driver_Name FROM DriverView
    WHERE origin = 'CORK'
);

--INTERSECT (A ∩ B) (selects all that has start date 13-Oct-21 and rows that has 07MH4443 as car registration)
DROP VIEW CarView;
CREATE VIEW CarView as
SELECT car_reg, start_date, end_date, driver_no FROM Car
JOIN driver_car USING (car_reg)
JOIN driver USING (driver_no)
JOIN driver_schedule USING (driver_no)
JOIN schedule USING (schedule_id);

SELECT * FROM CarView
WHERE start_date = '13-Oct-21'
INTERSECT
SELECT * FROM CarView
WHERE car_reg = '07MH4443';

-- UNION (A U B) (selects all cars that has 08C65432 and 06G54333)
SELECT * FROM CarView
WHERE car_reg = '08C65432'
UNION
SELECT * FROM CarView
WHERE car_reg = '06G54333';

--UNION / INTERSECT (A xor B) (selects all drivers that have origin DUBLIN and CORK but not both)
SELECT driver_name FROM DriverView
WHERE origin = 'DUBLIN'
union
SELECT driver_name FROM DriverView
WHERE origin = 'CORK'
MINUS
(
    SELECT driver_name FROM DriverView
    WHERE origin = 'DUBLIN'
    INTERSECT
    SELECT driver_name FROM DriverView
    WHERE origin = 'CORK'
);

--INNER JOIN (selects only what has a match in the left side and right side)
SELECT schedule.schedule_id, contract.contract_no FROM schedule
INNER JOIN contract_schedule on contract_schedule.schedule_id = schedule.schedule_id 
INNER JOIN contract on contract_schedule.contract_no = contract.contract_no;

--LEFT JOIN (selects all from the left side, even if the don't have a match)
SELECT schedule.schedule_id, contract.contract_no FROM schedule
LEFT JOIN contract_schedule on contract_schedule.schedule_id = schedule.schedule_id 
LEFT JOIN contract on contract_schedule.contract_no = contract.contract_no;

--FULL JOIN (selects all from left and right side, even if they don't have a match)
SELECT schedule.schedule_id, contract.contract_no FROM schedule
JOIN contract_schedule on contract_schedule.schedule_id = schedule.schedule_id 
FULL JOIN contract on contract_schedule.contract_no = contract.contract_no;

--AGGREGATION / HAVING (selects all customers_no in the customers_contract table, 
--counts them and groups them by contract_no then selects only those whose count is >= 2
SELECT COUNT(customer_no), contract_no FROM Customers
JOIN Customers_Contract USING (customer_no)
JOIN Contract USING (contract_no)
GROUP BY contract_no
HAVING COUNT(customer_no) >= 2;

--A - ¬A (selects all from A - all thats not in A)
SELECT * FROM DriverView
WHERE origin = 'DUBLIN'
minus
(
    SELECT * FROM DriverView
    WHERE origin = 'CORK'
);

--CORRELATED SUBQUERIES (selects all customers that have a higher debt than the average) 
SELECT record_id, customer_debt FROM C_Record
WHERE customer_debt >
    (
        SELECT AVG(customer_debt)
        FROM C_Record
    );

