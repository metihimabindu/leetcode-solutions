1select id,
2   sum(case when month='Jan' then revenue end) as Jan_Revenue,
3   sum(case when month='Feb' then revenue end) as Feb_Revenue,
4   sum(case when month='Mar' then revenue end) as Mar_Revenue,
5   sum(case when month='Apr' then revenue end) as Apr_Revenue,
6   sum(case when month='May' then revenue end) as May_Revenue,
7   sum(case when month='Jun' then revenue end) as Jun_Revenue,
8   sum(case when month='Jul' then revenue end) as Jul_Revenue,
9   sum(case when month='Aug' then revenue end) as Aug_Revenue,
10   sum(case when month='Sep' then revenue end) as Sep_Revenue,
11   sum(case when month='Oct' then revenue end) as Oct_Revenue,
12   sum(case when month='Nov' then revenue end) as Nov_Revenue,
13   sum(case when month='Dec' then revenue end) as Dec_Revenue
14   from Department
15   group by id;