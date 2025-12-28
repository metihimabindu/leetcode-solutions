1update Salary 
2set sex=case
3 when sex="m" then "f"
4 when sex="f" then "m"
5 end;
6