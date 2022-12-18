CREATE TABLE team_play_against
(
    id serial primary key,
    datetime date not null,
    stadium varchar(50) not null,
    team1_id int references team(id) unique,
    team2_id int references team(id) unique
);