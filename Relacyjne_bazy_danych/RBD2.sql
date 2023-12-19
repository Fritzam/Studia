UPDATE address SET state = "Unknown" WHERE person_id = 2;
UPDATE address SET state = "Unknown" WHERE state IS NULL;

UPDATE company SET department_location_city = "Sydney" WHERE company_nip = 162574839;
UPDATE company SET HQ_location_country = "Panama" WHERE service = "Financial Services";

UPDATE education SET GPA = 4.0 WHERE USER_ID = 10;
UPDATE education SET GPA = 4.0 WHERE GPA >= 3.9;

UPDATE financial_record SET debt = 10000 WHERE person_id = 6;
UPDATE financial_record SET debt = 0 WHERE savings_money <= 12000;

UPDATE origin SET hometown = "Melbourne" WHERE person_id = 3;
UPDATE origin SET hometown = "Salt Lake City" WHERE origin_country = "USA";

UPDATE person SET age = 46 WHERE id = 3;
UPDATE person SET education_level = "High School" WHERE age <= 22;

UPDATE vehicle SET mileage = 30000 WHERE license_plate = "ABC123";
UPDATE vehicle SET license_plate = null WHERE mileage >= 50000;

create table debt(
    id INT NOT NULL primary key auto_increment,
    debt INT
);
INSERT INTO debt(debt) VALUES (25000),
(12000),
(29000),
(15000),
(31000),
(9000),
(21000),
(34000),
(11000),
(20000);

DELETE FROM address WHERE city = "Auckland";
DELETE FROM address WHERE person_id > 7 AND person_id < 9;

DELETE FROM companyperson WHERE ID=4;
DELETE FROM companyperson WHERE company_nip >= 854193627 AND company_nip < 854193628;

set foreign_key_checks = 0;
DELETE FROM company WHERE company_name = "Maple Leaf Technologies";
DELETE FROM company WHERE company_nip >= 815204937 AND company_nip < 815204938;
set foreign_key_checks = 1;

DELETE FROM education WHERE USER_ID = 8;
DELETE FROM education WHERE GPA >= 3.5 AND GPA < 3.6;

DELETE FROM financial_record WHERE last_year_tax = 3000;
DELETE FROM financial_record WHERE savings_money >= 16000 AND savings_money < 16500;

DELETE FROM origin WHERE origin_country = "Scotland";
DELETE FROM origin WHERE person_id >= 8 AND person_id < 9;

DELETE FROM person WHERE last_name = "White";
DELETE FROM person WHERE id > 7 AND id < 9;

DELETE FROM vehicle WHERE brand = "Ford Mustang";
DELETE FROM vehicle WHERE mileage <= 27000 and mileage > 26500;

TRUNCATE TABLE debt;


---------------------------------------------------------------
PRZYWRÓĆ TABELĘ!!!
---------------------------------------------------------------
















