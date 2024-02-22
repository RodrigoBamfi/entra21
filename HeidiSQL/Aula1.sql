CREATE TABLE sala_de_aula (
id_sala_aula INTEGER,
qt_alunos INTEGER, # colunas = atributos
nm_professor VARCHAR(50),
ds_periodo VARCHAR(20)
);

# a tabela vai ficar rosa caso seja valida(exista)
ALTER TABLE categoria ADD coluna_exemplo INTEGER;
# Não precisa colocar o tipo na hora de deletar
ALTER TABLE categoria DROP coluna_exemplo;

ALTER TABLE sala_de_aula ADD fl_monitor INTEGER;

ALTER TABLE sala_de_aula DROP fl_monitor;

ALTER TABLE pessoa MODIFY nm_pessoa VARCHAR(100);

CREATE TABLE categoria (
id INTEGER,
nm_categoria VARCHAR(50),
ds_categoria VARCHAR(150)
);

CREATE TABLE cliente (
id INTEGER PRIMARY KEY,
nm_cliente VARCHAR(150),
ds_cpf CHAR(11),
bl_cooperado BOOLEAN,
dt_nascimento DATE,
cd_endereco INTEGER REFERENCES endereco (id)
);

DROP TABLE cliente;
DROP TABLE endereco;

ALTER TABLE cliente ADD nr_telefone CHAR(14);
ALTER TABLE cliente ADD ds_cliente VARCHAR(200);
ALTER TABLE cliente ADD ds_email VARCHAR(150);

ALTER TABLE cliente DROP dt_nascimento;
ALTER TABLE cliente DROP bl_cooperado;

ALTER TABLE cliente MODIFY nm_cliente VARCHAR(80);

CREATE TABLE voo (
nr_numero INTEGER,
qnt_passagens INTEGER,
hr_decolagem DATETIME,
ds_destino VARCHAR(150),
preco_passagem DECIMAL
);

CREATE TABLE departamento (
# o primeiro atributo ao criar uma tabela tem que ser a PK
id INTEGER PRIMARY KEY, # PRIMARY KEY - define que é PK
ds_departamento VARCHAR(150)
);

CREATE TABLE chefe (
id INTEGER PRIMARY KEY,
ds_nome VARCHAR(50),
# no fim eu crio meus atributos estrangeiros
# chamo referencia - chamo a tabela - especifico a coluna (id(PK))
cd_departamento INTEGER REFERENCES departamento (id)
);

CREATE TABLE endereco (
id INTEGER PRIMARY KEY,
nm_municipio VARCHAR(50),
nm_bairro VARCHAR(50)
);


CREATE TABLE produto (
id INTEGER PRIMARY KEY,
nm_produto VARCHAR(50),
qt_estoque INTEGER,
vl_produto DECIMAL,
cd_categoria INTEGER REFERENCES categoria (id)
);

CREATE TABLE categoria (
id INTEGER PRIMARY KEY,
nm_categoria VARCHAR(50),
ds_categoria VARCHAR(150)
);

DROP TABLE categoria;

CREATE TABLE pessoa (
id INTEGER PRIMARY KEY,
ds_nome VARCHAR(50),
nr_cpf CHAR(14),
gerente BOOLEAN,
empregado BOOLEAN
);

CREATE TABLE pessoa_empresa (
cd_pessoa INTEGER REFERENCES pessoa (id),
cd_empresa INTEGER REFERENCES empresa (id)
);

CREATE TABLE empresa (
id INTEGER PRIMARY KEY,
nr_cnpj CHAR(18),
qtd_funcionarios INTEGER
);

