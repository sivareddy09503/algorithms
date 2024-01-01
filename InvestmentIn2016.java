# Write your MySQL query statement below
# Investments in 2016
select Round(Sum(tiv_2016), 2) as tiv_2016 from Insurance
where tiv_2015 in (select tiv_2015 from insurance group by tiv_2015 having count(*)>1) and (lat,lon) in (select lat, lon from insurance group by lat,lon having count(*)=1)