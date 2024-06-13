create database Varal_Chic;
use Varal_Chic;

create table Administrador (
cpf varchar(14) not null primary key,
codigo_administrador varchar(20) not null auto_increment,
nome varchar(100) not null,
telefone varchar(20) not null,
usuario varchar(50) not null,
senha varchar(50) not null
);

create table Funcionario (
cpf varchar(14) not null primary key,
codigo_funcionario varchar(20) not null auto_increment,
nome varchar(100) not null,
telefone varchar(20) not null,
usuario varchar(50) not null,
senha varchar(50) not null
);

create table Cliente (
cpf varchar(14) not null primary key,
codigo_cliente varchar(20) not null auto_increment,
nome varchar(100) not null,
rg varchar(20) not null,
endereco varchar(255) not null,
telefone varchar(20) not null,
email varchar(100) not null,
observacao varchar(255)
);

create table produto (
codigo_produto varchar(20) not null primary key auto_increment,
categoria varchar(100) not null,
quantidade_estoque int not null,
preco float(10) not null
);

create table venda (
codigo_venda varchar(20) not null primary key auto_increment,
cpf varchar(14),
data_venda date not null,
valor decimal(10, 2) not null,
metodo_pagamento varchar(100) not null,
codigo_transacao varchar(20) not null,
foreign key (CPF) references cliente (CPF)
);

create table crediario (
codigo_venda varchar(20) not null primary key auto_increment,
cpf varchar(14),
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

 