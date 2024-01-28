# Write your MySQL query statement below
# Calculate special bonus
select employee_id, case when employee_id%2 <> 0 and name not like 'M%' then salary else 0 end as bonus from employees order by employee_id