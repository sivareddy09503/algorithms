# Write your MySQL query statement below
#Find the person who has the most friends
select id, count(*) as num
from(select requester_id as id from requestAccepted union all 
select accepter_id from requestaccepted) as friends_count 
group by id order by num desc limit 1;