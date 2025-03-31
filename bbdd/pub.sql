DROP DATABASE IF EXISTS pub;

CREATE DATABASE pub CHARSET utf8mb4 COLLATE utf8mb4_unicode_520_ci;
USE pub;

CREATE TABLE pub(
    #cod_pub VARCHAR(30) NOT NULL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    licencia_fiscal VARCHAR(100) NOT NULL,
    domicilio VARCHAR(255) NOT NULL,
    fecha_apertura DATE NOT NULL,
    horario ENUM('Hor1','Hor2','Hor3') NOT NULL,
    cod_localidad INT UNSIGNED NOT NULL
)ENGINE=InnoDB;

CREATE TABLE titular(
    dni_titular VARCHAR(9) PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    domicilio VARCHAR(255) NOT NULL,
    cod_pub VARCHAR(30) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE empleado(
    dni_empleado VARCHAR(9) PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    domicilio VARCHAR(255) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE existencias(
    cod_articulo VARCHAR(30) PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    cantidad INT UNSIGNED NOT NULL,
    precio DECIMAL(8,2) NOT NULL,
    cod_pub VARCHAR(30) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE localidad(
    cod_localidad INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE pub_empleado(
    cod_pub VARCHAR(30),
    dni_empleado VARCHAR(9),
    funcion ENUM('CAMARERO','SEGURIDAD','LIMPIEZA') NOT NULL,
    PRIMARY KEY (cod_pub, dni_empleado, funcion)
)ENGINE=InnoDB;



ALTER TABLE pub
ADD FOREIGN KEY (cod_localidad) REFERENCES localidad(cod_localidad) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE titular
ADD FOREIGN KEY (cod_pub) REFERENCES pub(cod_pub) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE existencias
ADD FOREIGN KEY (cod_pub) REFERENCES pub(cod_pub) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE pub_empleado
ADD FOREIGN KEY (cod_pub) REFERENCES pub(cod_pub) ON DELETE RESTRICT ON UPDATE CASCADE,
ADD FOREIGN KEY (dni_empleado) REFERENCES empleado(dni_empleado) ON DELETE RESTRICT ON UPDATE CASCADE;