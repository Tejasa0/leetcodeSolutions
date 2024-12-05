# Write your MySQL query statement below
SELECT 
    CASE 
        WHEN COUNT(*) > 1 THEN (SELECT salary FROM (SELECT * FROM employee ORDER BY salary DESC LIMIT 2) AS e ORDER BY salary ASC LIMIT 1)
        ELSE NULL 
    END AS SecondHighestSalary
FROM employee;
