1select name 
2from Employee
3where id in (select e1.id
4from Employee e1
5join Employee e2
6on e1.id=e2.managerId
7group by e1.id
8having count(e1.id)>=5);
9