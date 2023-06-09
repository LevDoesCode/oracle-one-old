SELECT * FROM tbclients;

SELECT ID, NAME FROM tbclients;

SELECT ID AS 'ID Number', NAME FROM tbclients;

SELECT * FROM tbproducts;

SELECT * FROM tbproducts WHERE flavor = 'orange';

UPDATE tbproducts SET flavor = 'Orange' WHERE flavor = 'orange';

SELECT * FROM tbproducts;

SELECT * FROM tbproducts WHERE product >= 900000;

SELECT * FROM tbclients;

SELECT * FROM tbclients WHERE age >= 39;

SELECT * FROM tbclients WHERE age < 39;

SELECT * FROM tbclients WHERE age <> 39; -- Other than 39

SELECT * FROM tbproducts;

SELECT * FROM tbproducts WHERE name < 'Festival';

SELECT * FROM tbproducts;

SELECT * FROM tbproducts WHERE price BETWEEN 12.00 AND 17.00;
