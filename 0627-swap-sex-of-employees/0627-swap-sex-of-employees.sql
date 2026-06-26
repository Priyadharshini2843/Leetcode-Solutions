/* Write your PL/SQL query statement below */
UPDATE salary
set sex = 
CASE
 WHEN sex ='m' then 'f'
WHEN sex= 'f' then 'm'
END;