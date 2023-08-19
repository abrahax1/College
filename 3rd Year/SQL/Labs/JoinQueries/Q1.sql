--A
Select stock_code, stock_description From b2_stock Where unit_price < unitCostPrice;

--B
select stock_code, stock_description From b2_stock Where reorder_level = 0;

--C
Select customer_name from b2_customer 
left join b2_corder
on b2_customer.customer_id = b2_corder.customer_id
where b2_corder.corderno is NULL;

--D
Select stock_description from b2_stock 
inner join b2_corderline on b2_stock.stock_code = b2_corderline.stock_code  
inner join b2_corder on b2_corderline.corderno = b2_corder.corderno
inner join b2_customer on b2_corder.customer_id = b2_customer.customer_id 
where b2_customer.customer_name = 'John Flaherty';

--E
select supplier_name from b2_supplier
left join b2_sorder on b2_sorder.supplier_id = b2_supplier.supplier_id
where b2_sorder.sorderno is Null;

 --F
 select customer_id from b2_corder
 inner join b2_corderline on b2_corder.corderno = b2_corderline.corderno
 inner join b2_stock on b2_corderline.stock_code = b2_stock.stock_code
 where b2_stock.stock_code = 'A101' or b2_stock.stock_code = 'A111';
 
 --G
 select staffpaid from b2_corder;
 select staff_no from b2_staff;
 select Staffissued from b2_corder;
 
 --H
 select staff_name;
 
 --I 
 select customer_id from 