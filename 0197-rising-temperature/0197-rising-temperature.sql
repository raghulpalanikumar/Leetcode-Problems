# Write your MySQL query statement below
select s.id from Weather s,Weather e where DATEDIFF(s.recordDate,e.recordDate)=1 and s.temperature > e.temperature;