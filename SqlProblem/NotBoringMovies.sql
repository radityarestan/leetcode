# Write your MySQL query statement below
Select *
From Cinema
Where description != "boring" AND (id % 2 = 1)
Order By rating Desc;