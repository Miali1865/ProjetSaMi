CREATE DATABASE ventevoiture;

\c ventevoiture;

CREATE TABLE Marque(
                       Id_Marque SERIAL,
                       nom VARCHAR(50) ,
                       PRIMARY KEY(Id_Marque)
);

CREATE TABLE Typevoiture(
                            Id_Typevoiture SERIAL,
                            typevoiture VARCHAR(50) ,
                            PRIMARY KEY(Id_Typevoiture),
                            UNIQUE(typevoiture)
);

CREATE TABLE Modele(
                       Id_Modele SERIAL,
                       modele VARCHAR(50) ,
                       Id_Typevoiture INTEGER NOT NULL,
                       Id_Marque INTEGER NOT NULL,
                       PRIMARY KEY(Id_Modele),
                       UNIQUE(modele),
                       FOREIGN KEY(Id_Typevoiture) REFERENCES Typevoiture(Id_Typevoiture),
                       FOREIGN KEY(Id_Marque) REFERENCES Marque(Id_Marque)
);

CREATE TABLE Couleur(
                        Id_Couleur SERIAL,
                        nom VARCHAR(50) ,
                        PRIMARY KEY(Id_Couleur),
                        UNIQUE(nom)
);

CREATE TABLE Transmission(
                             Id_Transmission SERIAL,
                             transmission_ VARCHAR(50) ,
                             PRIMARY KEY(Id_Transmission),
                             UNIQUE(transmission_)
);

CREATE TABLE Carburant(
                          Id_Carburant SERIAL,
                          carburant VARCHAR(50) ,
                          PRIMARY KEY(Id_Carburant),
                          UNIQUE(carburant)
);

CREATE TABLE Utilisateur(
                            Id_Utilisateur SERIAL,
                            prenom VARCHAR(50)  NOT NULL,
                            nom VARCHAR(50)  NOT NULL,
                            datenaissance DATE NOT NULL,
                            email VARCHAR(50)  NOT NULL,
                            motdepasse VARCHAR(50)  NOT NULL,
                            estadmin VARCHAR(50)  NOT NULL,
                            telephone VARCHAR(50) ,
                            PRIMARY KEY(Id_Utilisateur)
);

CREATE TABLE Volant(
                       Id_Volant SERIAL,
                       volant VARCHAR(50)  NOT NULL,
                       PRIMARY KEY(Id_Volant),
                       UNIQUE(volant)
);

CREATE TABLE Photo(
                      Id_Photo SERIAL,
                      nomphoto VARCHAR(50)  NOT NULL,
                      PRIMARY KEY(Id_Photo)
);

CREATE TABLE Region(
                       Id_Region SERIAL,
                       region VARCHAR(50) ,
                       PRIMARY KEY(Id_Region)
);

CREATE TABLE Commission(
                           Id_Commission SERIAL,
                           datecommission DATE,
                           pourcentage_ DOUBLE PRECISION,
                           PRIMARY KEY(Id_Commission)
);


CREATE TABLE Annonceutilisateur(
                                   Id_Annonceutilisateur SERIAL,
                                   matricule VARCHAR(50)  NOT NULL,
                                   dateannonce DATE,
                                   kilometrage DOUBLE PRECISION,
                                   annee INTEGER NOT NULL,
                                   moteur VARCHAR(50) NOT NULL,
                                   description_ TEXT,
                                   climatisation INTEGER,
                                   prix NUMERIC(15,2)  ,
                                   Id_Region INTEGER NOT NULL,
                                   Id_Photo INTEGER NOT NULL,
                                   Id_Volant INTEGER NOT NULL,
                                   Id_Couleur INTEGER NOT NULL,
                                   Id_Carburant INTEGER NOT NULL,
                                   Id_Transmission INTEGER NOT NULL,
                                   Id_Modele INTEGER NOT NULL,
                                   Id_Utilisateur INTEGER NOT NULL,
                                   PRIMARY KEY(Id_Annonceutilisateur),
                                   FOREIGN KEY(Id_Region) REFERENCES Region(Id_Region),
                                   FOREIGN KEY(Id_Photo) REFERENCES Photo(Id_Photo),
                                   FOREIGN KEY(Id_Volant) REFERENCES Volant(Id_Volant),
                                   FOREIGN KEY(Id_Couleur) REFERENCES Couleur(Id_Couleur),
                                   FOREIGN KEY(Id_Carburant) REFERENCES Carburant(Id_Carburant),
                                   FOREIGN KEY(Id_Transmission) REFERENCES Transmission(Id_Transmission),
                                   FOREIGN KEY(Id_Modele) REFERENCES Modele(Id_Modele),
                                   FOREIGN KEY(Id_Utilisateur) REFERENCES Utilisateur(Id_Utilisateur)
);

CREATE TABLE Annoncefavoris(
                               Id_Annoncefavoris SERIAL,
                               Id_Annonceutilisateur INTEGER NOT NULL,
                               Id_Utilisateur INTEGER NOT NULL,
                               PRIMARY KEY(Id_Annoncefavoris),
                               FOREIGN KEY(Id_Annonceutilisateur) REFERENCES Annonceutilisateur(Id_Annonceutilisateur),
                               FOREIGN KEY(Id_Utilisateur) REFERENCES Utilisateur(Id_Utilisateur)
);


/* Tokony tsy misy Id_Utilisateur ato */
CREATE TABLE annoncevalide(
                              Id_annoncevalide SERIAL,
                              datevalidation DATE NOT NULL,
                              Id_Utilisateur INTEGER NOT NULL,
                              Id_Annonceutilisateur INTEGER NOT NULL,
                              PRIMARY KEY(Id_annoncevalide),
                              FOREIGN KEY(Id_Utilisateur) REFERENCES Utilisateur(Id_Utilisateur),
                              FOREIGN KEY(Id_Annonceutilisateur) REFERENCES Annonceutilisateur(Id_Annonceutilisateur)
);

CREATE TABLE Historiqueachat(
                                Id_Historiqueachat SERIAL,
                                dateachat DATE,
                                prixachat DOUBLE PRECISION,
                                Id_Utilisateur INTEGER NOT NULL,
                                Id_Annonceutilisateur INTEGER NOT NULL,
                                PRIMARY KEY(Id_Historiqueachat),
                                FOREIGN KEY(Id_Utilisateur) REFERENCES Utilisateur(Id_Utilisateur),
                                FOREIGN KEY(Id_Annonceutilisateur) REFERENCES Annonceutilisateur(Id_Annonceutilisateur)
);