1select id,case
2      when p_id is null then 'Root'
3      when id in (select p_id from Tree) then 'Inner'
4      else 'Leaf'
5      end as type
6from Tree;
7