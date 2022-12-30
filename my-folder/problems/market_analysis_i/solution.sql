# Write your MySQL query statement below
select user_id AS buyer_id, join_date, COUNT(buyer_id)
AS orders_in_2019 FROM Users LEFT JOIN  Orders ON Users.user_id = Orders.buyer_id AND order_date LIKE '2019%'
GROUP BY user_id;

# select user_id as buyer_id, join_date, count(buyer_id) as orders_in_2019 from users left join orders on users.user_id = orders.buyer_id and order_date like '2019%' group by user_id
