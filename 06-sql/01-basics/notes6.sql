SELECT * FROM tbproducts;

INSERT INTO tbproducts(
	product, name, container, volume, flavor, price)
    VALUES (
    '11223344', 'Festival de Sabores', 'Bottle PET', '1.5 liters', 'Asaí', 18.51);

SELECT * FROM tbproducts;

DELETE FROM tbproducts WHERE product = '11223344';

SELECT * FROM tbproducts;
