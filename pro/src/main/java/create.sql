create table User(
    id          int             primary key     auto_increment,
    name        varchar(40)     NOT NULL,
    password    varchar(40)     NOT NULL
);

create table Information(
    id          int             primary key     auto_increment,
    health      int             NOT NULL,
);

