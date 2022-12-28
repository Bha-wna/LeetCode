# Write your MySQL query statement below

# SELECT salary as SecondHighestSalary FROM Employee WHERE salary < (SELECT MAX(salary) FROM Employee) ORDER BY salary DESC LIMIT 1 ;

SELECT max(salary) as SecondHighestSalary FROM Employee WHERE salary < (SELECT MAX(salary) FROM Employee) ORDER BY salary;