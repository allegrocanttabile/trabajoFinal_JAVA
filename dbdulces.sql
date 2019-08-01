drop database if exists dbdulces;
create database dbdulces;
use dbdulces;

create table persona(
id int not null,
nombres varchar(50)not null,
apellidos varchar(50)not null,
dni char(8) not null,
fechaNacimiento date not null,
sexo char(1) not null,
direccion varchar(200)not null,
celular varchar(9)not null,
fechaIngreso date not null,
pass varchar(200) not null,
cargoId int,
transporteId int
);

create table cargo(
id int not null,
tipo varchar(200)not null,
oficinaId int
);


create table transporte(
id int not null,
placa varchar(50)not null,
anoFabricacion date not null,
fechaMatenimiento date not null,
tipoId int,
marcaId int,
modeloId int,
oficinaId int,
cargoId int
);


create table tipo(
id int not null,
nombre varchar(200)not null
);


create table marca(
id int not null,
nombre varchar(200)not null
);

create table modelo(
id int not null,
nombre varchar(200)not null
);

create table oficina(
id int not null,
nombre varchar(200)not null,
direccion varchar(200)not null,
telefono varchar(200)not null
);

create table registro(
id int not null,
trackNumber varchar(200)not null,
fechaRecojo date not null,
fechaEntrega date not null,
estado varchar(10)not null
);

create table empresa(
id int not null,
nombre varchar(10)not null,
ruc char(11)not null,
direccion varchar(200)not null,
telefono char(9)not null,
correo varchar(200)not null,
eClienteId int
);

create table eCliente(
id int not null,
nombres varchar(50)not null,
apellidos varchar(50)not null,
direccionEnvio varchar(200)not null,
telefono char(9)not null,
correo varchar(200)not null,
eCategoriaId int,
eMarcaId int,
eModeloId int,
registroId int
);


create table eCategoria(
id int not null,
nombre varchar(200)not null
);

create table eMarca(
id int not null,
nombre varchar(200)not null
);


create table eModelo(
id int not null,
nombre varchar(200)not null
);
	
alter table persona modify id int not null primary key auto_increment;
alter table cargo modify id int not null primary key auto_increment;
alter table transporte modify id int not null primary key auto_increment;
alter table tipo modify id int not null primary key auto_increment;
alter table marca modify id int not null primary key auto_increment;
alter table modelo modify id int not null primary key auto_increment;
alter table oficina modify id int not null primary key auto_increment;
alter table registro modify id int not null primary key auto_increment;
alter table empresa modify id int not null primary key auto_increment;
alter table eCliente modify id int not null primary key auto_increment;
alter table eCategoria modify id int not null primary key auto_increment;
alter table eMarca modify id int not null primary key auto_increment;
alter table eModelo modify id int not null primary key auto_increment;


alter table cargo add constraint fk_CargoPersona foreign key (id) references persona(id);
alter table transporte add constraint fk_TransportePersona foreign key (id) references persona(id);


/*
alter table persona add constraint fk_CargoPersona foreign key (cargoId) references cargo(id);
alter table persona add constraint fk_TransportePersona foreign key (transporteId) references transporte(id);
alter table transporte add constraint fk_TipoTransporte foreign key (tipoId) references tipo(id);
alter table transporte add constraint fk_MarcaTransporte foreign key (marcaId) references marca(id);
alter table transporte add constraint fk_ModeloTransporte foreign key (modeloId) references modelo(id);
alter table transporte add constraint fk_CargoTransporte foreign key (cargoId) references cargo(id);
alter table transporte add constraint fk_OficinaTransporte foreign key (oficinaId) references oficina(id);
alter table empresa add constraint fk_EclienteEmpresa foreign key (eClienteId) references eCliente(id);
alter table eCliente add constraint fk_EcategoriaEcliente foreign key (eCategoriaId) references eCategoria(id);
alter table eCliente add constraint fk_EmarcaEcliente foreign key (eMarcaId) references eMarca(id);
alter table eCliente add constraint fk_EmodeloEcliente foreign key (eModeloId) references eModelo(id);
alter table eCliente add constraint fk_RegistroEcliente foreign key (registroId) references registro(id);

*/
----------- STORE PROCEDURE-------------

/*---TABLA TIPO---*/
delimiter $$
create procedure sp_crTipo(
in p_id int,
in p_nombre varchar(200)
)
begin
insert into tipo(id, nombre) values(p_id, p_nombre);
end $$

delimiter $$
create procedure sp_reTipo()
begin
select * from tipo;
end $$


delimiter $$
create procedure sp_upTipo(
in p_id int,
in p_nombre varchar(200)
)
begin
update tipo set nombre=p_nombre where id=p_id;
end $$

delimiter $$
create procedure sp_deTipo(
in p_id int
)
begin
delete from tipo where id=p_id;
end $$
