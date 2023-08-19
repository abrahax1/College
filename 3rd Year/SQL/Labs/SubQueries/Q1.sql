--Q1 Name staff members who sold notepads.
select staff_name from sh_staff
where staff_no in 
(
    select staff_no from sh_sale sale where sale.stock_code in
    (
        select stock_code from sh_stock stock where lower(stock.stock_name) like '%notepad%'
    )
);

--Q2 Name staff members that sold nothing.
select staff_name from sh_staff
where staff_no not in 
(
    select staff_no from sh_sale
);

--Q3 Name staff members that sold both notepads and chocolate bars.
drop view staffsold;

create view staffsold as
select staff_name, stock_name from sh_staff
join sh_sale using (staff_no)
join sh_stock using (stock_code);

select staff_name from staffsold
where stock_name = 'Chocolate bar'

intersect

select staff_name from staffsold
where stock_name = 'Notepad';

--Q4 Name staff members that sold either notepads or chocolate bars, but not both
select staff_name from staffsold
where stock_name = 'Chocolate bar'
union
select staff_name from staffsold
where stock_name = 'Notepad'
minus
(
    select staff_name from staffsold
    where stock_name = 'Chocolate bar'
    intersect 
    select staff_name from staffsold
    where stock_name = 'Notepad'
);

--Q5 Name staff members that only sold notepads.
select staff_name from staffsold
where stock_name = 'Notepad'
minus
(
    select staff_name from staffsold
    where stock_name != 'Notepad'
);

--Q6 Name staff members that have sold all stock.
select staff_name from sh_staff staffna
where not exists
(
    select stock_code from sh_stock stock
    where not exists
    (
        select * from sh_sale sale
        where staffna.staff_no = sale.staff_no
        and stock.stock_code = sale.stock_code
    )
);

--Q7 Name staff members that have sold all stock supplied by Cadbury
select staff_name from sh_staff where staff_no in 
(
    select staff_no from sh_sale sale where sale.stock_code in
    (
        select stock_code from sh_stock stock where stock.supplier_id in
        (
            select supplier_id from sh_supplier supplier where supplier.sname = 'Cadbury'
        )
    )
);


-- QUIZ 1 ANSWERS 
--Q2 
drop view Students_OnClub;

create view Students_OnClub as
select Sname, Cname from lt_student
join lt_joined using (Sno)
join lt_club using (clubid);


select Sname from Students_OnClub
where Cname = 'Swimming'
minus
(
    select sname from Students_OnClub
    where Cname = 'Musical'

);

--Q3
select Sname from lt_student student
where not exists
(
    select Cname from lt_club club
    where not exists
    (
        select * from lt_joined joined
        where student.sno = joined.sno
        and club.clubid = joined.clubid
    )
);

--Q4
select sname from lt_student
where sno not in 
(
    select sno from lt_joined
);

