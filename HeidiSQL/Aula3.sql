# * -> representa todos os campos
SELECT * FROM categoria, produto;

SELECT nm_categoria, ds_categoria FROM categoria;

SELECT id FROM categoria;

SELECT nm_cliente, dt_nascimento FROM cliente;

SELECT * FROM cliente WHERE nm_cliente = 'João Silva' OR nm_cliente = 'Carlos Santos';


SELECT nm_cliente FROM cliente ORDER BY nm_cliente;

SELECT nm_cliente FROM cliente ORDER BY nm_cliente DESC;

SELECT * FROM produto ORDER BY vl_produto;

SELECT * FROM produto ORDER BY vl_produto DESC;

# ======== TABELA CLIENTE ===========

SELECT * FROM cliente WHERE bl_cooperado = TRUE;

SELECT nm_cliente, ds_cpf FROM cliente WHERE dt_nascimento >= '1990-01-01';

SELECT nm_cliente, ds_cpf, cd_endereco FROM cliente WHERE cd_endereco = 2;

SELECT nm_cliente, dt_nascimento FROM cliente ORDER BY dt_nascimento DESC;

SELECT nm_cliente, ds_cpf, cd_endereco FROM cliente WHERE bl_cooperado = TRUE AND cd_endereco = 1;

# ======== TABELA PRODUTO ===========

SELECT * FROM produto WHERE vl_produto > 100;

SELECT nm_produto, qt_estoque FROM produto WHERE cd_categoria = 1;

SELECT nm_produto, vl_produto, cd_categoria FROM produto WHERE vl_produto > 10 AND vl_produto < 50;

SELECT nm_produto, cd_categoria FROM produto WHERE qt_estoque < 50;

SELECT nm_produto, qt_estoque FROM produto WHERE cd_categoria = 3 AND vl_produto < 30;

# FAZENDO JOIN
# c -> é um apelido para cliente
SELECT * FROM cliente AS c, endereco AS e WHERE c.cd_endereco = e.id;

SELECT * FROM cliente AS c JOIN endereco AS e ON c.cd_endereco = e.id;

SELECT * FROM cliente AS c JOIN endereco AS e ON c.cd_endereco = e.id WHERE c.bl_cooperado = TRUE;

# ======== EXERCICIO ===========

SELECT c.nm_cliente, c.ds_cpf, e.nm_municipio 
FROM cliente AS c JOIN endereco AS e
ON c.cd_endereco = e.id
WHERE e.nm_municipio = 'Cidade A';

SELECT c.nm_cliente, c.dt_nascimento, e.nm_municipio 
FROM cliente AS c JOIN endereco AS e
ON c.cd_endereco = e.id 
ORDER BY e.nm_municipio;

SELECT c.nm_cliente, c.ds_cpf, e.nm_bairro 
FROM cliente AS c JOIN endereco AS e 
ON c.cd_endereco = e.id 
WHERE c.bl_cooperado = TRUE AND e.nm_bairro = 'Centro';

SELECT c.nm_cliente, c.dt_nascimento, e.nm_municipio, e.nm_bairro 
FROM cliente AS c JOIN endereco AS e 
ON c.cd_endereco = e.id 
WHERE c.dt_nascimento > '1990-01-01' 
ORDER BY c.dt_nascimento;

SELECT c.nm_cliente, c.ds_cpf, e.nm_municipio 
FROM cliente AS c JOIN endereco AS e 
ON c.cd_endereco = e.id 
WHERE c.bl_cooperado = TRUE 
ORDER BY e.nm_municipio, c.nm_cliente;

SELECT p.nm_produto, p.qt_estoque, p.vl_produto
FROM produto AS p JOIN categoria AS c
ON p.cd_categoria = c.id
WHERE c.nm_categoria = 'Eletrônicos';

SELECT p.nm_produto, p.vl_produto, c.ds_categoria
FROM produto AS p JOIN categoria AS c
ON p.cd_categoria = c.id
ORDER BY p.vl_produto DESC;

SELECT p.nm_produto, p.qt_estoque, c.ds_categoria
FROM produto AS p JOIN categoria AS c
ON p.cd_categoria = c.id
WHERE p.qt_estoque < 50
ORDER BY p.qt_estoque;

SELECT p.nm_produto, p.vl_produto, p.qt_estoque
FROM produto AS p JOIN categoria AS c
ON p.cd_categoria = c.id
WHERE c.nm_categoria = 'Livros' AND p.vl_produto > 15;

SELECT p.nm_produto, p.qt_estoque, c.ds_categoria
FROM produto AS p JOIN categoria AS c
ON p.cd_categoria = c.id
WHERE p.qt_estoque > 50 AND c.nm_categoria = 'Casa e Jardim'
ORDER BY p.qt_estoque DESC;