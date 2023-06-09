USE smoothies;

ALTER TABLE tbclients ADD PRIMARY KEY(ID);

ALTER TABLE tbclients ADD COLUMN(DOB DATE);

SELECT * FROM tbclients;

INSERT INTO tbclients(
	ID,
	NAME,
	ADDRESS1, 
	ADDRESS2,
	DISTRICT,
	CITY,
	STATE,
	POSTAL_CODE,
	AGE,
	SEX,
	CREDIT_LINE,
	PURCHASE_VOLUME,
	FIRST_PURCHASE,
    DOB)
    VALUES (
	'112233',
    'John Doe',
    '123 Main St',
    '',
    'Centra District',
    'Metropolis',
    'Great State',
    '10001',
    '39',
    'M',
    100000,
    2000,
    0,
    '1970-01-01');

SELECT * FROM tbclients;

UPDATE tbclients SET district = 'Central District' WHERE id = '112233';

SELECT * FROM tbclients;
