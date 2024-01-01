# Write your MySQL query statement below
# Managers with at least 5 direct reports
select name from Employee where id in (select managerId from Employee group by managerId having count(*)>=5)