SELECT * FROM tbclients;

SELECT * FROM tbclients WHERE DOB = '1970-01-01';

SELECT * FROM tbclients WHERE DOB < '1970-01-01';

SELECT * FROM tbclients WHERE YEAR(DOB) = '1970';
SELECT * FROM tbclients WHERE YEAR(DOB) = 1970;
SELECT * FROM tbclients WHERE DAY(DOB) = 1;
SELECT * FROM tbclients WHERE DAY(DOB) = 4;

SELECT * FROM tbproducts;

SELECT * FROM tbproducts WHERE price;

SELECT * FROM tbproducts WHERE container LIKE 'PET%';