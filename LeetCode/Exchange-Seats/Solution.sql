1select case
2    when id%2=1 and id<(select count(*) from Seat) then id+1
3    when id%2=0 then id-1
4    else id 
5    end as id,student
6    from Seat
7    order by id asc;
8
9