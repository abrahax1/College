SET SERVEROUTPUT ON 
DECLARE
    HH_CustNo Customers.customer_no%type:='&customer_no';
    HH_ContractNo Contract.contract_no%type:='&contract_no';
    HH_ScheduleID Schedule.schedule_id%type:='&schedule_id';
    HH_ShipmentNo Contract_Schedule.shipment_no%type:='&shipment_no';
    HH_DriverNo Driver.driver_no%type:='&driver_no';
    HH_CarReg Car.car_reg%type:='&car_reg';
    
    HH_Customer integer;
    HH_Contract integer;
    HH_Schedule integer;
    HH_Driver integer;
    HH_Car integer;
    HH_Price integer;
    HH_Option integer;
    
BEGIN
    select count(*) into HH_Customer from Customers
    where customer_no = HH_CustNo;
    
    select count(*) into HH_Contract from Contract
    where contract_no = HH_ContractNo; 

    select price into HH_Price from Contract
    where contract_no = HH_ContractNo; 
  
    select count(*) into HH_Schedule from Schedule
    where schedule_id = HH_ScheduleID; 
    
    select count(*) into HH_Driver from Driver
    where driver_no = HH_DriverNo;
    
    select count(*) into HH_Car from Car
    where car_reg = HH_CarReg;
    
    if (HH_Customer = 1 and HH_Contract = 1) then
        insert into customers_contract (customer_no, contract_no)
        values (HH_CustNo, HH_ContractNo);
        dbms_output.put_line('Customer Number: ' || HH_CustNo || ' Contract Number: '|| HH_ContractNo);
    
        if (HH_Schedule = 1) then
            insert into Contract_Schedule (shipment_no, contract_no, schedule_id)
            values (HH_ShipmentNo, HH_ContractNo, HH_ScheduleID);
            dbms_output.put_line('Shipment Number: ' || HH_ShipmentNo || ' Contract Number: '|| HH_ContractNo || ' ' || ' Schedule ID: '|| HH_ScheduleID);
        
        else if (HH_Schedule = 0) then
            dbms_output.put_line('Schedule not found');
            end if;
        end if;
    
        if (HH_Driver = 1) then
            insert into Driver_Schedule (driver_no, schedule_id)
            values (HH_DriverNo, HH_ScheduleID);
            dbms_output.put_line('Driver Number: ' || HH_DriverNo  || ' Schedule ID: '|| HH_ScheduleID);
            
        else if (HH_Driver = 0) then
            dbms_output.put_line('Schedule not found');
            end if;
        end if;
    
        if (HH_Car = 1) then
            insert into Driver_Car (driver_no, car_reg)
            values (HH_DriverNo, HH_CarReg);
            dbms_output.put_line('Driver Number: ' || HH_DriverNo  || ' Car Registration: '|| HH_CarReg);
            
        else if (HH_Car = 0) then
            dbms_output.put_line('Driver not found');
            end if;
        end if;
    
    else if (HH_Customer = 0 or HH_Contract = 0) then
      dbms_output.put_line('Customer or Contract not found');
        end if;    
    end if;  
    
    update c_record 
    set customer_debt =  customer_debt + HH_Price
    where customer_no = HH_CustNo;
    dbms_output.put_line('Customer debt updated by: ' || HH_Price);
    
    commit;
    
END;