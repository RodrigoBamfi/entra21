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


-- Copiando estrutura do banco de dados para aulas
CREATE DATABASE IF NOT EXISTS `aulas` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `aulas`;

-- Copiando estrutura para tabela aulas.categoria
CREATE TABLE IF NOT EXISTS `categoria` (
  `id` int(11) NOT NULL,
  `nm_categoria` varchar(50) DEFAULT NULL,
  `ds_categoria` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela aulas.categoria: ~5 rows (aproximadamente)
INSERT INTO `categoria` (`id`, `nm_categoria`, `ds_categoria`) VALUES
	(1, 'Eletrônicos', 'Dispositivos eletrônicos, como smartphones, laptops e tablets.'),
	(2, 'Moda', 'Roupas e acessórios de moda para homens, mulheres e crianças'),
	(3, 'Livros', 'Diversos gêneros de livros, incluindo ficção, não ficção e literatura clássica.'),
	(4, 'Casa e Jardim', 'Produtos para decoração, móveis e itens de jardinagem.'),
	(5, 'Esportes e Outdoor', 'Equipamentos esportivos, roupas esportivas e acessórios para atividades ao ar livre.');

-- Copiando estrutura para tabela aulas.chefe
CREATE TABLE IF NOT EXISTS `chefe` (
  `id` int(11) NOT NULL,
  `ds_nome` varchar(50) DEFAULT NULL,
  `cd_departamento` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cd_departamento` (`cd_departamento`),
  CONSTRAINT `chefe_ibfk_1` FOREIGN KEY (`cd_departamento`) REFERENCES `departamento` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela aulas.chefe: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela aulas.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL,
  `nm_cliente` varchar(150) DEFAULT NULL,
  `ds_cpf` char(11) DEFAULT NULL,
  `bl_cooperado` tinyint(1) DEFAULT NULL,
  `dt_nascimento` date DEFAULT NULL,
  `cd_endereco` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cd_endereco` (`cd_endereco`),
  CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`cd_endereco`) REFERENCES `endereco` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela aulas.cliente: ~4 rows (aproximadamente)
INSERT INTO `cliente` (`id`, `nm_cliente`, `ds_cpf`, `bl_cooperado`, `dt_nascimento`, `cd_endereco`) VALUES
	(1, 'João Silva', '12345678901', 1, '1985-03-10', 2),
	(3, 'Carlos Santos', '45678901234', 1, '1978-11-05', 3),
	(5, 'Paula Souza', '23456789012', 1, '1995-09-30', 1),
	(6, 'Maria Silva', '12345678901', 0, '1990-05-15', 1);

-- Copiando estrutura para tabela aulas.departamento
CREATE TABLE IF NOT EXISTS `departamento` (
  `id` int(11) NOT NULL,
  `ds_departamento` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela aulas.departamento: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela aulas.empresa
CREATE TABLE IF NOT EXISTS `empresa` (
  `id` int(11) NOT NULL,
  `nr_cnpj` char(18) DEFAULT NULL,
  `qtd_funcionarios` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela aulas.empresa: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela aulas.endereco
CREATE TABLE IF NOT EXISTS `endereco` (
  `id` int(11) NOT NULL,
  `nm_municipio` varchar(50) DEFAULT NULL,
  `nm_bairro` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela aulas.endereco: ~2 rows (aproximadamente)
INSERT INTO `endereco` (`id`, `nm_municipio`, `nm_bairro`) VALUES
	(1, 'Cidade A', 'Centro'),
	(2, 'Cidade B', 'Novo Bairro'),
	(3, 'Cidade A', 'Subúrbio');

-- Copiando estrutura para tabela aulas.pessoa
CREATE TABLE IF NOT EXISTS `pessoa` (
  `id` int(11) NOT NULL,
  `ds_nome` varchar(50) DEFAULT NULL,
  `nr_cpf` char(14) DEFAULT NULL,
  `gerente` tinyint(1) DEFAULT NULL,
  `empregado` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela aulas.pessoa: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela aulas.pessoa_empresa
CREATE TABLE IF NOT EXISTS `pessoa_empresa` (
  `cd_pessoa` int(11) DEFAULT NULL,
  `cd_empresa` int(11) DEFAULT NULL,
  KEY `cd_pessoa` (`cd_pessoa`),
  KEY `cd_empresa` (`cd_empresa`),
  CONSTRAINT `pessoa_empresa_ibfk_1` FOREIGN KEY (`cd_pessoa`) REFERENCES `pessoa` (`id`),
  CONSTRAINT `pessoa_empresa_ibfk_2` FOREIGN KEY (`cd_empresa`) REFERENCES `empresa` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela aulas.pessoa_empresa: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela aulas.produto
CREATE TABLE IF NOT EXISTS `produto` (
  `id` int(11) NOT NULL,
  `nm_produto` varchar(50) DEFAULT NULL,
  `qt_estoque` int(11) DEFAULT NULL,
  `vl_produto` decimal(10,0) DEFAULT NULL,
  `cd_categoria` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cd_categoria` (`cd_categoria`),
  CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`cd_categoria`) REFERENCES `categoria` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela aulas.produto: ~4 rows (aproximadamente)
INSERT INTO `produto` (`id`, `nm_produto`, `qt_estoque`, `vl_produto`, `cd_categoria`) VALUES
	(1, 'Smartphone XYZ', 50, 800, 1),
	(2, 'Camiseta Casual', 100, 30, 2),
	(3, 'Aventuras Fantásticas', 30, 16, 3),
	(5, 'Bicicleta de Montanha', 20, 350, 5);

-- Copiando estrutura para tabela aulas.sala_de_aula
CREATE TABLE IF NOT EXISTS `sala_de_aula` (
  `id_sala_aula` int(11) DEFAULT NULL,
  `qt_alunos` int(11) DEFAULT NULL,
  `nm_professor` varchar(50) DEFAULT NULL,
  `ds_periodo` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela aulas.sala_de_aula: ~0 rows (aproximadamente)
INSERT INTO `sala_de_aula` (`id_sala_aula`, `qt_alunos`, `nm_professor`, `ds_periodo`) VALUES
	(1, 20, 'Henrique', 'Noturno');

-- Copiando estrutura para tabela aulas.voo
CREATE TABLE IF NOT EXISTS `voo` (
  `nr_numero` int(11) DEFAULT NULL,
  `qnt_passagens` int(11) DEFAULT NULL,
  `hr_decolagem` datetime DEFAULT NULL,
  `ds_destino` varchar(150) DEFAULT NULL,
  `preco_passagem` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Copiando dados para a tabela aulas.voo: ~0 rows (aproximadamente)

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
