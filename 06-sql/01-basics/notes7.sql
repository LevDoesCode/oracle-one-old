SELECT * FROM tbproducts;

INSERT INTO tbproducts(
	product, name, container, volume, flavor, price)
    VALUES (
    '11223344', 'Festival de Sabores', 'Bottle PET', '1.5 liters', 'Asaí', 18.51);
    
SELECT * FROM tbproducts;

INSERT INTO tbproducts(
	product, name, container, volume, flavor, price)
    VALUES (
    '11223344', 'Festival de Sabores', 'Bottle PET', '1.5 liters', 'Asaí', 18.51);

SELECT * FROM tbproducts;

ALTER TABLE tbproducts ADD PRIMARY KEY (product); -- Error, there are duplicate entries

DELETE FROM tbproducts WHERE product = '11223344'; -- We need to delete the duplicate records first

ALTER TABLE tbproducts ADD PRIMARY KEY (product);

DELETE FROM tbproducts
	WHERE product = '773912'
    LIMIT 1; -- We delete only one occurrence

SELECT * FROM tbproducts;

ALTER TABLE tbproducts ADD PRIMARY KEY (product); -- Now we can add our primary key
