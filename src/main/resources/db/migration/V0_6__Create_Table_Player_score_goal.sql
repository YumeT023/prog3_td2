CREATE TABLE player_score_goal (
    id serial primary key,
    player_id int references player(id),
    goal_id int references goal(id),
    scoring_time int not null,
    is_og bool
);