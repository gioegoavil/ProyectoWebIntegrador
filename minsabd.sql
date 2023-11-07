CREATE DATABASE minsabd;
create table medicamentos (
id int AUTO_INCREMENT PRIMARY KEY,
codigo VARCHAR(30),
nombre char(30),
fechavenc varchar(30),
stock int
);
USE minsabd;
create table laboratorios (
id int AUTO_INCREMENT PRIMARY KEY,
codigo VARCHAR(30),
nombrelab char(30),
preciog double,
preciom double
);