# Write your MySQL query statement below
SELECT C.name as Customers
FROM (CUSTOMERS C
LEFT JOIN ORDERS O ON C.id = O.customerId
) 
WHERE O.id IS NULL;