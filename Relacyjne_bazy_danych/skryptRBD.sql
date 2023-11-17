CREATE DATABASE RBD;
USE rbd;
CREATE TABLE person (
	id INT PRIMARY KEY,
	first_name VARCHAR(15),
	last_name VARCHAR(15),
	phone_number INT,
	email VARCHAR(100),
	gender VARCHAR(6),
	age INT,
	education_level VARCHAR(15)
);

INSERT INTO person (
	id,
    first_name,
    last_name,
    phone_number,
    email,
    gender,
    age,
    education_level
)
    VALUES 
		(1, 'Alice', 'Johnson', 555234123, 'alice.j@example.com', 'female', 28, 'Bachelor'),
                (2, 'Bob', 'Smith', 555756789, 'bob.smith@example.com', 'male', 35, 'Master'),
                (3, 'Sarah', 'Davis', 555898765, 'sarah.d@example.com', 'female', 45, 'High School'),
                (4, 'Michael', 'White', 555876543, 'michael.w@example.com', 'male', 31, 'PhD'),
                (5, 'Emily', 'Turner', 555443211, 'emily.t@example.com', 'female', 29, 'Bachelor'),
                (6, 'David', 'Miller', 555523451, 'david.m@example.com', 'male', 24, 'High School'),
                (7, 'Jessica', 'Brown', 555876543, 'jessica.b@example.com', 'female', 31, 'Master'),
                (8, 'John', 'Lee', 555765432, 'john.l@example.com', 'male', 28, 'Bachelor'),
                (9, 'Emma', 'Harris', 555523451, 'emma.h@example.com', 'female', 22, 'Bachelor'),
                (10, 'Christopher', 'Clark', 555678987, 'chris.c@example.com', 'male', 26, 'High School');

CREATE TABLE address
(
    person_id INT,
    street VARCHAR(30),
    city VARCHAR(30),
    state VARCHAR(20),
    postal_code VARCHAR(8),
    country VARCHAR(30),
    FOREIGN KEY(person_id) references person(id)

);

INSERT INTO address
VALUES
	(1, '123 Main St', 'New York', 'NY', '10001', 'USA'),
    (2, '456 Oak St', 'London', NULL, 'SW1A 1AA', 'United Kingdom'),
    (3, '789 Pine St', 'Sydney', 'NSW', '2000', 'Australia'),
    (4, '101 Elm St', 'Auckland', NULL, '1010', 'New Zealand'),
    (5, '202 Maple St', 'Toronto', 'ON', 'M5V 1J9', 'Canada'),
    (6, '303 Birch St', 'Dublin', NULL, 'D02 FN20', 'Ireland'),
    (7, '404 Birch St', 'Cape Town', NULL, '8001', 'South Africa'),
    (8, '505 Walnut St', 'Edinburgh', NULL, 'EH1 1JH', 'Scotland'),
    (9, '606 Cherry St', 'Brisbane', 'QLD', '4000', 'Australia'),
    (10, '707 Spruce St', 'Wellington', NULL, 6011, 'New Zealand');

create table origin (
	person_id int PRIMARY KEY,
    hometown VARCHAR(20),
    origin_country VARCHAR(30),
    father_name VARCHAR(20),
    mother_name VARCHAR(20),
    FOREIGN KEY(person_id) references person(id)
);

INSERT INTO origin
VALUES (1, "New York", "USA", "John", "Alice"),
       (2, "Hillsborough", "United Kingdom", "Richard", "Hannah"),
       (3, "Sydney", "Australia", "Tim", "Catherine"),
       (4, "Salt Lake City", "USA", "Robert", "Jenny"),
       (5, "Houston", "Canada", "Ethan", "Olivia"),
       (6, "Dublin", "Ireland", "Liam", "Sophia"),
       (7, "London", "United Kingdom", "Jackson", "Emma"),
       (8, "Edinburgh", "Scotland", "Aiden", "Ava"),
       (9, "Jandakot", "Australia", "Lucas", "Isabella"),
       (10, "Wellington", "New Zealand", "Peter", "Mia");


CREATE TABLE education (
    USER_ID INT,
    INSTITUTION_NAME VARCHAR(50),
    USER_PROFILE VARCHAR(50),
    GRADUATION_DATE DATE,
    GPA DOUBLE,
    foreign key(USER_ID) references person(id)
);

INSERT INTO education
VALUES (1,'New York University', 'Computer Science', '2023-05-15', 3.8),
	   (2, 'University of London', 'Business Administration', '2022-12-20', 3.9),
       (3, 'University of Sydney', 'Medicine', '2024-06-30', 3.7),
       (4, 'University of Auckland', 'Physics', '2022-08-25', 3.5),
       (5, 'Univeristy of Toronto', 'Psychology', '2023-04-18', 3.6),
       (6, 'University College Dublin', 'History', '2024-02-10', 3.8),
       (7, 'University of Cape Town', 'Environmental Science', '2022-11-12', 3.9),
       (8, 'University of Edinburgh', 'Chemistry', '2023-09-05', 3.7),
       (9, 'University of Queensland', 'Mathematics', '2024-03-22', 3.6),
       (10, 'Victoria University of Wellington', 'Economics', '2022-07-17', 3.8);

