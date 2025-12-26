1select distinct author_id as id
2from Views
3where author_id=viewer_id
4order by author_id;
5