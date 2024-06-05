USE northwind;

-- Question 1
SELECT count(*) as supplierCount
FROM suppliers;

-- Question 2
SELECT SUM(Salary) as TotalSalary
FROM employees;

-- Question 3
SELECT min(UnitPrice) as MinimumPrice
FROM products;

-- Question 4
SELECT avg(UnitPrice) as AveragePrice
FROM products;

-- Question 5
SELECT max(UnitPrice) as MaxPrice
FROM products;

-- Question 6
SELECT SupplierID, count(*) as ItemCount
FROM products
GROUP BY SupplierID;

-- Question 7
SELECT CategoryID, avg(UnitPrice) as avg_price
FROM products
Group by CategoryID;

-- Question 8
SELECT SupplierID, Count(*) as itemcount
FROM products
Group by SupplierID
Having itemcount >=5;

-- Question 9
SELECT ProductID, ProductName, (UnitsInStock * UnitPrice) as inventory_value
FROM products
Order by inventory_value desc, ProductName;