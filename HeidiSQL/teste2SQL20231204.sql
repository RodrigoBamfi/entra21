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


-- Copiando estrutura do banco de dados para teste_2_sql
CREATE DATABASE IF NOT EXISTS `teste_2_sql` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `teste_2_sql`;

-- Copiando estrutura para tabela teste_2_sql.itens_ordem_servico
CREATE TABLE IF NOT EXISTS `itens_ordem_servico` (
  `cd_ordem_servico` int(11) DEFAULT NULL,
  `cd_servico` int(11) DEFAULT NULL,
  `dt_atendimento` date DEFAULT NULL,
  `ds_atendimento` varchar(100) DEFAULT NULL,
  KEY `cd_ordem_servico` (`cd_ordem_servico`),
  KEY `cd_servico` (`cd_servico`),
  CONSTRAINT `itens_ordem_servico_ibfk_1` FOREIGN KEY (`cd_ordem_servico`) REFERENCES `ordem_servico` (`id`),
  CONSTRAINT `itens_ordem_servico_ibfk_2` FOREIGN KEY (`cd_servico`) REFERENCES `servico` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela teste_2_sql.itens_ordem_servico: ~10 rows (aproximadamente)
INSERT INTO `itens_ordem_servico` (`cd_ordem_servico`, `cd_servico`, `dt_atendimento`, `ds_atendimento`) VALUES
	(1, 1, '2023-11-06', 'Lavacao de roupas rapidas sem mistura.'),
	(1, 2, '2023-11-07', 'Repero da maquina de lavar.'),
	(2, 3, '2023-11-08', 'Trocar tomada'),
	(2, 4, '2023-11-09', 'Paes as cinco da manha'),
	(3, 5, '2023-11-10', 'Olhar correia dentada'),
	(3, 1, '2023-11-11', 'Lavar somente roupas intimas'),
	(4, 2, '2023-11-12', 'Olhar motor do portao'),
	(4, 3, '2023-11-13', 'Trocar as lampadas da sala'),
	(5, 4, '2023-11-14', 'Fazer bolo de aniversario'),
	(5, 5, '2023-11-15', 'Recarregar bateria');

-- Copiando estrutura para tabela teste_2_sql.ordem_servico
CREATE TABLE IF NOT EXISTS `ordem_servico` (
  `id` int(11) NOT NULL,
  `dt_registro` date DEFAULT NULL,
  `ds_observacao` varchar(200) DEFAULT NULL,
  `cd_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cd_usuario` (`cd_usuario`),
  CONSTRAINT `ordem_servico_ibfk_1` FOREIGN KEY (`cd_usuario`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela teste_2_sql.ordem_servico: ~5 rows (aproximadamente)
INSERT INTO `ordem_servico` (`id`, `dt_registro`, `ds_observacao`, `cd_usuario`) VALUES
	(1, '2023-11-14', 'Nao brancas com pretas', 1),
	(2, '2023-11-02', 'Usar graxa em po', 2),
	(3, '2023-11-11', 'Usar tomada 20A', 3),
	(4, '2023-11-04', 'Usar farinha integral', 1),
	(5, '2023-11-05', 'Vulcanizacao', 2);

-- Copiando estrutura para tabela teste_2_sql.servico
CREATE TABLE IF NOT EXISTS `servico` (
  `id` int(11) NOT NULL,
  `ds_servico` varchar(50) DEFAULT NULL,
  `ds_sugestao` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela teste_2_sql.servico: ~5 rows (aproximadamente)
INSERT INTO `servico` (`id`, `ds_servico`, `ds_sugestao`) VALUES
	(1, 'Lavacao', 'Usar sabao neutro'),
	(2, 'Manutencao', 'Todos os motores desligados'),
	(3, 'Eletricista', 'Nao tomar choque'),
	(4, 'concluido', 'Pao Frances'),
	(5, 'concluido', 'So pneu furados');

-- Copiando estrutura para tabela teste_2_sql.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL,
  `nm_usuario` varchar(50) DEFAULT NULL,
  `ds_email` varchar(50) DEFAULT NULL,
  `nr_telefone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela teste_2_sql.usuario: ~3 rows (aproximadamente)
INSERT INTO `usuario` (`id`, `nm_usuario`, `ds_email`, `nr_telefone`) VALUES
	(1, 'Usuario 1', 'usuario1@gol.com', '4130314069'),
	(2, 'Usuario 2', 'usuario2@gol.com', '4930399099'),
	(3, 'Usuario 3', 'usuario3@gol.com', '5030216059');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
