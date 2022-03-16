-- CREATE DATABASE
CREATE DATABASE alta_online_shop_sesi14;
USE alta_online_shop_sesi14;

-- SOAL INSERT VALUES

-- INSERT Operator
INSERT INTO operator(name)
VALUES('Rara');
INSERT INTO operator(name)
VALUES('Riko');
INSERT INTO operator(name)
VALUES('Anisa');
INSERT INTO operator(name)
VALUES('Rani');
INSERT INTO operator(name)
VALUES('Raka');

SELECT * FROM operator;

-- INSERT PRODUCT TYPE
INSERT INTO product_types(name)
VALUES('voucher');
INSERT INTO product_types(name)
VALUES('Kuota Data Internet');
INSERT INTO product_types(name)
VALUES('Paket Telepon & SMS');
SELECT * FROM product_types;

-- INSERT PRODUCT 2 DENGAN PRODUCT_TYPE_ID=1 DAN OPERATOR ID =3
INSERT INTO product(product_type_id, operator_id, code, nama, status)
VALUES(1, 3, '001','Paket data harian', 1);

INSERT INTO product(product_type_id, operator_id, code, nama, status)
VALUES(1, 3, '001','Paket data mingguan', 1);

-- INSERT PRODUCT 3 DENGAN PRODUCT_TYPE_ID=2 DAN OPERATOR ID =1
INSERT INTO product(product_type_id, operator_id, code, nama, status)
VALUES(2, 1, '002','Paket Unlimited', 1);

INSERT INTO product(product_type_id, operator_id, code, nama, status)
VALUES(2, 1, '002','Paket Sosmed', 1);

INSERT INTO product(product_type_id, operator_id, code, nama, status)
VALUES(2, 1, '002','Paket Streaming Netflix', 1);

-- INSERT PRODUCT 3 DENGAN PRODUCT_TYPE_ID = 3 DAN OPERATOR ID = 4
INSERT INTO product(product_type_id, operator_id, code, nama, status)
VALUES(3, 4, '003','Paket 1 Gb', '1');

INSERT INTO product(product_type_id, operator_id, code, nama, status)
VALUES (3, 4, '003','Paket 10 Gb', '1');

INSERT INTO product(product_type_id, operator_id, code, nama, status)
VALUES(3, 4, '003','Paket 30 Gb', '1');

SELECT * FROM product;

-- INSERT PRODUCT DESCRIPTION
-- ID 1
INSERT INTO product_description(description)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan internet dengan Kuota Unlimited untuk 1 hari.');
-- ID 2
INSERT INTO product_description(description)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan internet dengan Kuota Unlimited untuk 1 minggu');
-- ID 3
INSERT INTO product_description(description)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan internet dengan Kuota Unlimited untuk 1 Bulan');
-- ID 4
INSERT INTO product_description(description)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan Sosial Media ');
-- ID 5
INSERT INTO product_description(description)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan untuk streaming aplikasi Netflix');
-- ID 6
INSERT INTO product_description(description)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan internet dengan Kuota 1 GB untuk satu hari');
-- ID 7
INSERT INTO product_description(description)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan internet dengan Kuota 10 GB untuk satu hari');
-- ID 8
INSERT INTO product_description(description)
VALUES('paket internet khusus pelanggan prabayar yang memiliki kebutuhan internet dengan Kuota 30 GB untuk satu hari');

SELECT * FROM product_description;


-- INSERT 3 PAYMENT METHOD
INSERT INTO payment_methods(name, status)
VALUE('Virtual Account', 1);

INSERT INTO payment_methods(name, status)
VALUE('Transfer Bank', 1);

INSERT INTO payment_methods(name, status)
VALUE('Digital Wallet', 1);

SELECT * FROM payment_methods;

-- INSERT 5 USER
INSERT INTO users(Name, status, dob)
VALUES('Andhi', 1, '1999-1-9', 'M');

INSERT INTO users(Name, status, dob, gender)
VALUES('Raka', 1, '2000-10-19', 'M');

INSERT INTO users(Name, status, dob, gender)
VALUES('Rara', 1, '2002-12-12', 'F');

INSERT INTO users(Name, status, dob, gender)
VALUES('Rini', 1, '1998-11-9', 'F');

INSERT INTO users(Name, status, dob, gender)
VALUES('Arkan', 1, '1989-8-9', 'M');

INSERT INTO users(Name, status, dob, gender)
VALUES('Sinta', 1, '2003-10-9', 'F');
SELECT * FROM users;

-- INSERT  3 TRANSAKSI DI MASING" USER
-- TRANSACTION USER ID 1
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(1, 1, 1, 3, 30.000);
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(1, 1, 1, 2, 20.000);
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(1, 1, 1, 1, 10.000);

-- TRANSACTION USER ID 2
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(2, 2, 1, 1, 10.000);
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(2, 1, 1, 2, 20.000);
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(2, 1, 1, 1, 10.000);

-- TRANSACTION USER ID 3
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(3, 1, 1, 3, 30.000);
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(3, 2, 1, 2, 20.000);
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(3, 1, 1, 1, 10.000);

-- TRANSACTION USER ID 4
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(4, 1, 1, 1, 10.000);
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(4, 2, 1, 1, 20.000);
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(4, 3, 1, 1, 10.000);

-- TRANSACTION USER ID 5
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(5, 2, 1, 5, 50.000);
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(5, 1, 1, 2, 20.000);
INSERT INTO transaction(User_id, Payment_Method_id, status, total_qty, total_price)
VALUES(5, 3, 1, 1, 10.000);

-- INSERT TRANSACTION DETAIL
INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 1, 1, 3, 30.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(2, 2, 1, 2, 20.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 3, 1, 1, 10.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 4, 1, 1, 10.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 5, 1, 2, 20.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 6, 1, 1, 10.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 7, 1, 3, 30.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 8, 1, 2, 20.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 9, 1, 1, 10.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 10, 1, 1, 10.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 11, 1, 1, 20.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 12, 1, 1, 10.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 13, 1, 5, 50.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 14, 1, 2, 20.000);

INSERT INTO transaction_detail(product_id, transaction_id, status, qty, price)
VALUES(3, 15, 1, 1, 10.000);

select * from transaction_detail;



-- INSERT 3 PRODUCT  DI MASING" TRANSAKSI

SELECT * FROM transaction;



-- SOAL SELECT
SELECT Name , gender FROM users WHERE gender = 'M';
SELECT * FROM product WHERE ID = 3;
SELECT * FROM users WHERE created_at BETWEEN '2022-03-9 11:04:13' AND '2022-03-16 11:04:13' OR name LIKE '%a%';
SELECT Name , gender FROM users WHERE gender = 'F';
SELECT * FROM users ORDER BY Name ASC;
select * from product where ID between 1 and 5;


-- SOAL UPDATE
-- 1
UPDATE product SET nama = 'product dummy' WHERE id = 1;
-- 2
UPDATE transaction_detail SET qty = 3 WHERE product_id = 1;
SELECT * FROM product;

-- SOAL DELETE
-- 1
DELETE FROM product WHERE ID = 1;
-- 2
DELETE FROM product WHERE product_type_id = 1;

select * from product;


-- JOIN
-- 1
SELECT * FROM transaction WHERE user_id = 1 UNION SELECT * FROM transaction WHERE user_id = 2;
-- 2 
SELECT SUM(total_price) FROM transaction WHERE user_id =1;
-- 3
SELECT COUNT(1) FROM transaction_detail WHERE product_id = 3;



