1select round(sum(tiv_2016),2) as tiv_2016 from Insurance i 
2join(select lat,lon
3from Insurance 
4group by lat,lon
5having count(*)<=1 )t1
6on t1.lat=i.lat and t1.lon=i.lon
7 join (select tiv_2015
8from Insurance
9group by tiv_2015
10having count(*)>1)t2
11on i.tiv_2015=t2.tiv_2015;
12