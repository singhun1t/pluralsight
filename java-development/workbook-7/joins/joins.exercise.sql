USE northwind;

-- Question 1
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryID, c.CategoryName
FROM products p
INNER JOIN categories c ON c.CategoryID = p.CategoryID
Order by  CategoryName, ProductName;

-- Question 2
SELECT p.ProductID, p.ProductName, p.UnitPrice, s.CompanyName as shippers
FROM products p
Inner Join suppliers s ON s.SupplierID = p.SupplierID
Where UnitPrice > 75
Order by p.ProductName;

-- Question 3
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryName, s.CompanyName
FROM products p
INNER JOIN categories c ON c.CategoryID = p.CategoryID
INNER JOIN suppliers s ON s.SupplierID = p.SupplierID
Order by p.ProductName;

-- Question 4
SELECT p.ProductName, c.CategoryName, p.UnitPrice
FROM products p
INNER JOIN categories c ON c.CategoryID = p.CategoryID
WHERE p.UnitPrice = (SELECT max(UnitPrice) FROM products);

-- Question 5
SELECT o.OrderID,o.ShipName, o.ShipAddress, s.CompanyName
From orders o
INNER JOIN shippers s ON s.ShipperID = o.ShipVia
Where o.ShipCountry = "Germany";

-- Question 6
SELECT o.OrderID, o.OrderDate, o.ShipName, o.ShipAddress
From orders o
INNER JOIN `order details` od ON o.OrderID = od.OrderID
INNER JOIN products p ON p.ProductID = od.ProductID
WHERE ProductName = "Sasquatch Ale";
