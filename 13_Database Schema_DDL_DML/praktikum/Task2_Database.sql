CREATE DATABASE alta_online_shop;
USE alta_online_shop;

	
-- CREATING TABLE
CREATE TABLE user(
id INT NOT NULL auto_increment primary key,
nama varchar(255),
alamat varchar(255),
status_user  varchar(100),
gender varchar(25),
created_at date,
update_at text
);

CREATE TABLE product(
id INT NOT NULL auto_increment primary key,
nama varchar(255),
harga_produk integer,
quantity_produk integer,
description_produk varchar(255),
product_type varchar(100)
);

CREATE TABLE product_type(
id INT NOT NULL auto_increment primary key,
nama varchar(255),
harga_produk integer,
quantity_produk integer,
description_produk varchar(255),
product_type varchar(100)
);

CREATE TABLE operator(
id INT NOT NULL auto_increment primary key
);

CREATE TABLE product_description(
id INT NOT NULL auto_increment primary key,
nama varchar(255),
detail_product varchar(255)
);

CREATE TABLE payment_method(
id INT NOT NULL auto_increment primary key,
jenis_pembayaran varchar(100)
);

CREATE TABLE transaction_(
id INT NOT NULL auto_increment primary key,
order_status varchar(100),
order_alamat varchar(255),
order_date date 
);

CREATE TABLE transaction_detail(
id INT NOT NULL auto_increment primary key,
harga int,
deskripsi varchar(255),
quantity_produk int 
);

CREATE TABLE kurir(
id int not null auto_increment primary key,
nama varchar(255),
created_at date,
update_at date
);
-- -- --
-- ADD COLUMN ON KURIR TABLE
ALTER TABLE kurir ADD COLUMN ongkos_dasar int;

-- RENAME KURIR TABLE TO SHIPPING
ALTER TABLE kurir RENAME TO shipping;

-- DROP TABLE SHIPPING
DROP TABLE shipping;





