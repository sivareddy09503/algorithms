# Write your MySQL query statement below
# Find total time spent by each employee
select EVENT_DAY as DAY, EMP_ID, SUM(out_time-in_time) AS TOTAL_TIME from Employees group by day, emp_id