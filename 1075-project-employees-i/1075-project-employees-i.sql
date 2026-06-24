/* Write your PL/SQL query statement below */
select p.project_id, ROUND(SUM(e.experience_years)/COUNT(*),2) AS average_years
from project p join employee e on p.employee_id = e.employee_id group by p.project_id;