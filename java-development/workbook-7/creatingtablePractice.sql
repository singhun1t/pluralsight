-- Creating tables
USE sakila; 

CREATE TABLE advertisments(-- create table with name
AdID int NOT NULL PRIMARY KEY AUTO_INCREMENT , -- specify adid column that is an int and can't be set to null
Title varchar(50) NOT NULL, -- create title column with string that can't be null with 50 speces
MagicCode varchar (9),
PerfectOff float NOT NULL, -- accepts float 
isPotato BOOLEAN NOT NULL
-- PRIMARY KEY (AdId) -- set the primary key for reference, but we set it up on top instead
) ;