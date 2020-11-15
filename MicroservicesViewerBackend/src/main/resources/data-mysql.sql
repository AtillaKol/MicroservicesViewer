

create database if not exists MicroservicesViewer;

use MicroservicesViewer;

create table if not exists Viewers(
    ViewerUsername varchar(20) not null primary key,
    ViewerPassword varchar(100) not null,
    ViewerName varchar(50) not null,
    ViewerSurname varchar(50) not null
);

create table if not exists Microservices(
    MicroserviceId int not null primary key auto_increment,
    # Solle genuegen :)
    MicroserviceURI varchar(500) not null,
    ViewerUsername varchar(20) not null,
    foreign key (ViewerUsername) references Viewers(ViewerUsername)
);