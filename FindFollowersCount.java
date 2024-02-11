# Write your MySQL query statement below
# Find followers count
select user_id, count(user_id) as followers_count from Followers group by user_id order by user_id asc, followers_count asc