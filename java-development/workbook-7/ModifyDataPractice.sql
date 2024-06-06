-- inserting, deleting etc
-- THESE ARE UPDATING ON SAKILA DATABASE

INSERT INTO country(country_id, country, last_update)  -- columns where info to be updated
VALUES (110, "Zimbabwe", now() );   -- VALUES TO BE INSERTED, now() returns current date and time

INSERT INTO country  -- another way to insert, do need to write columns
VALUES(112, "potato land", now()); -- need to match value in every column

--- update information inside table
UPDATE customer -- table name
SET first_name = "PATTY", last_name = "JOHNSTON"-- what you want to update info to
WHERE customer_id = 2; -- where the primary key is, make sure we are only updating the specific person

SET SQL_SAFE_UPDATES = 0; -- TURN OFF SAFE UPDATES TO UPDATE WITHOUT PRIMARY KEY, THEN TURN BACK ON AFTER
UPDATE customer				-- in some cases , we have to do without a primary key
SET first_name = "PATRICE"
WHERE first_name = "PATTY";
SET SQL_SAFE_UPDATES = 1; -- TURN SAFE UPDATES BACK ON 

-- DELETE DATA, most companies do not delete, but make the row null
DELETE FROM payment -- specify what table to delete from
WHERE payment_id = 100;
