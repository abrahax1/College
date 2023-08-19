select * from movies;
/* Q1 */
select count(mtitle) from movies;
/* Q2 */
select distinct genre from movies;
/* Q3 */
select genre, count(1) from movies group by genre;
/* Q4 */
select genre, max(running_time), min(running_time) from movies group by genre;
/* Q5 */
select genre, count(1) from movies
    where running_time between 90 and 180
    group by genre;
    
/* Q6 */
select genre, rating, count(1) from movies 
    group by genre, rating;

/* Q7 */
select genre, rating, count(1) from movies 
    group by genre, rating
    order by count(1) desc;

/* Q8 */
select rating, genre, count(1) from movies
    group by rating, genre;

/* Q9 */
select rating, count(1) from movies
    group by rating; 
    
/* Q10 */
select rating, count(1) from movies 
    where box_office > 66
    group by rating;
