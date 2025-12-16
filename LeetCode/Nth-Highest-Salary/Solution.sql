1CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
2BEGIN
3  DECLARE off INT; 
4  SET off=N-1;
5  RETURN (
6     select distinct salary 
7     From Employee
8     order by salary DESC
9     limit 1 offset off
10  );
11END