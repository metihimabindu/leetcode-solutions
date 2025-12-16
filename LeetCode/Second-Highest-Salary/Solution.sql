1select max(salary) AS SecondHighestSalary
2from Employee
3WHERE salary<(select max(salary) from Employee); 
4