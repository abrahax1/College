set SERVEROUTPUT on 
DECLARE
    V_sno sh_staff.staff_no%type:='&staff_no';
    V_scode sh_stock.stock_code%type:='&stock_code';
    V_qty sh_sale.quantity%type:='&quantity';
    V_transac integer;
    V_stock integer;
    V_quantity integer;

BEGIN
    select count(*) into V_transac from sh_staff
    where staff_no = V_sno;
    
    select count(*) into V_stock from sh_stock
    where stock_code = V_scode; --A11111
    
    select quantityinstock into V_quantity from sh_stock
    where stock_code = V_scode; 
    
    if (V_transac = 1 and V_stock = 1) then
        if (V_qty <= V_quantity) then
            insert into sh_sale (stock_code, staff_no, saledate, quantity)
            values (V_scode, V_sno, sysdate, V_qty);
            dbms_output.put_line('Stock: ' || v_scode || 
            '/ Staff: '|| v_sno || '/ Date: ' || sysdate || '/ Quantity: ' || v_qty);
            update sh_stock 
            set quantityinstock = quantityinstock - v_qty
            where stock_code = v_scode;
            commit;
            
        else 
            dbms_output.put_line('not enough stock');
        end if;
        
    else if (V_transac = 0 or V_stock = 0) then
        dbms_output.put_line('Staff Not found');
        
        end if;
    end if;
    
END;