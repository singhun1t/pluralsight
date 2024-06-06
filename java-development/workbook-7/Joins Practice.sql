-- inner join takes what is common between both tables
-- left join takes everything from left table and what is common between both
-- right join takes everything from right table and what is commone between both
USE join_employee_pay;
-- inner join example
SELECT employee.id, first_name, last_name, description, min_val, max_val
FROM employee
JOIN pay_grade
	ON employee.pay_grade_id = pay_grade.id;
    

