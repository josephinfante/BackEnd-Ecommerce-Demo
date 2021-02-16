drop database test;
create database test;
use test;

create table category (
categoryid int auto_increment primary key,
categoryname varchar(255),
categoryimg varchar(255)
);

create table sellers (
sellersid int auto_increment primary key,
sellersname varchar(255),
sellersruc char(10),
sellersemail varchar(255)
);

create table games (
gamesid int auto_increment primary key,
gamesname varchar (255),
gamesnickname varchar(255),
gamesdescription varchar (255),
sellersid int not null references sellers,
categoryid int not null references category,
gamesbuyprice decimal,
gamessaleprice decimal,
gamesstock int,
gamesimg varchar (255)
);

create table roles (
rolesid int primary key,
rolesname varchar (255)
);

create table users (
usersid int auto_increment primary key,
usersname varchar (255),
userslastname varchar (255),
usersemail varchar (255),
userspassword varchar (255),
rolesid int default (1) references userstype ,
transactionsid int references transactions
);

create table transactions (
transactionsid int auto_increment primary key,
gamesid int not null references games,
usersid int not null references users,
transactiondate datetime default(now()),
transactionmethod varchar (255),
transactiontotal decimal
);

insert into roles values 
(1,'usuario'),
(2,'admin');


