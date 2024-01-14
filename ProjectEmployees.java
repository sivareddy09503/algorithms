# Write your MySQL query statement below
# Find Project employees
select P.project_id, round(avg(E.experience_years), 2) as average_years from Employee E right join Project P on P.employee_id = E.employee_id group by P.project_id order by P.project_id asc