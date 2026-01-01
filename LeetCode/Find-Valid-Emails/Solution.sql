1select user_id,email
2from Users
3where email regexp '^[a-zA-Z0-9_]+@[a-zA-z]+\\.com$' 
4order by user_id asc;
5