1select s1.score, (select count(distinct s2.score) from Scores as s2 where s2.score>= s1.score)as `rank`
2from Scores as s1
3order by s1.score desc;
4