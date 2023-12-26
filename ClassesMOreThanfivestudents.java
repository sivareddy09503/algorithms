# Write your MySQL query statement below
#Classes more than 5 students
select class from Courses group by class having count(class)>=5