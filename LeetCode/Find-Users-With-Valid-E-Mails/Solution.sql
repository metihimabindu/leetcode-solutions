-- Final Query 

select user_id, name, mail
from Users
where right(mail,13) = '@leetcode.com'                          -- domain name is @leetcode.com
and left(mail,LEN(mail) - 13) LIKE '[A-Za-z]%'                  -- first part of email is staring with letter either Capital / small 
and left(mail,LEN(mail) - 13) NOT LIKE '%[^A-Za-z0-9._-]%'   

-- %[^A-Za-z0-9._-]% signifies all the characters expect 'A-Z','a-z','0-9','.','_','-' which are supposed to be irrelevant characters 
-- and we are using "NOT LIKE" to filter out the irrelevant characters which we found via the mentioned expression