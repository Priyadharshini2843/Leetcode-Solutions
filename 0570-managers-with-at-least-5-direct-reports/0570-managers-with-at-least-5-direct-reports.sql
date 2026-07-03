/* Write your PL/SQL query statement below */
select w1.name from employee w1 join employee w2
on w1.id = w2.managerid
group by w1.id,w1.name
having count(*) >= 5; 