# Write your MySQL query statement below


select 

event_day as day, 
emp_id, 
SUM(out_time - in_time) as total_time

From Employees 
GROUP by 1,2