create table vehicle (
    driver_id INT PRIMARY KEY,
    vehicle_type VARCHAR(20),
    brand VARCHAR(25),
    mileage int,
    license_plate VARCHAR(10) UNIQUE,
    foreign key(driver_id) references person(id)
);

INSERT INTO vehicle (driver_id, vehicle_type, brand, mileage, license_plate)
VALUES
    (1, 'car', 'Toyota Camry', 25000, 'ABC123'),
    (2, 'motorcycle', 'Harley Davidson', 12000, 'XYZ789'),
    (3, 'car', 'Honda Accord', 30000, 'DEF456'),
    (4, 'car', 'Ford Mustang', 18000, 'GHI789'),
    (5, 'motorcycle', 'Yamaha MT-07', 9000, 'JKL321'),
    (6, 'car', 'Chevrolet Malibu', 22000, 'MNO987'),
    (7, 'motorcycle', 'Suzuki GSX-R600', 15000, 'PQR654'),
    (8, 'car', 'Nissan Altima', 27000, 'STU012'),
    (9, 'car', 'Volkswagen Golf', 20000, 'VWX345'),
    (10, 'motorcycle', 'Kawasaki Ninja 650', 11000, 'YZA678');
    

create table company (
    company_name VARCHAR(35),
    company_nip int primary key,
    HQ_location_country VARCHAR(30),
    HQ_location_city VARCHAR(30),
    department_location_country VARCHAR(30),
    department_location_city VARCHAR(30),
    service VARCHAR(35)
);

INSERT INTO company (company_name, company_nip, HQ_location_country, HQ_location_city, department_location_country, department_location_city, service)
VALUES
    ('Tech Solutions Inc.', 934178265, 'USA', 'New York', 'USA', 'New York', 'IT Services'),
    ('Global Finance Group', 512936874, 'France', 'Marseille', 'United Kingdom', 'London', 'Financial Services'),
    ('Sydney Tech Innovators', 697583124, 'Australia', 'Sydney', 'Australia', 'Sydney', 'Software Development'),
    ('Kiwi Construction Ltd.', 815204937, 'Germany', 'Berlin', 'New Zealand', 'Auckland', 'Construction'),
    ('Maple Leaf Technologies', 639782451, 'Canada', 'Toronto', 'Canada', 'Toronto', 'Geospatial Solutions'),
    ('Emerald Software Solutions', 428956731, 'Ireland', 'Dublin', 'Ireland', 'Dublin', 'Business Software'),
    ('Cape Town Logistics', 375298146, 'Brazil', 'Rio de Janeiro', 'South Africa', 'Cape Town', 'Logistics'),
    ('Edinburgh Consulting Group', 854193627, 'Spain', 'Madrid', 'Scotland', 'Edinburgh', 'Consulting Services'),
    ('Brisbane Health Solutions', 162574839, 'Italy', 'Rome', 'Australia', 'Brisbane', 'Healthcare Technology'),
    ('Wellington Renewable Energy', 739482615, 'United Kingdom', 'Manchester', 'New Zealand', 'Wellington', 'Renewable Energy');

create table companyperson (
	ID int primary key auto_increment,
    person_ID int,
    company_nip int,
    foreign key(person_ID) references person(id),
    foreign key(company_nip) references company(company_nip)

);

insert into companyperson(person_ID, company_NIP)
values
	(1, 934178265),
	(2, 512936874),
	(3, 697583124),
	(4, 815204937),
	(5, 639782451),
	(6, 428956731),
	(7, 375298146),
	(8, 854193627),
	(9, 162574839),
	(10, 739482615);

create table financial_record(
	person_ID int primary key,
    last_year_tax double,
    salary double,
    savings_money double,
    debt double,
    foreign key (person_ID) references person(id)
);

INSERT INTO financial_record (person_ID, last_year_tax, salary, savings_money, debt)
VALUES
    (1, 2500.0, 50000.0, 10000.0, 5000.0),
    (2, 3200.0, 60000.0, 15000.0, 2000.0),
    (3, 2800.0, 55000.0, 12000.0, 3000.0),
    (4, 3000.0, 58000.0, 13000.0, 2500.0),
    (5, 2700.0, 52000.0, 11000.0, 4000.0),
    (6, 3500.0, 65000.0, 18000.0, 1500.0),
    (7, 2900.0, 56000.0, 12500.0, 2800.0),
    (8, 3300.0, 62000.0, 16000.0, 1800.0),
    (9, 3100.0, 59000.0, 14000.0, 2200.0),
    (10, 2800.0, 57000.0, 12000.0, 3000.0);