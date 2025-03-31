-- phpMyAdmin SQL Dump
-- version 5.1.1deb5ubuntu1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Xerado en: 15 de Nov de 2023 ás 14:11
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
-- Base de datos: `bd_parentesco`
--

-- --------------------------------------------------------

--
-- Estrutura da táboa `persona`
--

CREATE TABLE `persona` (
  `id_persona` int(11) NOT NULL,
  `dni` varchar(10) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellidos` varchar(100) NOT NULL,
  `padre` int(11) DEFAULT NULL,
  `madre` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- A extraer os datos da táboa `persona`
--

INSERT INTO `persona` (`id_persona`, `dni`, `nombre`, `apellidos`, `padre`, `madre`) VALUES
(1, '24060829T', 'Prudencio', 'Fernández Costas', NULL, NULL),
(2, '47817192P', 'Manuela', 'Darriba Pérez', NULL, NULL),
(3, '89527140P', 'Marisa', 'Fernández Darriba', 1, 2),
(4, '36867318C', 'Jaime', 'Fernández Darriba', 1, 2),
(5, '51345905S', 'Juan', 'Fernández Darriba', 1, 2),
(6, '78224951L', 'Sheila', 'Fernández Darriba', 1, 2),
(7, '99835189D', 'Sara', 'García Alonso', NULL, NULL),
(8, '21944394W', 'Pedro', 'Aguado Mendoza', NULL, NULL),
(9, '51927385D', 'Manuel', 'Aguado García', 8, 7),
(10, '11870205C', 'Isabel', 'Aguado García', 8, 7),
(11, '74158587D', 'Carmen', 'Aguado García', 8, 7),
(12, '99865540T', 'Laura', 'Aguado García', 8, 7),
(13, '19025511A', 'Rafael', 'Alonso Lorenzo', NULL, NULL),
(14, '16551192R', 'Pura', 'Estévez Barahona', NULL, NULL),
(15, '28219630X', 'Pablo', 'Alonso Estévez', 13, 14),
(16, '03119006E', 'Roberto', 'Alonso Estévez', 13, 14),
(17, '54329229D', 'Eugenia', 'Alonso Estévez', 13, 14),
(18, '10697729S', 'Isaura', 'Aguado Fernández', 8, 3),
(19, '65654102G', 'Ángela', 'Aguado Fernández', 8, 3),
(20, '71368229B', 'Nerea', 'Aguado Estévez', 16, 18),
(21, '99961929L', 'Antía', 'Aguado Estévez', 16, 18);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id_persona`),
  ADD KEY `persona_FK` (`padre`),
  ADD KEY `persona_FK_1` (`madre`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `persona`
--
ALTER TABLE `persona`
  MODIFY `id_persona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- Restricións para os envorcados das táboas
--

--
-- Restricións para a táboa `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `persona_FK` FOREIGN KEY (`padre`) REFERENCES `persona` (`id_persona`) ON UPDATE CASCADE,
  ADD CONSTRAINT `persona_FK_1` FOREIGN KEY (`madre`) REFERENCES `persona` (`id_persona`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
