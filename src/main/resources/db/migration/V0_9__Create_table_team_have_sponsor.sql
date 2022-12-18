CREATE TABLE team_have_sponsor
(
    team_id serial references team(id),
    sponsor_id serial references sponsor(id),
    PRIMARY KEY (team_id, sponsor_id)
);