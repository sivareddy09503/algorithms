# Write your MySQL query statement below
# Replace employee id with unique identifier
select U.unique_id, E.name from Employees E left join EmployeeUNI U on U.id = E.id