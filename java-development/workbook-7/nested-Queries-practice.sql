USE sakila;

--- nested quiries 
-- find the films with the maximum replacement cost
SELECT film_id, title, replacement_cost
FROM film
WHERE replacement_cost = (SELECT MAX(replacement_cost) 
							FROM film);
                            
-- finding matching films that include documentary inside the description
-- single result use = , multip result use "IN" 
SELECT title, length
FROM film
WHERE film_id IN (SELECT film_id
					FROM film_text
WHERE description LIKE "%DOCUMENTARY%");



                            

