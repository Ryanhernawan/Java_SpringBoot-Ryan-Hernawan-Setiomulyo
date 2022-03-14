CREATE DATABASE alta_online_shop;
USE alta_online_shop;


-- CREATING TABLE

CREATE TABLE users(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255),
status SMALLINT,
dob DATE,
gender CHAR(1),
created_at TIMESTAMP,
update_at TIMESTAMP
);

CREATE TABLE product(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
product_type_id INT,
operator_id INT,
code VARCHAR(50),
nama VARCHAR(100),
status SMALLINT,
created_at TIMESTAMP,
updated_at TIMESTAMP
);

CREATE TABLE product_types(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255),
created_at TIMESTAMP,
updated_at TIMESTAMP
);

CREATE TABLE product_description(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
description TEXT,
created_at TIMESTAMP,
updated_at TIMESTAMP
);

CREATE TABLE operator(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255),
created_at TIMESTAMP,
updated_at TIMESTAMP
);

CREATE TABLE transaction(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
user_Id INT,
payment_Method_id INT,
status VARCHAR(10),
total_qty INT(11),
total_price NUMERIC(25,2),
created_at TIMESTAMP,
updated_at TIMESTAMP
);

CREATE TABLE transaction_detail(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
status VARCHAR(10),
qty INT(11),
price NUMERIC(25,2),
created_at TIMESTAMP,
uptdated_at TIMESTAMP
);

CREATE TABLE payment_methods(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255),
status SMALLINT,
created_at TIMESTAMP,
updated_at TIMESTAMP
);

CREATE TABLE kurir(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255),
created_at TIMESTAMP,
updated_at TIMESTAMP
);

-- -- --
-- ADD COLUMN ON KURIR TABLE
ALTER TABLE kurir ADD COLUMN ongkos_dasar int;

-- RENAME KURIR TABLE TO SHIPPING
ALTER TABLE kurir RENAME TO shipping;

-- DROP TABLE SHIPPING
DROP TABLE shipping;

select * from shipping;




