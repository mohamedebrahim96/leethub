# Write your MySQL query statement below
select 
unique_id, name

from employees as e
left join
employeeuni as eu
on e.id = eu.id
;