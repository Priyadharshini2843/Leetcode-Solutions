/* Write your PL/SQL query statement below */
select person_name from 
(select person_name, sum(weight) over (order by turn) as max_weight from queue 
order by max_weight desc)
where max_weight <= 1000 and rownum=1;