create database springvehicule;

\c springvehicule;

/*  Ito no manao an'ilay partie 1 */
CREATE TABLE vehicule (
    idvehicule serial PRIMARY KEY,
    immatriculation VARCHAR(50) NOT NULL,
    marque VARCHAR(50) NOT NULL,
    modele VARCHAR(50) NOT NULL,
    annee INT,
    kilometrage INT
);

CREATE TABLE trajets (
    idtrajet serial PRIMARY KEY,
    idvehicule INT,
    datetrajet TIMESTAMP,
    kilometragedepart INT,
    kilometragearrivee INT,
    foreign key (idvehicule) references vehicule (idvehicule)
);

CREATE TABLE authentification (
    idlogin serial PRIMARY KEY,
    login VARCHAR(20) UNIQUE NOT NULL,
    motdepasse VARCHAR(50) NOT NULL
);



