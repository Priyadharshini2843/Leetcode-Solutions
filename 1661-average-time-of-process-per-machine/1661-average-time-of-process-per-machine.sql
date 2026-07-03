/* Write your PL/SQL query statement below */
select a.machine_id, round(avg(p.timestamp-a.timestamp),3) processing_time
from activity a join activity p
on a.machine_id = p.machine_id and
a.process_id = p.process_id
and a.activity_type = 'start'
and p.activity_type = 'end'
group by a.machine_id;