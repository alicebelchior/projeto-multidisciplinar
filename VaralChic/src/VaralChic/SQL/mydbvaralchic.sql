create database varal_chic;
use varal_chic;

create table login (
codigo_usuario int not null auto_increment primary key,
nome varchar(100),
cpf_usuario varchar(14) not null,
telefone varchar(11),
usuario varchar(50) not null,
senha varchar(50) not null
);

create table cliente (
codigo_cliente int not null auto_increment primary key,
nome_cliente varchar(100) not null,
cpf_cliente varchar(14) not null,
rg_cliente varchar(9),
endereco_cliente varchar(255),
telefone_cliente varchar(11) not null,
email_cliente varchar(100),
observacao varchar(255)
);

create table produto (
codigo_produto int not null primary key auto_increment,
categoria varchar(100) not null,
quantidade_estoque int not null,
preco float(10) not null
);

create table venda (
codigo_venda int not null primary key auto_increment,
codigo_cliente int not null,
codigo_produto int not null,
data_venda date not null,
valor decimal(10, 2) not null,
metodo_pagamento varchar(100) not null,
foreign key (codigo_cliente) references cliente (codigo_cliente),
foreign key (codigo_produto) references produto (codigo_produto)
);

create table crediario (
codigo_venda int,
codigo_cliente int,
data_vencimento date not null,
numero_parcelas int not null,
foreign key (codigo_venda) references venda (codigo_venda),
foreign key (codigo_cliente) references cliente (codigo_cliente)
);

create table controle_financeiro (
codigo_registro int not null primary key auto_increment,
tipo_registro varchar(20) not null,
valor decimal(10, 2) not null,
data_registro date not null
);