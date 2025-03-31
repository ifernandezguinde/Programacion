DROP DATABASE IF EXISTS baloncesto;

CREATE DATABASE baloncesto CHARSET utf8mb4 COLLATE utf8mb4_unicode_520_ci;
USE baloncesto;

CREATE TABLE equipo(
    codigo VARCHAR(4) PRIMARY KEY,
    nome_club VARCHAR(200) NOT NULL,
    pavillon VARCHAR(200),
    capacidade_pavillon INT UNSIGNED NOT NULL,
    web VARCHAR(255),
    nome_equipo VARCHAR(200) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE nacionalidade(
    codigo CHAR(3) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE Xogador(
    numero_licencia INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    codigo_equipo VARCHAR(4) NOT NULL,
    numero SMALLINT UNSIGNED CHECK (numero >=1 AND numero <= 99),
    nome VARCHAR(255) NOT NULL,
    posicion ENUM('F', 'B', 'A', 'P', 'E') NOT NULL,
    nacionalidade CHAR(3) DEFAULT 'ESP',
    ficha ENUM('', 'EUR', 'JFL', 'EXT') NOT NULL,
    estatura DECIMAL(3, 2),
    data_nacemento DATE,
    temporadas SMALLINT UNSIGNED
)ENGINE=InnoDB;



ALTER TABLE Xogador
    ADD CONSTRAINT fk_xogador_equipo FOREIGN KEY (codigo_equipo) REFERENCES equipo (codigo) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD CONSTRAINT fk_xogador_nacionalidade FOREIGN KEY (nacionalidade) REFERENCES nacionalidade (codigo) ON DELETE RESTRICT ON UPDATE CASCADE;

-- modificaciones

ALTER TABLE equipo
    ADD COLUMN nacionalidade CHAR(3) DEFAULT 'ESP',
    ADD FOREIGN KEY (nacionalidade) REFERENCES nacionalidade (codigo) ON DELETE RESTRICT ON UPDATE CASCADE;


CREATE TABLE posiciones(
    idposicion INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) UNIQUE KEY
)ENGINE=InnoDB;


ALTER TABLE Xogador
    ADD COLUMN salario DECIMAL(10, 2),
    ALTER COLUMN ficha SET DEFAULT 'EUR',
    DROP COLUMN posicion,
    ADD COLUMN idposicion INT UNSIGNED,
    ADD FOREIGN KEY (idposicion) REFERENCES posiciones (idposicion) ON DELETE RESTRICT ON UPDATE CASCADE;


-- tarefa 8

CREATE TABLE club(
    cod_club VARCHAR(3) PRIMARY KEY,
    nome_club VARCHAR(100)
)ENGINE=InnoDB;



ALTER TABLE Xogador
    MODIFY COLUMN salario DECIMAL(18,2) NOT NULL;

ALTER TABLE equipo
    DROP COLUMN nome_club,
    ADD COLUMN cod_club VARCHAR(3) AFTER codigo,
    ADD FOREIGN KEY (cod_club) REFERENCES club (cod_club) ON DELETE RESTRICT ON UPDATE CASCADE;