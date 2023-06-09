USE smoothies;

INSERT INTO tbproducts(
	product, name, container, volume, flavor, price)
    VALUES (
    '773912', 'clean', 'PET bottle', '1 liter', 'orange', 8.01);

SELECT * FROM tbproducts;

INSERT INTO tbsalespeople
	(id, name, COMMISSION_PERCENT)
	VALUES
	('00233', 'Joan Geraldo de la Fonseca', 0.10);

SELECT * FROM tbsalespeople;
