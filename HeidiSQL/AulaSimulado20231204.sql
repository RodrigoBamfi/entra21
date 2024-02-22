-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.11.5-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para simulado
CREATE DATABASE IF NOT EXISTS `simulado` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `simulado`;

-- Copiando estrutura para tabela simulado.autor
CREATE TABLE IF NOT EXISTS `autor` (
  `id` int(11) NOT NULL,
  `nm_autor` varchar(100) DEFAULT NULL,
  `dt_nascimento` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela simulado.autor: ~5 rows (aproximadamente)
INSERT INTO `autor` (`id`, `nm_autor`, `dt_nascimento`) VALUES
	(1, 'Autor A', '1990-01-15'),
	(2, 'Autor B', '1985-07-20'),
	(3, 'Autor C', '1987-03-10'),
	(4, 'Autor D', '1995-10-25'),
	(5, 'Autor E', '1992-06-27');

-- Copiando estrutura para tabela simulado.autor_livro
CREATE TABLE IF NOT EXISTS `autor_livro` (
  `cd_livro` int(11) DEFAULT NULL,
  `cd_autor` int(11) DEFAULT NULL,
  `ano_contribuicao` int(11) DEFAULT NULL,
  KEY `cd_livro` (`cd_livro`),
  KEY `cd_autor` (`cd_autor`),
  CONSTRAINT `autor_livro_ibfk_1` FOREIGN KEY (`cd_livro`) REFERENCES `livro` (`id`),
  CONSTRAINT `autor_livro_ibfk_2` FOREIGN KEY (`cd_autor`) REFERENCES `autor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela simulado.autor_livro: ~7 rows (aproximadamente)
INSERT INTO `autor_livro` (`cd_livro`, `cd_autor`, `ano_contribuicao`) VALUES
	(1, 1, 2020),
	(1, 2, 2020),
	(2, 3, 2018),
	(3, 1, 2022),
	(3, 3, 2022),
	(4, 4, 2010),
	(5, 5, 2015);

-- Copiando estrutura para tabela simulado.editora
CREATE TABLE IF NOT EXISTS `editora` (
  `id` int(11) NOT NULL,
  `nm_editora` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela simulado.editora: ~3 rows (aproximadamente)
INSERT INTO `editora` (`id`, `nm_editora`) VALUES
	(1, 'Editora A'),
	(2, 'Editora B'),
	(3, 'Editora C');

-- Copiando estrutura para tabela simulado.livro
CREATE TABLE IF NOT EXISTS `livro` (
  `id` int(11) NOT NULL,
  `nm_titulo` varchar(50) DEFAULT NULL,
  `ano_publicacao` int(11) DEFAULT NULL,
  `vl_livro` decimal(8,2) DEFAULT NULL,
  `cd_editora` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cd_editora` (`cd_editora`),
  CONSTRAINT `livro_ibfk_1` FOREIGN KEY (`cd_editora`) REFERENCES `editora` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela simulado.livro: ~5 rows (aproximadamente)
INSERT INTO `livro` (`id`, `nm_titulo`, `ano_publicacao`, `vl_livro`, `cd_editora`) VALUES
	(1, 'Livro 1', 2020, 50.00, 1),
	(2, 'Livro 2', 2018, 55.00, 2),
	(3, 'Livro 3', 2022, 60.75, 3),
	(4, 'Livro 4', 2010, 42.50, 2),
	(5, 'Livro 5', 2015, 56.77, 3);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
