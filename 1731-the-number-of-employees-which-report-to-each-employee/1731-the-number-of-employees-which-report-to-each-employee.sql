/* Write your PL/SQL query statement below */
select e.employee_id,e.name,count(e1.employee_id)"reports_count"
,round(avg(e1.age))"average_age"
from employees e join employees e1
on e.employee_id =e1.reports_to
group by e.employee_id,e.name
order by employee_id;