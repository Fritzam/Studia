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

#set foreign_key_checks = 0;
#DELETE FROM company WHERE company_name = "Maple Leaf Technologies";
#DELETE FROM company WHERE company_nip >= 815204937 AND company_nip < 815204938;
#set foreign_key_checks = 1;

DELETE FROM education WHERE USER_ID = 8;
DELETE FROM education WHERE GPA >= 3.5 AND GPA < 3.6;

DELETE FROM financial_record WHERE last_year_tax = 3000;
DELETE FROM financial_record WHERE savings_money >= 16000 AND savings_money < 16500;

DELETE FROM origin WHERE origin_country = "Scotland";
DELETE FROM origin WHERE person_id >= 8 AND person_id < 9;

#DELETE FROM person WHERE last_name = "White";
#DELETE FROM person WHERE id > 7 AND id < 9;

DELETE FROM vehicle WHERE brand = "Ford Mustang";
DELETE FROM vehicle WHERE mileage <= 27000 and mileage > 26500;

#ORDER BY
SELECT * FROM person ORDER BY id DESC;
SELECT * FROM person ORDER BY age ASC;

#LIKE
SELECT * FROM company WHERE company_nip like '%1';
SELECT * FROM company WHERE company_nip like '%36%';

#Between
SELECT * FROM financial_record WHERE salary BETWEEN 40000 AND 58000;

#NOT IN
SELECT * from person WHERE id NOT IN (1, 2, 7);

#3 joiny
SELECT person.*, origin.hometown, origin.origin_country FROM person INNER JOIN origin ON person.id = origin.person_id;
SELECT person.*, financial_record.salary, financial_record.last_year_tax FROM person LEFT JOIN financial_record ON person.id = financial_record.person_ID;
SELECT person.first_name, person.last_name, person.age, person.gender, company.company_name, company.department_location_country
FROM person JOIN companyperson ON person.id = companyperson.person_ID
JOIN company ON companyperson.company_nip = company.company_nip;

#Druga funkcja + group by.
SELECT MAX(mileage) as maximum_mileage, driver_id
FROM vehicle
GROUP BY driver_id;

#Trzecia funkcja i having zliczajacy ludzi bez dlugu.
SELECT debt, COUNT(*) as number_of_people
FROM financial_record
GROUP BY debt
HAVING COUNT(*) > 1;

#Exists zwracający tabelę jeśli NIE ma w niej niebinarnych.
SELECT id, first_name, last_name
FROM person
WHERE NOT EXISTS
	(SELECT gender from person WHERE gender='non-binary');

#Znajdzie wszystkie kobiety w tabeli person, podmieni nazwę "gender" na "plec piekna"
select id, first_name, last_name, gender as plec_piekna from person WHERE gender = 'female';

#Wybierze każdy unikalny dlug.
select distinct debt from financial_record;

#Alter usuwajacy dlug i dodajacy kolumne posiadacza nieruchomosci.
ALTER TABLE financial_record DROP COLUMN debt;
ALTER TABLE financial_record ADD owns_property boolean;

#ZAPYTANIA PRZERABIAJACE VEHICLES NA ONE TO MANY RELATIONSHIP Z PERSON.
ALTER TABLE vehicle DROP FOREIGN KEY vehicle_ibfk_1;
ALTER TABLE vehicle ADD COLUMN owner int;
ALTER TABLE vehicle ADD foreign key (owner) references person(id);
ALTER TABLE vehicle RENAME COLUMN driver_id to vehicle_id;
ALTER TABLE vehicle MODIFY vehicle_id INT AUTO_INCREMENT;
UPDATE vehicle SET owner = 1 WHERE vehicle_id = 1;
UPDATE vehicle SET owner = 2 WHERE vehicle_id = 2;
UPDATE vehicle SET owner = 3 WHERE vehicle_id = 3;
UPDATE vehicle SET owner = 4 WHERE vehicle_id = 4;
UPDATE vehicle SET owner = 5 WHERE vehicle_id = 5;
UPDATE vehicle SET owner = 6 WHERE vehicle_id = 6;
UPDATE vehicle SET owner = 7 WHERE vehicle_id = 7;
UPDATE vehicle SET owner = 8 WHERE vehicle_id = 8;
UPDATE vehicle SET owner = 9 WHERE vehicle_id = 9;
UPDATE vehicle SET owner = 10 WHERE vehicle_id = 10;
insert into vehicle (vehicle_type, brand, mileage, license_plate, owner)
values ('car', 'BMW X6', '140000', 'OGU194', 2);
select * from vehicle;

#TRUNCATE TABLE debt;