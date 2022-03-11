-- CREATE DATABASE
CREATE DATABASE alta_online_shop_sesi14;
USE alta_online_shop_sesi14;

-- CREATE TABLE
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

-- ADD FOREIGN KEY
ALTER TABLE product ADD FOREIGN KEY (product_type_id) 
REFERENCES  product_types(ID);

ALTER TABLE product ADD FOREIGN KEY (operator_id) 
REFERENCES  operator(ID);

ALTER TABLE transaction ADD FOREIGN KEY (User_Id) 
REFERENCES  users(ID);

ALTER TABLE transaction ADD FOREIGN KEY (Payment_Method_id) 
REFERENCES  payment_methods(ID);

-- SOAL INSERT VALUES

-- INSERT Operator
INSERT INTO operator(name, create_at, update_at)
VALUES('Telkomsel', '2022-03-10 11:59:00', '2022-03-10 13:00:00');
INSERT INTO operator(name, create_at, update_at)
VALUES('Indosat', '2022-03-10 11:59:00', '2022-03-10 13:00:00');
INSERT INTO operator(name, create_at, update_at)
VALUES('AXIS', '2022-03-10 11:59:00', '2022-03-10 13:00:00');
INSERT INTO operator(name, create_at, update_at)
VALUES('XL', '2022-03-10 11:59:00', '2022-03-10 13:00:00');
INSERT INTO operator(name, create_at, update_at)
VALUES('Three', '2022-03-10 11:59:00', '2022-03-10 13:00:00');

SELECT * FROM operator;

-- INSERT PRODUCT TYPE
INSERT INTO product_types(name, create_at, update_at)
VALUES('voucher', '2022-03-10 11:59:00', '2022-03-10 13:00:00');
INSERT INTO product_types(name, create_at, update_at)
VALUES('Kuota Data Internet', '2022-03-10 11:59:00', '2022-03-10 13:00:00');
INSERT INTO product_types(name, create_at, update_at)
VALUES('Paket Telepon & SMS', '2022-03-10 11:59:00', '2022-03-10 13:00:00');
SELECT * FROM product_types;

