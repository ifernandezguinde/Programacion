-- phpMyAdmin SQL Dump
-- version 5.1.1deb5ubuntu1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Xerado en: 13 de Nov de 2023 ás 12:52
-- Versión do servidor: 10.6.12-MariaDB-0ubuntu0.22.04.1
-- Versión do PHP: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_traballadores`
--

-- --------------------------------------------------------

--
-- Estrutura da táboa `centro`
--

CREATE TABLE `centro` (
  `cenNumero` int(11) NOT NULL,
  `cenNome` char(30) DEFAULT NULL,
  `cenEnderezo` char(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;

--
-- A extraer os datos da táboa `centro`
--

INSERT INTO `centro` (`cenNumero`, `cenNome`, `cenEnderezo`) VALUES
(10, 'SEDE CENTRAL', 'C/ ALCALA, 820-MADRID'),
(20, 'RELACION CON CLIENTES', 'C/ ATOCHA, 405-MADRID'),
(30, 'DELEGACION GALICIA', 'C/ MAIOR, 27-LUGO');

-- --------------------------------------------------------

--
-- Estrutura da táboa `departamento`
--

CREATE TABLE `departamento` (
  `depNumero` int(11) NOT NULL,
  `depNome` char(20) DEFAULT NULL,
  `depDirector` int(11) NOT NULL,
  `deptipoDirector` char(1) DEFAULT NULL,
  `depPresuposto` decimal(9,2) DEFAULT NULL,
  `depDepende` int(11) DEFAULT NULL COMMENT 'número de departamento do que depende',
  `depCentro` int(11) DEFAULT NULL COMMENT 'número do centro ao que pertenece este departamento',
  `depEmpregados` smallint(5) UNSIGNED DEFAULT NULL COMMENT 'número de empregados que traballan no departamento'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;

--
-- A extraer os datos da táboa `departamento`
--

INSERT INTO `departamento` (`depNumero`, `depNome`, `depDirector`, `deptipoDirector`, `depPresuposto`, `depDepende`, `depCentro`, `depEmpregados`) VALUES
(100, 'DIRECION XERAL', 260, 'P', '120000.00', NULL, 10, NULL),
(110, 'DIRECCION COMERCIAL', 180, 'P', '15000.00', 100, 20, NULL),
(111, 'SECTOR INDUSTRIAL', 400, 'P', '111000.00', 110, 20, NULL),
(112, 'SECTOR SERVICIOS', 270, 'F', '90000.00', 110, 20, NULL),
(120, 'ORGANIZACION', 150, 'P', '30000.00', 100, 10, NULL),
(121, 'PERSOAL', 110, 'P', '200000.00', 120, 10, NULL),
(122, 'PROCESO DE DATOS', 350, 'F', '60000.00', 120, 30, NULL),
(130, 'FINANZAS', 310, 'P', '20000.00', 100, 10, NULL),
(200, 'TRANSPORTES', 600, 'F', '80000.00', 100, 20, NULL);

-- --------------------------------------------------------

--
-- Estrutura da táboa `empregado`
--

CREATE TABLE `empregado` (
  `empNumero` int(11) NOT NULL,
  `empDepartamento` int(11) NOT NULL COMMENT 'número de departamento no que traballa o empregado',
  `empExtension` smallint(6) NOT NULL COMMENT 'extensión telefónica para o traballador',
  `empDataNacemento` date DEFAULT NULL,
  `empDataIngreso` date DEFAULT NULL COMMENT 'data de ingreso na empresa',
  `empSalario` decimal(6,2) DEFAULT NULL,
  `empComision` decimal(6,2) DEFAULT NULL,
  `empFillos` smallint(6) DEFAULT NULL COMMENT 'número de fillos que ten o traballador',
  `empNome` char(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;

--
-- A extraer os datos da táboa `empregado`
--

INSERT INTO `empregado` (`empNumero`, `empDepartamento`, `empExtension`, `empDataNacemento`, `empDataIngreso`, `empSalario`, `empComision`, `empFillos`, `empNome`) VALUES
(110, 121, 350, '1951-09-19', '2003-02-15', '2000.00', NULL, 3, 'PONS, CESAR'),
(120, 112, 840, '1950-04-17', '1968-10-01', '1200.00', '110.00', 1, 'LASA, MARIO'),
(130, 112, 810, '1961-07-19', '1996-02-01', '1500.00', '110.00', 2, 'TEROL, LUCIANO'),
(150, 120, 340, '1960-06-18', '2000-01-15', '2200.00', NULL, 0, 'PEREZ, JULIO'),
(160, 111, 740, '1959-05-17', '2012-11-11', '1550.00', '110.00', 2, 'AGUIRRE, AUREO'),
(180, 110, 508, '1959-08-26', '1996-03-18', '2200.00', '50.00', 2, 'PEREZ, MARCOS'),
(190, 121, 350, '1957-03-21', '1985-02-11', '610.10', NULL, 4, 'VEIGA, JULIANA'),
(210, 100, 200, '1956-08-07', '1995-01-22', '1000.60', NULL, 2, 'GALVEZ, PILAR'),
(240, 111, 760, '1988-01-05', '2014-02-24', '800.25', '100.00', 3, 'SANZ, LAVINIA'),
(250, 100, 250, '1956-09-04', '1987-03-01', '1550.50', NULL, 0, 'ALBA, ADRIANA'),
(260, 100, 220, '1954-10-11', '1992-07-12', '3600.00', NULL, 6, 'LOPEZ, ANTONIO'),
(270, 112, 800, '1955-03-30', '1987-09-10', '1900.00', '80.00', 3, 'GARCIA, OCTAVIO'),
(280, 130, 410, '1958-08-20', '1988-10-08', '600.60', NULL, 5, 'FLOR, DOROTEA'),
(285, 122, 620, '1959-09-03', '1999-02-15', '550.50', NULL, 0, 'POLO, OTILIA'),
(290, 120, 910, '1957-10-08', '1995-02-14', '1200.00', NULL, 3, 'GIL, GLORIA'),
(310, 130, 480, '1956-09-29', '2013-01-15', '2100.00', NULL, 0, 'GARCIA, AUGUSTO'),
(320, 122, 620, '1957-11-03', '1978-02-05', '1100.00', NULL, 2, 'SANZ, CORNELIO'),
(330, 112, 850, '1958-06-28', '1992-03-01', '800.00', '90.00', 0, 'DIEZ, AMELIA'),
(350, 122, 610, '1959-02-10', '1984-09-10', '2250.00', NULL, 1, 'CAMPS, AURELIO'),
(360, 111, 750, '1968-09-06', '2002-10-10', '2500.00', '100.00', 2, 'LARA, DORINDA'),
(370, 121, 360, '1957-04-30', '1987-01-20', '1900.00', NULL, 1, 'RUIZ, FABIOLA'),
(380, 112, 880, '1955-02-06', '1990-01-01', '1800.00', NULL, 0, 'MARTIN, MICAELA'),
(390, 110, 500, '1956-12-29', '1999-10-08', '2150.00', NULL, 1, 'MORAN, CARMEN'),
(400, 111, 780, '1957-06-27', '1987-11-01', '2700.00', NULL, 0, 'LARA, LUCRECIA'),
(410, 122, 660, '1956-05-23', '2001-10-13', '1750.00', NULL, 0, 'LOPEZ, AZUCENA'),
(420, 130, 450, '1955-08-30', '1988-11-19', '700.00', NULL, 0, 'FIERRO, CLAUDIA'),
(430, 122, 650, '1957-09-03', '1988-11-19', '500.00', NULL, 1, 'MORA, VALERIANA'),
(440, 111, 760, '1980-08-04', '2013-02-28', '650.00', '100.00', 0, 'DURAN, LIVIA'),
(450, 112, 880, '1989-08-29', '2014-02-28', '600.00', '100.00', 0, 'PEREZ, SABINA'),
(480, 111, 760, '1955-02-11', '1986-02-28', '800.00', '100.00', 1, 'PINO, DIANA'),
(490, 112, 880, '1984-04-15', '2010-01-01', '1800.00', '100.00', 0, 'TORRES, HORACIO'),
(500, 111, 750, '1975-08-17', '2001-01-01', '2000.00', '100.00', 0, 'VAZQUEZ, HONORIA'),
(510, 110, 550, '1953-03-12', '1996-11-01', '2000.00', NULL, 1, 'CAMPOS, ROMULO'),
(550, 111, 780, '1952-11-19', '1988-01-21', '680.00', '120.00', 0, 'SANTOS,SANCHO'),
(600, 200, 500, '1954-03-21', '1984-01-15', '1500.00', '100.00', 2, 'RUIZ, ANTONIO'),
(650, 111, 880, '1953-11-19', '1988-11-08', '1200.00', '120.00', 2, 'TELLO,LUIS'),
(652, 200, 520, '1985-03-21', '2001-01-15', '900.00', '100.00', 1, 'ARANGO, BERTA'),
(653, 200, 112, '1979-10-11', '2010-11-11', '1100.00', NULL, 0, 'FERNANDEZ, CARMEN'),
(654, 120, 88, '1989-08-14', '2014-05-15', '900.00', '50.00', 0, 'SANCHEZ, MARCOS');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `centro`
--
ALTER TABLE `centro`
  ADD PRIMARY KEY (`cenNumero`),
  ADD KEY `cenNome` (`cenNome`);

--
-- Indexes for table `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`depNumero`),
  ADD KEY `depDirector` (`depDirector`),
  ADD KEY `depDepende` (`depDepende`),
  ADD KEY `depCentro` (`depCentro`),
  ADD KEY `depNome` (`depNome`);

--
-- Indexes for table `empregado`
--
ALTER TABLE `empregado`
  ADD PRIMARY KEY (`empNumero`),
  ADD KEY `empDepartamento` (`empDepartamento`),
  ADD KEY `empNome` (`empNome`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `empregado`
--
ALTER TABLE `empregado`
  MODIFY `empNumero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=655;

--
-- Restricións para os envorcados das táboas
--

--
-- Restricións para a táboa `departamento`
--
ALTER TABLE `departamento`
  ADD CONSTRAINT `departamento_FK` FOREIGN KEY (`depDirector`) REFERENCES `empregado` (`empNumero`) ON UPDATE CASCADE,
  ADD CONSTRAINT `departamento_FK_1` FOREIGN KEY (`depCentro`) REFERENCES `centro` (`cenNumero`) ON UPDATE CASCADE,
  ADD CONSTRAINT `departamento_FK_2` FOREIGN KEY (`depDepende`) REFERENCES `departamento` (`depNumero`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Restricións para a táboa `empregado`
--
ALTER TABLE `empregado`
  ADD CONSTRAINT `empregado_FK` FOREIGN KEY (`empDepartamento`) REFERENCES `departamento` (`depNumero`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
