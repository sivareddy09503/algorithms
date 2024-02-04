# Write your MySQL query statement below
# Article Views
select distinct author_id as id from Views where author_id = viewer_id order by id