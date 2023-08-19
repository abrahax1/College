--Table 1

--alter table h_hotel
--add nightly_fee varchar(50);
--
--insert into h_hotel (nightly_fee) VALUES (150);
--
--select * from h_hotel;


-- Table 2
drop table my_booking;

create table my_booking
(
    BookCode        Number(8)   Primary Key,
    StartDate       Date,
    EndDate         Date,
    Hotel_No        Number(9)
    
);

ALTER TABLE my_booking
  ADD CONSTRAINT CheckEndLaterThanStart
  CHECK (EndDate >= StartDate);

insert into my_booking values (12345678, '10-jan-2021', '11-jan-2021', 1);
insert into my_booking values (23456789, '12-feb-2021', '20-feb-2021', 2);
insert into my_booking values (34567891, '24-jun-2021', '29-jun-2021', 3);
insert into my_booking values (45678912, '15-dec-2021', '25-dec-2021', 502);
commit;

select * from my_booking;
select * from my_booking where hotel_no < 500;
