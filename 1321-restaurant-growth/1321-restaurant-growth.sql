/* Write your PL/SQL query statement below */
select to_char(visited_on) as visited_on, tot as amount, round(tot/7,2) as average_amount 
from (
    select distinct visited_on,
    sum(amount) over ( order by visited_on
    range between interval '6' day preceding and current row ) as tot,
    dense_rank() over (order by visited_on) as days
    from customer
)
where days>=7
order by visited_on;