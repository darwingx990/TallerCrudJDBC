CREATE database libreria_CRUD;

use libreria_CRUD;

CREATE TABLE autores(
id int auto_increment primary key,
name varchar(40) not null,
nacionality varchar(10) not null
);

CREATE table book(
id int auto_increment primary key,
idAutor int,
title varchar(40) not null,
year varchar(4) not null,
price int not null,
foreign key (idAutor) references autores(id)
);

select * from autores;

select * from book
JOIN autores ON book.idAutor = autores.id;
INSERT book (idAutor, title, year, price) VALUES (1,1,"100 años de soledad", "1990", 150000);


INSERT autores (name, nacionality) VALUES ("Darwing", "Colombiano"), ("Ayda", "Colombiano"), ("Jesus", "Israelita");
INSERT book (idAutor, title, year, price) VALUES (1, "100 años de soledad", "1990", 150000);