-- INSERT PRODUCT 2 DENGAN PRODUCT_TYPE_ID=1 DAN OPERATOR ID =3
INSERT INTO product(product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES(1, 3, '001','Paket data harian', '1','2022-03-10 11:59:00', '2022-03-10 13:00:00' );

INSERT INTO product(product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES(1, 3, '002','Paket data mingguan', '1', '2022-03-10 11:59:00', '2022-03-10 13:00:00' );

-- INSERT PRODUCT 3 DENGAN PRODUCT_TYPE_ID=2 DAN OPERATOR ID =1
INSERT INTO product(product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES(2, 1, '003','Paket Unlimited', '1','2022-03-10 11:59:00', '2022-03-10 13:00:00' );

INSERT INTO product(product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES(2, 1, '004','Paket Sosmed', '1','2022-03-10 11:59:00', '2022-03-10 13:00:00' );


INSERT INTO product(product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES(2, 1, '005','Paket Streaming Netflix', '1','2022-03-10 11:59:00', '2022-03-10 13:00:00' );

-- INSERT PRODUCT 3 DENGAN PRODUCT_TYPE_ID = 3 DAN OPERATOR ID = 4
INSERT INTO product(product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES(3, 4, '006','Paket 1 Gb', '1','2022-03-10 11:59:00', '2022-03-10 13:00:00' );

INSERT INTO product(product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES (3, 4, '006','Paket 10 Gb', '1','2022-03-10 11:59:00', '2022-03-10 13:00:00' );

INSERT INTO product(product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES(3, 4, '006','Paket 30 Gb', '1','2022-03-10 11:59:00', '2022-03-10 13:00:00' );

SELECT * FROM product;

-- INSERT PRODUCT DESCRIPTION
-- ID 1
INSERT INTO product_description(description, create_at, update_at)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan internet dengan Kuota Unlimited untuk 1 hari.', '2022-03-10 11:59:00', '2022-03-10 11:59:00');
-- ID 2
INSERT INTO product_description(description, create_at, update_at)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan internet dengan Kuota Unlimited untuk 1 m.', '2022-03-10 11:59:00', '2022-03-10 11:59:00');
-- ID 3
INSERT INTO product_description(description, create_at, update_at)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan internet dengan Kuota Unlimited untuk 1 Bulan', '2022-03-10 11:59:00', '2022-03-10 11:59:00');
-- ID 4
INSERT INTO product_description(description, create_at, update_at)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan Sosial Media ', '2022-03-10 11:59:00', '2022-03-10 11:59:00');
-- ID 5
INSERT INTO product_description(description, create_at, update_at)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan untuk streaming aplikasi Netflix', '2022-03-10 11:59:00', '2022-03-10 11:59:00');
-- ID 6
INSERT INTO product_description(description, create_at, update_at)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan internet dengan Kuota 1 GB untuk satu hari', '2022-03-10 11:59:00', '2022-03-10 11:59:00');
-- ID 7
INSERT INTO product_description(description, create_at, update_at)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan internet dengan Kuota 10 GB untuk satu hari', '2022-03-10 11:59:00', '2022-03-10 11:59:00');
-- ID 8
INSERT INTO product_description(description, create_at, update_at)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan internet dengan Kuota 30 GB untuk satu hari', '2022-03-10 11:59:00', '2022-03-10 11:59:00');

SELECT * FROM product_description;


-- INSERT 3 PAYMENT METHOD
INSERT INTO payment_methods(name, status, created_at, update_at)
VALUE('Virtual Account', 1, '2022-03-10 11:59:00', '2022-03-10 11:59:00');

INSERT INTO payment_methods(name, status, created_at, update_at)
VALUE('Transfer Bank', 1, '2022-03-10 11:59:00', '2022-03-10 11:59:00');

INSERT INTO payment_methods(name, status, created_at, update_at)
VALUE('Indomaret', 1, '2022-03-10 11:59:00', '2022-03-10 11:59:00');

SELECT * FROM payment_methods;

-- INSERT 5 USER
INSERT INTO users(Name, status, dob, gender, created_at, update_at)
VALUES('Andhi', 1, '1999-1-9', 'M', '2022-03-10 11:59:00', '2022-03-10 11:59:00' );

INSERT INTO users(Name, status, dob, gender, created_at, update_at)
VALUES('Raka', 1, '2000-10-19', 'M', '2022-03-10 11:59:00', '2022-03-10 11:59:00' );

INSERT INTO users(Name, status, dob, gender, created_at, update_at)
VALUES('Rara', 1, '2002-12-12', 'F', '2022-03-10 11:59:00', '2022-03-10 11:59:00' );

INSERT INTO users(Name, status, dob, gender, created_at, update_at)
VALUES('Rini', 1, '1998-11-9', 'F', '2022-03-10 11:59:00', '2022-03-10 11:59:00' );

INSERT INTO users(Name, status, dob, gender, created_at, update_at)
VALUES('Arkan', 1, '1989-8-9', 'M', '2022-03-10 11:59:00', '2022-03-10 11:59:00' );

SELECT * FROM users;

-- INSERT  3 TRANSAKSI DI MASING" USER
-- TRANSACTION USER ID 1
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(1, 1, 1, 3, 30.000, '2022-03-11 12:00:00', '2022-03-11 12:00:00' );
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(1, 1, 1, 2, 20.000, '2022-03-11 13:00:00', '2022-03-11 13:00:00' );
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(1, 1, 1, 1, 10.000, '2022-03-11 14:00:00', '2022-03-11 14:00:00' );

-- TRANSACTION USER ID 2
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(2, 2, 1, 1, 10.000, '2022-03-11 12:00:00', '2022-03-11 12:00:00' );
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(2, 1, 1, 2, 20.000, '2022-03-11 13:00:00', '2022-03-11 13:00:00' );
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(2, 1, 1, 1, 10.000, '2022-03-11 14:00:00', '2022-03-11 14:00:00' );

-- TRANSACTION USER ID 3
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(3, 1, 1, 3, 30.000, '2022-03-11 12:00:00', '2022-03-11 12:00:00' );
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(3, 2, 1, 2, 20.000, '2022-03-11 13:00:00', '2022-03-11 13:00:00' );
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(3, 1, 1, 1, 10.000, '2022-03-11 14:00:00', '2022-03-11 14:00:00' );

-- TRANSACTION USER ID 4
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(4, 1, 1, 1, 10.000, '2022-03-11 12:00:00', '2022-03-11 12:00:00' );
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(4, 2, 1, 1, 20.000, '2022-03-11 13:00:00', '2022-03-11 13:00:00' );
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(4, 3, 1, 1, 10.000, '2022-03-11 14:00:00', '2022-03-11 14:00:00' );

-- TRANSACTION USER ID 5
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(5, 2, 1, 5, 50.000, '2022-03-11 12:00:00', '2022-03-11 12:00:00' );
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(5, 1, 1, 2, 20.000, '2022-03-11 13:00:00', '2022-03-11 13:00:00' );
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price, created_at, update_at)
VALUES(5, 3, 1, 1, 10.000, '2022-03-11 14:00:00', '2022-03-11 14:00:00' );

SELECT * FROM transaction;

-- INSERT TRANSACTION DETAIL
INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 1, 1, 3, 30.000,'2022-03-11 12:00:00','2022-03-11 12:00:00');

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(2, 2, 1, 2, 20.000,'2022-03-11 13:00:00','2022-03-11 13:00:00');


INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 3, 1, 1, 10.000,'2022-03-11 14:00:00','2022-03-11 14:00:00');

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 4, 1, 1, 10.000,'2022-03-11 12:00:00','2022-03-11 12:00:00');

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 5, 1, 2, 20.000,'2022-03-11 13:00:00','2022-03-11 13:00:00');

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 6, 1, 1, 10.000,'2022-03-11 14:00:00','2022-03-11 14:00:00');

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 7, 1, 3, 30.000,'2022-03-11 12:00:00','2022-03-11 12:00:00');

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 8, 1, 2, 20.000,'2022-03-11 13:00:00','2022-03-11 13:00:00');

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 9, 1, 1, 10.000,'2022-03-11 14:00:00','2022-03-11 14:00:00');

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 10, 1, 1, 10.000,'2022-03-11 12:00:00','2022-03-11 12:00:00');

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 11, 1, 1, 20.000,'2022-03-11 13:00:00','2022-03-11 13:00:00');

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 12, 1, 1, 10.000,'2022-03-11 14:00:00','2022-03-11 13:00:00');

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 13, 1, 5, 50.000,'2022-03-11 12:00:00','2022-03-11 12:00:00');

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 14, 1, 2, 20.000,'2022-03-11 13:00:00','2022-03-11 13:00:00');

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price, created_at, update_at)
VALUES(3, 15, 1, 1, 10.000,'2022-03-11 14:00:00','2022-03-11 14:00:00');

select * from transaction_detail;


-- INSERT 3 PRODUCT  DI MASING" TRANSAKSI

SELECT * FROM transaction;




-- SOAL SELECT
SELECT Name , gender FROM users WHERE gender = 'M';
SELECT * FROM product WHERE ID = 3;
SELECT * FROM users WHERE created_at BETWEEN 1 AND 7 OR Name LIKE 'a%';
SELECT * FROM users WHERE gender LIKE 'F%';
SELECT * FROM users ORDER BY Name ASC;
select * from product where ID between 1 and 5;


-- SOAL UPDATE


-- SOAL DELETE
DELETE FROM product WHERE ID = 1;
DELETE FROM product WHERE product_type_id = 1;

select * from product;


