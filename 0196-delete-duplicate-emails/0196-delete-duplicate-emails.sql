/* Write your PL/SQL query statement below */
DELETE FROM Person 
WHERE id NOT IN (select min(id) from Person 
GROUP BY email);