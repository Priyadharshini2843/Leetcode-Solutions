/* Write your PL/SQL query statement below */
SELECT unique_id, name FROM EmployeeUNI U
RIGHT JOIN Employees E
ON E.id = U.id;