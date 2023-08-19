select * from cr_consumer;

--Q2
drop view crispeaten;
create view crispeaten as
select CN_Name, cp_name from CR_Consumer
join cr_has_eaten using (ConsumerID)
join cr_crisp_type using (crispkey);

select cn_name from crispeaten
where cp_name = 'Cheese and Onion'

minus

select cn_name from crispeaten
where cp_name = 'Salt and Vinegar';

--Q3 
select cn_name from cr_consumer eater
where not exists
(
    select crispkey from cr_crisp_type crisp
    where not exists
    (
        select * from cr_has_eaten hasEaten
        where eater.consumerID = haseaten.consumerid
        and crisp.crispkey = hasEaten.crispkey
        
    )
);

--Q4
drop view crispeaten;
create view crispeaten as
select CN_Name, cp_name from CR_Consumer
join cr_has_eaten using (ConsumerID)
join cr_crisp_type using (crispkey);

select cn_name from crispeaten
where cp_name = 'Cheese and Onion'
minus
(
    select cn_name from crispeaten
    where cp_name != 'Cheese and Onion'
);

--Q5
drop view crispeaten;
create view crispeaten as
select CN_Name, cp_name from CR_Consumer
join cr_has_eaten using (ConsumerID)
join cr_crisp_type using (crispkey);

select cn_name from crispeaten
where cp_name = 'Cheese and Onion'
union
select cn_name from crispeaten
where cp_name = 'Salt and Vinegar'
minus
(
    select cn_name from crispeaten
    where cp_name = 'Cheese and Onion'
    intersect 
    select cn_name from crispeaten
    where cp_name = 'Salt and Vinegar'
);

--Q6
select cn_name from CR_Consumer
where consumerID not in 
(
    select consumerID from cr_has_eaten
);

--Q7
drop view crispeaten;
create view crispeaten as
select CN_Name, cp_name from CR_Consumer
join cr_has_eaten using (ConsumerID)
join cr_crisp_type using (crispkey);

select cn_name from crispeaten
where cp_name = 'Cheese and Onion'

intersect

select cn_name from crispeaten
where cp_name = 'Salt and Vinegar';





