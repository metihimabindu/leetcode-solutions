1select c.name
2from SalesPerson c
3where c.sales_id not in(select o.sales_id
4from Orders o
5left join Company c
6on o.com_id=c.com_id
7where c.name='red');
8