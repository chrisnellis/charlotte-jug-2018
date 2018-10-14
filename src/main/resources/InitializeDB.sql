CREATE TABLE videogames.videogame
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    videogame_name varchar(255),
    max_players int(11),
    platform varchar(255)
);
CREATE UNIQUE INDEX videogame_id_uindex ON videogames.videogame (id);
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (1, 'New Super Mario Bros Wii', 4, 'Wii');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (2, 'Jackbox Party Pack 1', 8, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (3, 'Jackbox Party Pack 2', 8, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (4, 'Jackbox Party Pack 3', 8, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (5, 'Move or Die', 4, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (6, 'Crawl', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (7, 'Super Mario Party', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (8, 'Snipperclips', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (9, 'Just Dance', 4, 'Wii');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (10, 'Black Ops 3 Zombies', 2, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (11, 'Mario Party', 4, 'Wii');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (12, 'Overcooked', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (13, 'Bomberman', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (14, 'Mario Kart 8 Deluxe', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (15, 'Monaco', 4, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (16, 'Ultimate Chicken Horse', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (17, 'Puyo Puyo Tetris', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (18, 'Hidden in Plain Sight', 4, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (19, 'Starwhal', 4, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (20, 'Runbow', 4, 'Switch');