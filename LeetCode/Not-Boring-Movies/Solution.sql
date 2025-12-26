1select * from(select * 
2from Cinema 
3where id%2=1 and description!='boring')o
4order by rating desc;
5