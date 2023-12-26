# Write your MySQL query statement below
#Sales Person with no orders
select s.name from SalesPerson s where s.sales_id not in (select o.sales_id from Orders o join Company c on c.com_id = o.com_id where c.name = 'RED')