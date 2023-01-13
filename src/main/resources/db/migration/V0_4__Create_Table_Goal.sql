CREATE TABLE goal (
    id serial primary key not null,
    match_id int references team_play_against(id)
);