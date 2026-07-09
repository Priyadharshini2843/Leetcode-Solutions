/* Write your PL/SQL query statement below */
SELECT round(sum(tiv_2016),2) tiv_2016 from (
    select pid, tiv_2015, tiv_2016, lat, lon,
    count(*) over (partition by tiv_2015) as cnt_2015,
    count(*) over (partition by lat,lon) as cnt
    FROM INSURANCE
)
where cnt_2015 > 1
and cnt = 1;

