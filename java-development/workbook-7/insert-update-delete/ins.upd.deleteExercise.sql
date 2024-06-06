USE northwind;

-- Question 1
INSERT INTO suppliers
VALUES (30, "SINGH INDUSTRIES","MANVIR SINGH", "OWNER", "144 BROWN STREET","PITTSBURGH","PA","15245","USA","412-554-2314"," ", " ");

-- Question 2
INSERT INTO products
VALUES(78,"WOMBUTS",30, 7, "10 PER BOX", 13.5, 12,2,5,0);

-- Question 3
SELECT p.ProductName, p.ProductID, s.CompanyName
FROM products p
LEFT JOIN suppliers s ON s.SupplierID = p.SupplierID;

-- Question 4
UPDATE products 
SET  UnitPrice =  UnitPrice * 1.15
WHERE ProductID = 78;

-- Question 5
Select p.ProductName, p.UnitPrice, s.CompanyName
From products p
LEFT JOIN suppliers s ON s.SupplierID = p.SupplierID
WHERE s.SupplierID = 30;

-- Question 6
Delete from products
Where ProductID = 78;

-- Question 7
Delete from suppliers
Where SupplierID = 30;

-- Question 8
Select * FROM Products;

-- Question 9
Select * FROM suppliers;
