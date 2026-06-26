/* Write your PL/SQL query statement below */
select user_id, upper(substr(lower(name),1,1)) || substr(lower(name),2) as name from users order by user_id;