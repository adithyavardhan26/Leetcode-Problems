# Write your MySQL query statement below
Select score, DENSE_RANK() OVER (ORDER BY Score DESC) As "Rank"
FROM Scores;