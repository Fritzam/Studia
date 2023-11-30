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









