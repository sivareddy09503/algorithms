# Write your MySQL query statement below
# Product sales anlaysis 
select P.product_name, S.year, S.price from Product P left join Sales S on P.product_id = S.product_id where S.year is not null