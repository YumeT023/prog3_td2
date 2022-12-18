CREATE TABLE player
(
    id serial primary key,
    name varchar(100) not null,
    number int not null,
    team_id serial references team(id)
);