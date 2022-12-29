# Write your MySQL query statement below
# SELECT DISTINCT author_id AS id FROM Views WHERE Views.author_id IN 
# (SELECT DISTINCT Views.viewer_id FROM Views) 
# ORDER BY author_id;
select distinct author_id as id from views 
where author_id = viewer_id
order by id