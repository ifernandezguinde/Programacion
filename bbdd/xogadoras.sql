DROP DATABASE IF EXISTS xogadoras;

CREATE DATABASE xogadoras CHARSET utf8 COLLATE utf8_unicode_520_ci;
USE xogadoras;

CREATE TABLE patrocinio(
    nome VARCHAR(150),
    tempada CHAR(9),
    patrocinador VARCHAR(100) NOT NULL,
    PRIMARY KEY (nome, tempada)
)ENGINE=innoDB;

CREATE TABLE xogadora(
    nome VARCHAR(150) PRIMARY KEY,
    DataNacemento DATE NOT NULL
)ENGINE=innoDB;

CREATE TABLE equipo(
    equipo VARCHAR(100) PRIMARY KEY,
    cidade VARCHAR(150) NOT NULL
)ENGINE=innoDB;

CREATE TABLE cidade(
    cidade VARCHAR(150) PRIMARY KEY,
    provincia VARCHAR(100) NOT NULL
)ENGINE=innoDB;

CREATE TABLE adestradora(
    adestradora VARCHAR(255) PRIMARY KEY,
    DataNacementoAdestradora DATE NOT NULL
)ENGINE=innoDB;

CREATE TABLE equipo_adestradora(
    equipo VARCHAR(100),
    tempada CHAR(9),
    adestradora VARCHAR(255) NOT NULL,
    PRIMARY KEY (equipo, tempada)
)ENGINE=innoDB;

CREATE TABLE xogadora_info(
    nome VARCHAR(150),
    tempada CHAR(9),
    posto TINYINT UNSIGNED NOT NULL,
    equipo VARCHAR(100) NOT NULL,
    puntos INT UNSIGNED NOT NULL DEFAULT 0,
    PRIMARY KEY (nome, tempada)
)ENGINE=innoDB;

CREATE TABLE tempada(
    tempada CHAR(100) PRIMARY KEY
)ENGINE=innoDB;


ALTER TABLE patrocinio
    ADD FOREIGN KEY (nome) REFERENCES xogadora(nome) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (tempada) REFERENCES tempada(tempada) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE equipo
    ADD FOREIGN KEY (cidade) REFERENCES cidade(cidade) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE equipo_adestradora
    ADD FOREIGN KEY (equipo) REFERENCES equipo(equipo) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (tempada) REFERENCES tempada(tempada) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (adestradora) REFERENCES adestradora(adestradora) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE xogadora_info
    ADD FOREIGN KEY (nome) REFERENCES xogadora(nome) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (tempada) REFERENCES tempada(tempada) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (equipo) REFERENCES equipo(equipo) ON DELETE RESTRICT ON UPDATE CASCADE;