--SUJET : GESTION DE FLOTTE DE VEHICULES

--Base de donnée : gest_vehicule

--Author : Mahefa

--Création de la database
CREATE DATABASE gest_vehicule;
\c gest_vehicule;


--Structure table Utilisateur
CREATE TABLE IF NOT EXISTS Utilisateur (
   id_utilisateur SERIAL PRIMARY KEY,
   name VARCHAR(50) NOT NULL,
   first_name VARCHAR(50) NOT NULL,
   birthday_date DATE
);


--Structure table Utilisateur_account
CREATE TABLE IF NOT EXISTS Utilisateur_account (
   id_utilisateur_account SERIAL PRIMARY KEY,
   id_utilisateur INT NOT NULL,
   email VARCHAR(50) NOT NULL UNIQUE,
   password VARCHAR(50) NOT NULL UNIQUE,
   FOREIGN KEY (id_utilisateur) REFERENCES Utilisateur(id_utilisateur)
);


--Structure table Marque
CREATE TABLE IF NOT EXISTS Marque (
   id_marque SERIAL PRIMARY KEY,
   marque VARCHAR(50) NOT NULL UNIQUE
);


--Stucture table Vehicule
CREATE TABLE IF NOT EXISTS Vehicule (
   id_vehicule SERIAL PRIMARY KEY,
   id_marque INT NOT NULL,
   modele VARCHAR(50),
   FOREIGN KEY (id_marque) REFERENCES Marque(id_marque)
);


--Structure table Vehicule_Kilometrage
CREATE TABLE IF NOT EXISTS Vehicule_Kilometrage (
   id_vehicule_kilometrage SERIAL PRIMARY KEY,
   id_vehicule INT NOT NULL,
   date DATE,
   debut_km DECIMAL(10),
   fin_km DECIMAL(10),
   FOREIGN KEY (id_vehicule) REFERENCES Vehicule(id_vehicule)
);


-----------------------------------------------------------------------------
--INSERTION DES DONNES 


--Insertion Marque
INSERT INTO Marque (marque) VALUES ('AUDI');
INSERT INTO Marque (marque) VALUES ('MERCEDES');
INSERT INTO Marque (marque) VALUES ('BMW');
INSERT INTO Marque (marque) VALUES ('TOYOTA');


--Insertion Vehicule
INSERT INTO Vehicule (id_marque,modele) VALUES (1,'Q7');
INSERT INTO Vehicule (id_marque,modele) VALUES (1,'Q8');


--Insertion Utilisateur
INSERT INTO Utilisateur (name,first_name,birthday_date) VALUES ('RASAMISOA','Mahefa','2004-01-01');
INSERT INTO Utilisateur (name,first_name,birthday_date) VALUES ('RASAMISOA','Mihanta','1999-12-06');


--Insertion Utilisateur_account
INSERT INTO Utilisateur_account (id_utilisateur,email,password) VALUES (1,'mahefa@gmail.com','mahefa');
INSERT INTO Utilisateur_account (id_utilisateur,email,password) VALUES (2,'mihanta@gmail.com','mihanta');