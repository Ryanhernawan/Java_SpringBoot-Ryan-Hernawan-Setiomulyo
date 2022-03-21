CREATE DATABASE pengeluaranDB;
USE pengeluaranDB;

CREATE TABLE users(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
username VARCHAR(255),
dob DATE,
gender VARCHAR(10),
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE pengeluaran(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
user_ID INT,
nama_pengeluaran VARCHAR(255),
total_pengeluaran NUMERIC(25,2),
total_qty INT,
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE pengeluaran ADD FOREIGN KEY(user_ID)
REFERENCES users(id);

CREATE TABLE detail_pengeluaran(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
tipe_pengeluaran_ID INT,
qty INT,
harga_pengeluaran NUMERIC(25,2),
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE detail_pengeluaran ADD FOREIGN KEY(tipe_pengeluaran_ID)
REFERENCES tipe_pengeluaran(id);

CREATE TABLE tipe_pengeluaran(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nama VARCHAR(255),
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE deskripsi_tipe_pengeluaran(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
description TEXT,
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

