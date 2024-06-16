create database varal_chic;
use varal_chic;

create table login(
codigo_login int not null auto_increment primary key,
usuario varchar(50) not null,
senha varchar(50) not null
);

create table usuario (
codigo_usuario int not null auto_increment primary key,
cpf_usuario varchar(14) not null,
nome varchar(100) not null,
telefone varchar(20) not null,
codigo_login int,
foreign key (codigo_login) references login (codigo_login)
);

create table cliente (
codigo_cliente int not null auto_increment primary key,
cpf_cliente varchar(14) not null,
nome varchar(100) not null,
rg varchar(20) not null,
endereco varchar(255) not null,
telefone varchar(20) not null,
email varchar(100) not null,
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
codigo_cliente int,
data_venda date not null,
valor decimal(10, 2) not null,
metodo_pagamento varchar(100) not null,
codigo_transacao varchar(20) not null,
foreign key (codigo_cliente) references cliente (codigo_cliente)
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

