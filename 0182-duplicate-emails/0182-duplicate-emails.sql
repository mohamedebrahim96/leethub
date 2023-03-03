# Write your MySQL query statement below
select email
from Person
group by email
HAVING count(email)>1