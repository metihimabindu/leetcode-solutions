1select e2.unique_id,e1.name 
2from Employees e1
3left join EmployeeUNI e2
4on e1.id=e2.id;