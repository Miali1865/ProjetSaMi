CREATE DATABASE projetnba;

\c projetnba;

CREATE TABLE genre (
    idgenre SERIAL PRIMARY KEY,
    genre VARCHAR
);

CREATE TABLE personne (
    idpersonne SERIAL PRIMARY KEY,
    nom VARCHAR,
    prenom VARCHAR,
    datenaisssance DATE,
    idgenre INT,
    FOREIGN KEY (idgenre) references genre(idgenre)
);

CREATE TABLE equipe (
    idequipe SERIAL PRIMARY KEY,
    nomequipe VARCHAR,
    lieuprovenance VARCHAR
);

CREATE TABLE joueur (
    idjoueur INT PRIMARY KEY,
    idequipe INT,
    numerojoueur INT UNIQUE,
    FOREIGN KEY (idjoueur) references personne(idpersonne),
    FOREIGN KEY (idequipe) references equipe(idequipe)
);

CREATE TABLE match (
    idmatch SERIAL PRIMARY KEY,
    idequipe1 INT,
    idequipe2 INT,
    datetimedebut TIMESTAMP,
    datetimefin TIMESTAMP,
    FOREIGN KEY (idequipe1) references equipe(idequipe),
    FOREIGN KEY (idequipe2) references equipe(idequipe)
);

CREATE TABLE etatjoueur (
    idetatjoueur SERIAL PRIMARY KEY,
    etat VARCHAR
);

CREATE TABLE actionjoueur (
    idaction SERIAL PRIMARY KEY,
    action VARCHAR,
    points INT
);

CREATE TABLE activitejoueur (
    idactivite SERIAL PRIMARY KEY,
    idmatch INT,
    idjoueur INT,
    datetimeactdebut TIMESTAMP,
    datetimetactfin TIMESTAMP,
    idetatjoueur INT,
    FOREIGN KEY (idmatch) references match(idmatch),
    FOREIGN KEY (idjoueur) references joueur(idjoueur),
    FOREIGN KEY (idetatjoueur) references etatjoueur(idetatjoueur)
);


CREATE TABLE statistiquejoueur (
    idstatistique SERIAL PRIMARY KEY,
    idmatch INT,
    idjoueur INT,
    idaction INT,
    statusabouti INT,
    datetimeevenement TIMESTAMP,
    FOREIGN KEY (idmatch) references match(idmatch),
    FOREIGN KEY (idjoueur) references joueur(idjoueur),
    FOREIGN KEY (idaction) references actionjoueur(idaction)
);