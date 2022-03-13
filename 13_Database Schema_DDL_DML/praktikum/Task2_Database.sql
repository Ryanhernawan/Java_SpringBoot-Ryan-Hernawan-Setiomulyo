CREATE DATABASE alta_online_shop;
USE alta_online_shop;


-- CREATING TABLE

create table users(
ID int not null auto_increment primary key,
Name varchar(255),
status smallint,
dob date,
gender char(1),
created_at timestamp,
update_at timestamp
);

create table product(
ID int auto_increment primary key,
product_type_id int,
operator_id int,
code varchar(50),
nama varchar(100),
status smallint,
create_at timestamp,
update_at TIMESTAMP
);

create table product_types(
ID int not null auto_increment primary key,
name VARCHAR(255),
create_at timestamp,
update_at TIMESTAMP
);

create table product_description(
ID int not null auto_increment primary key,
description TEXT,
create_at timestamp,
update_at TIMESTAMP
);

create table operator(
ID int  not null auto_increment primary key,
name VARCHAR(255),
create_at TIMESTAMP,
update_at TIMESTAMP
);

CREATE TABLE transaction(
ID int not null auto_increment primary key,
User_Id int,
Payment_Method_id int,
status varchar(10),
total_qty int(11),
total_price numeric(25,2),
created_at timestamp,
uptdae_at timestamp
);

CREATE TABLE transaction_detail(
ID int not null auto_increment primary key,
status varchar(10),
qty int(11),
price numeric(25,2),
created_at timestamp,
uptdae_at timestamp
);

CREATE TABLE payment_methods(
ID int not null auto_increment primary key,
name varchar(255),
status smallint,
created_at timestamp,
update_at timestamp
);

CREATE TABLE kurir(
ID int not null auto_increment primary key,
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




