# Write your MySQL query statement below
SELECT event_day AS day, emp_id, ABS(SUM(OUT_TIME) - SUM(in_time))AS total_time FROM Employees GROUP BY event_day,emp_id;