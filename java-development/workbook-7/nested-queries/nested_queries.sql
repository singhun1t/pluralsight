USE northwind;
-- Exercise 4 intro to SQL
-- Question 1
SELECT ProductName, UnitPrice
FROM products
WHERE UnitPrice  IN (Select Max(UnitPrice) 
					FROM products);

-- Question 2
SELECT OrderID, ShipName, ShipAddress, ShipVia
FROM orders
Where ShipVia IN (Select ShipVia FROM shippers WHERE ShipVia = 3);

-- or (better solution)
SELECT OrderID, ShipName, ShipAddress
FROM orders
Where ShipVia = (Select ShipperID FROM shippers WHERE CompanyName = 'Federal Shipping');

-- Question 3 
SELECT OrderID
FROM orders
Where OrderID IN (Select OrderID FROM `order details` WHERE ProductID =34);

-- or (better solution)
SELECT OrderID
FROM `Order Details`
Where ProductID = (Select ProductID FROM products WHERE ProductName = 'Sasquatch Ale');

-- Question 4
SELECT FirstName, LastName
FROM employees
Where EmployeeID = (Select EmployeeID FROM orders  WHERE OrderID = 10266);

-- Question 5
SELECT CompanyName
From customers
where CustomerID = (Select CustomerID FROM orders WHERE OrderID = 10266);


