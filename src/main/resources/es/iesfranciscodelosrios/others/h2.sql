create schema if not exists Medieval;
set schema Medieval;
CREATE TABLE IF NOT EXISTS Usuario(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nickname VARCHAR(30) NOT NULL UNIQUE,
    password VARCHAR(256) NOT NULL
);

CREATE TABLE IF NOT EXISTS Partida(
    id INT PRIMARY KEY AUTO_INCREMENT,
    turnos INT NOT NULL,
    poblacion DOUBLE NOT NULL,
    poblacionCambio DOUBLE NOT NULL,
    corrupcion DOUBLE NOT NULL,
    corrupcionCambio DOUBLE NOT NULL,
    estabilidad DOUBLE NOT NULL,
    estabilidadCambio DOUBLE NOT NULL,
    dinero DOUBLE NOT NULL,
    impuestos DOUBLE NOT NULL,
    inflacion DOUBLE NOT NULL,
    inflacionCambio DOUBLE NOT NULL,
    soldados DOUBLE NOT NULL,
    soldadosCambio DOUBLE NOT NULL,
    tabernas DOUBLE NOT NULL,
    cuarteles INT NOT NULL ,
    hospitales INT NOT NULL ,
    escuelas INT NOT NULL ,
    iglesias INT NOT NULL ,
    bancos INT NOT NULL,
    userid INT NOT NULL,
    nombre VARCHAR NOT NULL ,
    FOREIGN KEY (userid) REFERENCES Usuario(id)
);



