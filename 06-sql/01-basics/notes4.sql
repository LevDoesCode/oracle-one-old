INSERT INTO tbproducts(
	product, name, container, volume, flavor, price)
    VALUES (
    '838819', 'clean', 'PET bottle', '1.5 liter', 'orange', 12.01);
    
INSERT INTO tbproducts(
	product, name, container, volume, flavor, price)
    VALUES (
    '1037797', 'clean', 'PET bottle', '2 liter', 'orange', 16.01);
    
INSERT INTO tbproducts(
	product, name, container, volume, flavor, price)
    VALUES (
    '773912', 'clean', 'can', '350 ml', 'orange', 2.81);
    
SELECT * FROM tbproducts;

INSERT INTO tbsalespeople
	(id, name, COMMISSION_PERCENT)
	VALUES
	('00235', 'Marcio Almeida Silva', 0.08);
    
INSERT INTO tbsalespeople
	(id, name, COMMISSION_PERCENT)
	VALUES
	('00236', 'Claudio Morales', 0.08);

SELECT * FROM tbsalespeople;
