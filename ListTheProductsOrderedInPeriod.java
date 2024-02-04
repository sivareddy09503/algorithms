# Write your MySQL query statement below
# List the products ordered in a period
select P.product_name, Sum(O.unit) as unit from Products P join Orders O on P.product_id = O.product_id where O.order_date between '2020-02-01' and '2020-02-29' group by P.product_id having unit>=100