create schema if not exists Medieval;
set schema Medieval;
CREATE TABLE IF NOT EXISTS Usuario(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nickname VARCHAR(30) NOT NULL UNIQUE,
    password VARCHAR(256) NOT NULL
);



