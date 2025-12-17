1SELECT email as Email
2FROM Person
3GROUP BY email
4HAVING COUNT(*) > 1;
5
6