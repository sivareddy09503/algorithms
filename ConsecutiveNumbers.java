# Write your MySQL query statement below
# consecutive numbers
select distinct i1.num as ConsecutiveNums from logs i1, logs i2, logs i3
where i1.id = i2.id+1 AND i2.id=i3.id+1 AND i1.num=i2.num AND i2.num = i3.num