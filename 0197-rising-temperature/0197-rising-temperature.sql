# Write your MySQL query statement below
select id from weather as w where w.temperature > (select temperature from Weather where recordDate = DATE_ADD(w.recordDate, INTERVAL -1 DAY))
