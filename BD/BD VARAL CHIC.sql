create database Varal_Chic;
use Varal_Chic;

create table Administrador (
CPF varchar(14) not null primary key,
Codigo_Administrador varchar(20) not null,
Nome varchar(100) not null,
Telefone varchar(20) not null,
Usuario varchar(50) not null,
Senha varchar(50) not null
);

create table Funcionario (
CPF varchar(14) not null primary key,
Codigo_Funcionario varchar(20) not null ,
Nome varchar(100) not null,
Telefone varchar(20) not null,
Usuario varchar(50) not null,
Senha varchar(50) not null
);

create table Cliente (
CPF varchar(14) not null primary key,
Codigo_Cliente varchar(20) not null,
Nome varchar(100) not null,
RG varchar(20) not null,
Endereco varchar(255) not null,
Telefone varchar(20) not null,
Email varchar(100) not null,
Observacao varchar(255)
);

create table produto (
codigo_produto varchar(20) not null primary key,
categoria varchar(100) not null,
quantidade_estoque int not null,
preco float(10) not null
);

create table venda (
codigo_venda varchar(20) not null primary key,
CPF varchar(14),
data_venda date not null,
valor decimal(10, 2) not null,
metodo_pagamento varchar(100) not null,
codigo_transacao varchar(20) not null,
foreign key (CPF) references cliente (CPF)
);

create table crediario (
codigo_venda varchar(20) not null primary key,
CPF varchar(14),
data_vencimento date not null,
numero_parcelas int not null,
foreign key (codigo_venda) references venda (codigo_venda),
foreign key (CPF) references cliente (CPF)
);

create table controle_financeiro (
codigo_registro int(20) not null primary key auto_increment,
tipo_registro varchar(20) not null,
valor decimal(10, 2) not null,
data_registro date not null
);