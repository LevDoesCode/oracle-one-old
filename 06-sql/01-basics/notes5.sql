USE smoothies;

INSERT INTO tbproducts(
	product, name, container, volume, flavor, price)
    VALUES (
    '695594', 'Festival de Sabores', 'Bottle PET', '1.5 liters', 'Asaí', 18.51);

INSERT INTO tbproducts(
	product, name, container, volume, flavor, price)
    VALUES (
    '1041119', 'Citrus', 'Bottle Glass', '700 ml', 'Lima', 4.90);
    
SELECT * FROM tbproducts;

UPDATE tbproducts SET product = '868485', container = 'PET bottle'
WHERE product = '695594';

SELECT * FROM tbproducts;

SELECT * FROM tbsalespeople;

UPDATE tbsalespeople SET COMMISSION_PERCENT = 0.11
WHERE id = '00236';

SELECT * FROM tbsalespeople;
