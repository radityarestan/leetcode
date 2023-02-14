# Write your MySQL query statement below
Select name FROM SalesPerson
Where sales_id NOT IN (
    Select Distinct(O.sales_id)
    From Orders O
    Join Company C on O.com_id = C.com_id
    Where C.name = "RED"
);