DROP DATABASE IF EXISTS tarea_01;

CREATE DATABASE tarea_01 CHARSET utf8 COLLATE utf8_unicode_520_ci;
USE tarea_01;

CREATE TABLE tiendas(
    nif VARCHAR(10),
    nombre VARCHAR(20) NOT NULL,
    direccion VARCHAR(20) NOT NULL,
    poblacion VARCHAR(20) NOT NULL,
    provincia VARCHAR(20) NOT NULL,
    codpostal CHAR(5) NOT NULL
)ENGINE=innoDB;

CREATE TABLE fabricantes(
    cod_fabricante INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(15) NOT NULL,
    pais VARCHAR(15) NOT NULL
)ENGINE=innoDB;

CREATE TABLE articulos(
    articulo VARCHAR (20),
    cod_fabricante INT UNSIGNED,
    peso INT UNSIGNED CHECK (peso > 0),
    categoria ENUM ('primera', 'segunda', 'tercera'),
    precio_venta DECIMAL (7,2) UNSIGNED CHECK (precio_venta > 0),
    precio_costo DECIMAL (7,2) UNSIGNED CHECK (precio_costo > 0),
    existencias INT UNSIGNED,
    PRIMARY KEY(articulo, cod_fabricante, peso, categoria)
)ENGINE=innoDB;

CREATE TABLE ventas(
    nif VARCHAR(10) NOT NULL,
    articulo VARCHAR(20) NOT NULL,
    cod_fabricante INT UNSIGNED NOT NULL,
    peso INT UNSIGNED,
    categoria ENUM ('primera', 'segunda', 'tercera') NOT NULL,
    fecha_venta DATE NOT NULL,
    unidades_pedidas SMALLINT UNSIGNED NOT NULL,
    existencias INT UNSIGNED,
    PRIMARY KEY (nif, articulo, cod_fabricante, peso, categoria, fecha_venta)
)ENGINE=innoDB;

CREATE TABLE pedidos(
    nif VARCHAR(10),
    articulo VARCHAR(20),
    cod_fabricante INT UNSIGNED,
    peso INT UNSIGNED,
    categoria ENUM ('primera', 'segunda', 'tercera'),
    unidades_pedidas SMALLINT UNSIGNED CHECK (unidades_pedidas > 0),
    fecha_pedido DATE NOT NULL,
    existencias INT UNSIGNED,
    PRIMARY KEY (nif, articulo, cod_fabricante, peso, categoria, unidades_pedidas)
)ENGINE=innoDB;

ALTER TABLE tiendas
    MODIFY nombre VARCHAR(30) NOT NULL,
    ADD PRIMARY KEY (nif);

ALTER TABLE articulos
    ADD FOREIGN KEY (cod_fabricante) REFERENCES fabricantes(cod_fabricante) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE ventas
    ADD FOREIGN KEY (nif) REFERENCES tiendas (nif) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (articulo, cod_fabricante, peso, categoria) REFERENCES articulos (articulo, cod_fabricante, peso, categoria) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE pedidos
    ADD FOREIGN KEY (nif) REFERENCES tiendas (nif) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (articulo, cod_fabricante, peso, categoria) REFERENCES articulos (articulo, cod_fabricante, peso, categoria) ON DELETE RESTRICT ON UPDATE CASCADE;

--parte 2

ALTER TABLE articulos
    MODIFY precio_venta DECIMAL(10,2);

ALTER TABLE pedidos
    ADD COLUMN fecha_entrega DATE;


--tarea 8

ALTER TABLE tiendas
    ADD COLUMN  tipo_tienda ENUM('Principal','Secundaria','Digital') NOT NULL DEFAULT('Principal');

ALTER TABLE fabricantes
    DROP COLUMN pais,
    ADD COLUMN contiene ENUM('EU','AM','AF','OC','AS') DEFAULT('EU');

ALTER TABLE articulos
    MODIFY precio_venta DECIMAL(8,2) UNSIGNED CHECK(precio_venta > 0),
    MODIFY precio_costo DECIMAL(8,2) UNSIGNED CHECK(precio_costo > 0);

ALTER TABLE ventas
    MODIFY fecha_venta DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    ADD COLUMN tipo_venta ENUM('Mostrador','Bajo Pedido','Web') NOT NULL;

ALTER TABLE pedidos
    MODIFY fecha_pedido DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP;