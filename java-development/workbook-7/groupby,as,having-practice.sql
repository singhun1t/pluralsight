USE sakila;
-- using group by 
SELECT rating, count(*)
FROM film
GROUP BY rating;
------------------------------------
SELECT rating, AVG(rental_rate)
FROM film
GROUP BY rating;
------------------------------------
-- using as, can give nicknames
SELECT  rating, AVG(rental_rate) as avg_rate
FROM film
GROUP BY rating;
-------------------------------------
-- having clause
SELECT  rating, COUNT(*)
FROM film
GROUP BY rating
HAVING COUNT(*) >=200
ORDER BY rating;
-------------------------------------
