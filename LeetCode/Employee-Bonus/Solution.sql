1select e.name,b.bonus 
2from Employee e
3left join Bonus b
4on e.empId=b.empid 
5where b.bonus<1000 or b.bonus is null;
6