INSERT INTO team (name)
VALUES ('team-1'),
       ('team-2'),
       ('team-3');

INSERT INTO team_play_against (datetime, stadium, team_a_id, team_b_id)
VALUES ('2022-12-19', 'stadium-1', 1, 2),
       ('2022-12-20', 'stadium-2', 2, 3),
       ('2022-12-20', 'stadium-2', 3, 1);

INSERT INTO player (name, number, team_id)
VALUES ('player-1', 2, 1),
       ('player-2', 10, 2),
       ('player-3', 9, 3),
       ('player-4', 11, 3);

INSERT INTO sponsor (name)
VALUES ('sponsor-1'),
       ('sponsor-2'),
       ('sponsor-3');

INSERT INTO team_have_sponsor (team_id, sponsor_id)
VALUES (1, 1),
       (2, 1),
       (3, 2),
       (3, 3);
