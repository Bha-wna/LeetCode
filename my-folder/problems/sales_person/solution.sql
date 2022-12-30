# Write your MySQL query statement below
# SELECT SalesPerson.name FROM SalesPerson WHERE SalesPerson.sales_id != Orders.sales_id
# UNION

# SELECT Orders.com_id, Orders.sales_id FROM Orders,Company WHERE Orders.com_id = Company.com_id  AND Orders.sales_id NOT IN (SELECT Company.com_id WHERE Company.name LIKE 'RED')GROUP BY sales_id;
# SELECT Orders.sales_id FROM Orders WHERE Orders.sales_id IN
# SELECT Orders.com_id, Orders.sales_id FROM Orders order by Orders.sales_id AND Orders.com_id NOT IN (SELECT com_id FROM Company WHERE Company.name LIKE 'RED'); 

SELECT s.name
FROM
    salesperson s
WHERE
    s.sales_id NOT IN (SELECT
            o.sales_id
        FROM
            orders o
                LEFT JOIN
            company c ON o.com_id = c.com_id
        WHERE
            c.name = 'RED');


# SELECT  o.sales_id FROM Orders o LEFT JOIN Company c ON o.com_id = c.com_id WHERE c.name = 'RED';