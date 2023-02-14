# Write your MySQL query statement below
Select customer_number
From Orders
Group By customer_number
Order By COUNT(*) Desc
LIMIT 1;