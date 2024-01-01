# Write your MySQL query statement below
# Actors and directors who cooperated at least three movies
select actor_id, director_id from ActorDirector group by actor_id, director_id having count(timestamp)>=3