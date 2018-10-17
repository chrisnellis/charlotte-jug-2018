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
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (11, 'Mario Party 8', 4, 'Wii');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (12, 'Overcooked', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (13, 'Super Bomberman R', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (14, 'Mario Kart 8 Deluxe', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (15, 'Monaco', 4, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (16, 'Ultimate Chicken Horse', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (17, 'Puyo Puyo Tetris', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (18, 'Hidden in Plain Sight', 4, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (19, 'Starwhal', 4, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (20, 'Runbow', 8, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (21, 'Smash 4', 8, 'WiiU');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (22, 'Audiosurf 2', 2, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (23, 'Gang Beasts', 4, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (24, 'Goat Simulator', 4, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (25, 'Guacamelee', 2, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (26, 'Knight Squad', 4, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (27, 'Lego Games', 2, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (29, 'Rayman Legends', 4, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (30, 'Rocket League', 4, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (31, 'Sonic Mania', 2, 'PC');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (32, 'Wii Sports', 4, 'Wii');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (33, 'Wii Sports Resort', 4, 'Wii');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (34, 'Wii Play', 4, 'Wii');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (35, 'Wii Play Motion', 4, 'Wii');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (37, 'Kirby''s Dream Land', 4, 'Wii');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (38, 'Rock Band 3', 4, 'Wii');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (39, 'Mario Tennis Aces', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (40, 'Namco Museum', 2, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (41, 'Overcooked 2', 4, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (42, 'Donkey Kong Tropical Freeze', 2, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (43, 'Nintendo Games', 2, 'Switch');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (44, 'Nintendo Land', 4, 'WiiU');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (45, 'Super Mario 3D World', 4, 'WiiU');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (46, 'New Super Mario Bros U', 4, 'WiiU');
INSERT INTO videogames.videogame (id, videogame_name, max_players, platform) VALUES (47, 'Yoshi''s Woolly World', 2, 'WiiU');