DROP DATABASE IF EXISTS espectaculos;

CREATE DATABASE espectaculos CHARSET utf8mb4 COLLATE utf8mb4_unicode_520_ci;
USE espectaculos;

CREATE TABLE espectaculos (
    cod_espectaculo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    tipo VARCHAR(255) NOT NULL,
    fecha_inicial DATE NOT NULL,
    fecha_final DATE,
    interprete VARCHAR(100) NOT NULL,
    cod_recinto INT UNSIGNED NOT NULL
)ENGINE=InnoDB;

CREATE TABLE precios_espectaculos (
    cod_espectaculo INT UNSIGNED,
    cod_recinto INT UNSIGNED,
    zona VARCHAR(100),
    precio DECIMAL(7,2) UNSIGNED NOT NULL,
    PRIMARY KEY (cod_espectaculo, cod_recinto, zona)
)ENGINE=InnoDB;

CREATE TABLE recintos (
    cod_recinto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    direccion VARCHAR(255) NOT NULL,
    ciudad VARCHAR(100) NOT NULL,
    telefono VARCHAR(9) NOT NULL,
    horario VARCHAR(150) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE zonas_recintos (
    cod_recinto INT UNSIGNED,
    zona VARCHAR(100),
    capacidad INT UNSIGNED NOT NULL,
    PRIMARY KEY (cod_recinto, zona)
)ENGINE=InnoDB;

CREATE TABLE asientos (
    cod_recinto INT UNSIGNED,
    zona VARCHAR(100),
    fila INT UNSIGNED,
    numero INT UNSIGNED,
    PRIMARY KEY (cod_recinto, zona, fila, numero)
)ENGINE=InnoDB;

CREATE TABLE representaciones (
    cod_espectaculo INT UNSIGNED,
    fecha DATE,
    hora TIME,
    PRIMARY KEY (cod_espectaculo, fecha, hora)
)ENGINE=InnoDB;

CREATE TABLE entradas (
    cod_espectaculo INT UNSIGNED,
    fecha DATE,
    hora TIME,
    cod_recinto INT UNSIGNED,
    fila INT UNSIGNED,
    numero INT UNSIGNED,
    zona VARCHAR(100),
    dni_cliente VARCHAR(9),
    PRIMARY KEY (cod_espectaculo,fecha, hora, fila, numero, zona, dni_cliente)
)ENGINE=InnoDB;

CREATE TABLE espectadores (
    dni_cliente VARCHAR(9) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(255),
    telefono CHAR(9),
    ciudad VARCHAR(100),
    ntarjeta CHAR(16)
)ENGINE=InnoDB;

ALTER TABLE espectaculos
    ADD FOREIGN KEY (cod_recinto) REFERENCES recintos(cod_recinto) ON DELETE RESTRICT ON UPDATE CASCADE;


ALTER TABLE precios_espectaculos
    ADD FOREIGN KEY (cod_espectaculo) REFERENCES espectaculos(cod_espectaculo) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (cod_recinto, zona) REFERENCES zonas_recintos(cod_recinto, zona) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE asientos
    ADD FOREIGN KEY (cod_recinto, zona) REFERENCES zonas_recintos(cod_recinto, zona) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE representaciones
    ADD FOREIGN KEY (cod_espectaculo) REFERENCES espectaculos(cod_espectaculo) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE entradas
    ADD FOREIGN KEY (cod_espectaculo, fecha, hora) REFERENCES representaciones(cod_espectaculo, fecha, hora) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (cod_recinto, zona, fila, numero) REFERENCES asientos(cod_recinto, zona, fila, numero) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (dni_cliente) REFERENCES espectadores(dni_cliente) ON DELETE RESTRICT ON UPDATE CASCADE;