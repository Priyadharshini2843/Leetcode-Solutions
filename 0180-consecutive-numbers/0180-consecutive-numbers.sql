/* Write your PL/SQL query statement below */
select distinct consecutivenums from (
    select (case
     when num = (lead(num,1) over (order by id)) and
          num = (lead(num,2) over (order by id))
     then num 
     end) as consecutivenums from logs)
where consecutivenums is not null;