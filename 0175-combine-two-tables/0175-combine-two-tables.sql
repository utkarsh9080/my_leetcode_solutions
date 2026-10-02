# Write your MySQL query statement below
SELECT firstName,lastName,city,state
FROM Person e
Left JOIN Address d
ON e.personid = d.personid