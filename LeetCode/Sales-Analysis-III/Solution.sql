1select  p.product_id,p.product_name
2from Product p
3join Sales s
4on p.product_id=s.product_id
5group by p.product_id,p.product_name
6having min(s.sale_date)>= '2019-01-01' and max(s.sale_date)<='2019-03-31'
7;