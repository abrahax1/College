select * from cat;
describe cc_stock;
select stockcode,stockname,costprice,saleprice from cc_stock where supplierid = 50100;
select stockcode,stockname,to_char(costprice,'U999,999,999.99')costprice,to_char(saleprice,'U999,999,999.99')saleprice from cc_stock where supplierid = 50100;
select stockcode,stockname,costprice,saleprice, saleprice-costprice profit from cc_stock where supplierid = 50100;
select stockcode,stockname,costprice,saleprice, saleprice-costprice profit from cc_stock where supplierid = 50100 order by profit;
select stockcode,stockname,costprice,saleprice, saleprice-costprice profit from cc_stock where supplierid = 50100 order by profit desc;
select 'The stock item ' || stockcode || ' is a ' || stockname from cc_stock where supplierid = 50100;
