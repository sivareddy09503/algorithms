# Write your MySQL query statement below
# Department highest salary
select  d.name as Department, e.name as Employee, e.salary as Salary from Department d, Employee e where d.id = e.departmentId and (e.departmentId, salary) in (select departmentId, max(salary) from employee group by departmentId)