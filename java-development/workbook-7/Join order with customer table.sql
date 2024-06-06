USE join_customer_order;

-- only shows orders that contain customer id matching the id of the second table, will not show orders with null order id
SELECT order.id, sold_date, name, email
FROM `order`
JOIN customer
	ON order.customer_id = customer.id;
    
-- how to hand null order ids using left outer join
SELECT order.id, sold_date, name, email
FROM `order`
LEFT JOIN customer
	ON order.customer_id = customer.id;
    
-- naming convention to target specific tables
SELECT o.id, o.sold_date, c.name, c.email -- have to specify o.id to refer to id within that table, because multiple ids
FROM `order` o -- o is the nickname given to order
LEFT JOIN customer c ON o.customer_id = c.id; -- c refers to customer and o is set to order
