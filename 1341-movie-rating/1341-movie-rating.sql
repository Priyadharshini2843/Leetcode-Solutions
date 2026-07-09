/* Write your PL/SQL query statement below */
select results from
(select u.name as results from users u
join movierating mr 
on u.user_id = mr.user_id 
group by u.user_id,u.name
order by count(mr.user_id) desc, u.name
)
where rownum =1

union all

select results from 
(select m.title as results from movies m
join movierating mr 
on m.movie_id = mr.movie_id
where created_at like '2020-02-%'
group by m.movie_id,m.title
order by avg(mr.rating) desc, m.title)
where rownum=1;