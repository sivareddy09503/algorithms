# Write your MySQL query statement below
#Triangle judgement
select *, case when x+y>z and x+z>y and z+y>x then 'Yes' else 'No' end as triangle from triangle

