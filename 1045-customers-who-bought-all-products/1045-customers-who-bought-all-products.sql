# Write your MySQL query statement below
select Customer_id 
from Customer
group by customer_id
having count(distinct(product_key)) = (select count(product_key) from Product)