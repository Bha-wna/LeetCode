# Write your MySQL query statement below
SELECT name as customers FROM Customers WHERE id NOT IN(SELECT customerId FROM Orders);