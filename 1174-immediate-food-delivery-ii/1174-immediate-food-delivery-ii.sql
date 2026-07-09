/* Write your PL/SQL query statement below */
SELECT ROUND(COUNT (CASE WHEN A.order_date =

A.customer_pref_delivery_date THEN 1 ELSE NULL END ) * 100 / count(*),

2) immediate_percentage from delivery A WHERE A.order_date = 

(SELECT MIN(order_date) FROM  delivery B WHERE B.customer_id =

A.customer_id)