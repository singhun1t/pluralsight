-- Question 1:
-- products table

-- Question 2:
SELECT ProductID, ProductName, UnitPrice
FROM northwind.products;

-- Question 3:

SELECT ProductID, ProductName, UnitPrice
FROM northwind.products
ORDER BY  UnitPrice; 

-- Question 4

SELECT ProductID, ProductName, UnitPrice
From northwind.products
Where UnitPrice <= 7.50;

-- Question 5
SELECT ProductID, ProductName, UnitsInStock
From northwind.products
WHERE UnitsInStock >= 100
order by UnitsInStock desc;

-- Question 6
SELECT ProductID, ProductName, UnitsInStock, UnitPrice 
From northwind.products
WHERE UnitsInStock >= 100
order by UnitPrice desc, ProductName;

-- Question 7
SELECT ProductID, ProductName, UnitsInStock, UnitPrice, UnitsOnOrder 
From northwind.products
WHERE UnitsInStock = 0 AND UnitsOnOrder >0
ORDER BY ProductName;

-- Question 8
-- Categories table

-- Question 9 
SELECT *
From northwind.categories;
-- Seafood is category 8 id

-- Question 10
-- by Category ID
SELECT *
From northwind.products
Where CategoryID = 8;

-- Question 11
Select FirstName, LastName
From northwind.employees;

-- Question 12
Select FirstName, LastName, Title
From northwind.employees
Where Title like "%manager%";

-- Question 13
Select distinct Title
From northwind.employees;

-- Question 14
Select *
From northwind.employees
Where Salary between 2000 and 2500;

-- Question 15
Select *
From northwind.suppliers;

-- Question 16
-- Supplier ID shows what supplier supplied each products
Select *
From northwind.products
Where SupplierID = 4;

