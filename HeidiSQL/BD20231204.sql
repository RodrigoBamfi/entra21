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

-- Copiando dados para a tabela aulas.endereco: ~3 rows (aproximadamente)
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

-- Copiando dados para a tabela aulas.sala_de_aula: ~1 rows (aproximadamente)
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
