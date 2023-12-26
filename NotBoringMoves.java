# Write your MySQL query statement below
# Not boring movies
select id, movie, description, rating from Cinema where id%2!=0  and description not like '%boring%' order by rating desc