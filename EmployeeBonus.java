# Write your MySQL query statement below
# Employee Bonus
select Employee.name, Bonus.bonus from Employee left outer join
Bonus on Employee.empId = Bonus.empId where Bonus.bonus<1000 or Bonus.bonus is null