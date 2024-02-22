# INSERIR DADOS NA TABELA

# insira na nome_tabela
INSERT INTO sala_de_aula (id_sala_aula, qt_alunos, nm_professor, ds_periodo)
VALUES (1, 20, 'Maju', 'Noturno');

INSERT INTO categoria (id, nm_categoria, ds_categoria)
VALUES (1, 'Eletrônicos', 'Dispositivos eletrônicos, como smartphones, laptops e tablets.');

INSERT INTO categoria (id, nm_categoria, ds_categoria)
VALUES (2, 'Moda', 'Roupas e acessórios de moda para homens e mulheres.');

INSERT INTO categoria (id, nm_categoria, ds_categoria)
VALUES (3, 'Livros', 'Diversos gêneros de livros, incluindo ficção, não ficção e literatura clássica.');

INSERT INTO categoria (id, nm_categoria, ds_categoria)
VALUES (4, 'Casa e Jardim', 'Produtos para decoração, móveis e itens de jardinagem.');

INSERT INTO categoria (id, nm_categoria, ds_categoria)
VALUES (5, 'Esportes e Outdoor', 'Equipamentos esportivos, roupas esportivas e acessórios para atividades ao ar livre.');

INSERT INTO produto (id, nm_produto, qt_estoque, vl_produto, cd_categoria)
VALUES (1, 'Smartphone XYZ', 50, 899.99, 1);

INSERT INTO produto (id, nm_produto, qt_estoque, vl_produto, cd_categoria)
VALUES (2, 'Camiseta Casual', 100, 29.99, 2);

INSERT INTO produto (id, nm_produto, qt_estoque, vl_produto, cd_categoria)
VALUES (3, 'Aventuras Fantásticas', 30, 15.50, 3);

INSERT INTO produto (id, nm_produto, qt_estoque, vl_produto, cd_categoria)
VALUES (4, 'Conjunto de Sofá Moderno', 10, 799.99, 4);

INSERT INTO produto (id, nm_produto, qt_estoque, vl_produto, cd_categoria)
VALUES (5, 'Bicicleta de Montanha', 20, 349.99, 5);

#UPDATE
# seleciona a tabela - seleciona a coluna
UPDATE sala_de_aula SET nm_professor = 'Henrique'
WHERE id_sala_aula = 1;

UPDATE produto SET vl_produto = 799.99 
WHERE nm_produto = 'Smartphone XYZ';

DELETE FROM produto WHERE qt_estoque < 15;

UPDATE categoria SET ds_categoria = 'Roupas e acessórios de moda para homens, mulheres e crianças'
WHERE nm_categoria = 'Moda';

INSERT INTO endereco (id, nm_municipio, nm_bairro)
VALUES
(1, 'Cidade A', 'Centro'),
(2, 'Cidade B', 'Novo Bairro'),
(3, 'Cidade A', 'Subúrbio');

INSERT INTO cliente (id, nm_cliente, ds_cpf, bl_cooperado, dt_nascimento, cd_endereco)
VALUES
(1, 'João Silva', 12345678901, TRUE, '1985-03-10', 1),
(2, 'Maria Oliveira', 98765432101, FALSE, '1992-07-22', 2),
(3, 'Carlos Santos', 45678901234, TRUE, '1978-11-05', 3),
(4, 'Ana Rocha', 87654321098, FALSE, '1989-05-15', 2),
(5, 'Paula Souza', 23456789012, TRUE, '1995-09-30', 1);

UPDATE cliente SET cd_endereco = 2 WHERE id = 1;

DELETE FROM cliente WHERE bl_cooperado = 0;

INSERT INTO cliente (id, nm_cliente, ds_cpf, bl_cooperado, dt_nascimento, cd_endereco)
VALUES (6, 'Maria Silva', 12345678901, FALSE, '1990-05-15', 1);