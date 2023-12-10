# Write your MySQL query statement below
# Customers who never order
select c.name Customers from Customers c left outer join Orders o on c.id=o.customerId where o.customerId is null