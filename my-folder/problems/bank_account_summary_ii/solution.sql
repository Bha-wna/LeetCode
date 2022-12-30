# Write your MySQL query statement below
# SELECT name,  SUM(amount) AS balance FROM Users, Transactions WHERE balance >10000 AND balance IN
SELECT  name,SUM(amount) AS balance FROM Users,Transactions WHERE Users.account = Transactions.account  GROUP BY Transactions.account HAVING balance>10000; 