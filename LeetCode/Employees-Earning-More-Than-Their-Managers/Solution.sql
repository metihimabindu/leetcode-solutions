1select e2.name as Employee
2from Employee e1 join Employee e2
3on e1.id=e2.managerId 
4where e1.salary<e2.salary;
5