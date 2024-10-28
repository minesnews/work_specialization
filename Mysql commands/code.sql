CREATE DATABASE Human_friends;
USE Human_friends;


CREATE TABLE dogs (

    id INT PRIMARY KEY AUTO_INCREMENT,

    name VARCHAR(50),

    commands VARCHAR(50),

    date_b DATE

);



CREATE TABLE cats (

    id INT PRIMARY KEY AUTO_INCREMENT,

    name VARCHAR(50),

    commands VARCHAR(50),

    date_b DATE

);



CREATE TABLE hamsters (

    id INT PRIMARY KEY AUTO_INCREMENT,

    name VARCHAR(50),

    commands VARCHAR(50),

    date_b DATE

);


CREATE TABLE camels (

    id INT PRIMARY KEY AUTO_INCREMENT,

    name VARCHAR(50),

    commands VARCHAR(50),

    date_b DATE

);



CREATE TABLE horses (

    id INT PRIMARY KEY AUTO_INCREMENT,

    name VARCHAR(50),

    commands VARCHAR(50),

    date_b DATE

);



CREATE TABLE donkeys (

    id INT PRIMARY KEY AUTO_INCREMENT,

    name VARCHAR(50),

    commands VARCHAR(50),

    date_b DATE

);


INSERT INTO dogs (name, commands, date_b) VALUES ('Кошка', 'Мяу', '2023-10-05');

INSERT INTO cats (name, commands, date_b) VALUES ('Лошадь1', 'Команда2', '2023-11-11');

INSERT INTO hamsters (name, commands, date_b) VALUES ('Осел1', 'Команда3', '2024-01-20');

INSERT INTO camels (name, commands, date_b) VALUES ('Верблюд1', 'Команда1', '2023-03-04');

INSERT INTO horses (name, commands, date_b) VALUES ('Лошадь1', 'Команда2', '2010-09-09');

INSERT INTO donkeys (name, commands, date_b) VALUES ('Осел1', 'Команда3', '2023-01-01');


CREATE TABLE horses_and_donkeys AS

SELECT * FROM horses

UNION

SELECT * FROM donkeys;


DROP TABLE horses, donkeys;


CREATE TABLE young_animals AS

SELECT id, name, commands, date_b,

DATEDIFF(NOW(), date_b) DIV 365 AS age

FROM (SELECT * FROM dogs UNION SELECT * FROM cats UNION SELECT * FROM hamsters UNION SELECT * FROM camels UNION SELECT * FROM horses_and_donkeys) AS all_animaals

WHERE DATEDIFF(NOW(), date_b) >= 365 AND DATEDIFF(NOW(), date_b) < 1095;


CREATE TABLE all_animaals AS

SELECT id, name, commands, date_b, NULL AS age, NULL AS previous_ownership

FROM dogs

UNION

SELECT id, name, commands, date_b, NULL AS age, NULL AS previous_ownership

FROM cats

UNION

SELECT id, name, commands, date_b, NULL AS age, NULL AS previous_ownership

FROM hamsters

UNION

SELECT id, name, commands, date_b, NULL AS age, NULL AS previous_ownership

FROM camels

UNION

SELECT id, name, commands, date_b, NULL AS age, NULL AS previous_ownership

FROM horses_and_donkeys

UNION

SELECT id, name, commands, date_b, NULL AS age, NULL AS previous_ownership

FROM young_animals;