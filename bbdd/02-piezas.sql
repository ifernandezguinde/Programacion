DROP DATABASE IF EXISTS piezas;

CREATE DATABASE piezas CHARSET utf8mb4 COLLATE utf8mb4_unicode_520_ci;
USE piezas;


CREATE TABLE piezas(
    idpieza INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombrepiez VARCHAR(100) NOT NULL,
    color VARCHAR(20) DEFAULT 'metalizado'
)ENGINE=innoDB;

CREATE TABLE proveedores(
    idproveedor INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombreprov VARCHAR(100) NOT NULL,
    domicilio VARCHAR(100),
    ciudad INTEGER
)ENGINE=innoDB;

CREATE TABLE proyectos(
    idproyecto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombreproyecto VARCHAR(100) NOT NULL
)ENGINE=innoDB;

CREATE TABLE suministradores(
    idproveedor INT UNSIGNED,
    idpieza INT UNSIGNED,
    idproyecto INT UNSIGNED,
    cantidad INT UNSIGNED NOT NULL CHECK (cantidad > 0),
    PRIMARY KEY (idproyecto, idproveedor, idpieza)
)ENGINE=innoDB;




-- modificaciones

ALTER TABLE suministradores
    ADD FOREIGN KEY (idproveedor) REFERENCES proveedores(idproveedor) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (idpieza) REFERENCES piezas(idpieza) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (idproyecto) REFERENCES proyectos(idproyecto) ON DELETE RESTRICT ON UPDATE CASCADE;


ALTER TABLE proyectos
    ADD COLUMN presupuesto DECIMAL(9, 2);


ALTER TABLE piezas
    MODIFY COLUMN color VARCHAR(20) DEFAULT 'metalizado' NOT NULL,
    CHANGE COLUMN nombrepiez nombre_pieza VARCHAR(100) NOT NULL,
    ADD UNIQUE (nombre_pieza);


ALTER TABLE proveedores
    ADD UNIQUE (nombreprov);

ALTER TABLE proyectos
    ADD UNIQUE (nombreproyecto);


-- tarefa 8

CREATE TABLE provincias(
    id_provincia INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre_provincia VARCHAR(255) NOT NULL UNIQUE
)ENGINE=innoDB;




ALTER TABLE proveedores
    DROP nombreprov,
    ADD COLUMN id_provincia INT UNSIGNED,
    ADD FOREIGN KEY (id_provincia) REFERENCES provincias (id_provincia) ON DELETE RESTRICT ON UPDATE CASCADE;