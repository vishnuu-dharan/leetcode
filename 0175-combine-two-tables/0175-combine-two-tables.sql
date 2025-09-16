# Write your MySQL query statement below
-- select P.firstName,P.lastName  ,A.city,A.state from Person P inner join Address A on P.personId=A.personId
SELECT 
    p.firstName, 
    p.lastName, 
    a.city, 
    a.state
FROM Person p
 left JOIN Address a 
    ON p.personId = a.personId;
