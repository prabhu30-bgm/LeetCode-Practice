# Write your MySQL query statement below
select e.name as employee 
from Employee e
join Employee m
 on e.managerid = m.id
 where e.salary > m.salary; 