# Write your MySQL query statement below
#Duplicate emails
select email from Person group by email having count(email)>1