-- Marque
INSERT INTO Marque (nom) VALUES ('Toyota');
INSERT INTO Marque (nom) VALUES ('Honda');

-- Typevoiture
INSERT INTO Typevoiture (typevoiture) VALUES ('Sedan');
INSERT INTO Typevoiture (typevoiture) VALUES ('SUV');

-- Modele
INSERT INTO Modele (modele, Id_Typevoiture, Id_Marque) VALUES ('Camry', 1, 1);
INSERT INTO Modele (modele, Id_Typevoiture, Id_Marque) VALUES ('Civic', 1, 2);

-- Couleur
INSERT INTO Couleur (nom) VALUES ('Blue');
INSERT INTO Couleur (nom) VALUES ('Red');

-- Transmission
INSERT INTO Transmission (transmission_) VALUES ('Automatic');
INSERT INTO Transmission (transmission_) VALUES ('Manual');

-- Carburant
INSERT INTO Carburant (carburant) VALUES ('Gasoline');
INSERT INTO Carburant (carburant) VALUES ('Hybrid');

-- Utilisateur
INSERT INTO Utilisateur (prenom, nom, datenaissance, login, motdepasse, role, telephone)
VALUES ('John', 'Doe', '1990-01-01', 'john.doe@example.com', 'password123', 0, '1234567890');

-- Volant
INSERT INTO Volant (volant) VALUES ('Leather');
INSERT INTO Volant (volant) VALUES ('Wooden');

-- Photo
INSERT INTO Photo (nomphoto) VALUES ('car1.jpg');
INSERT INTO Photo (nomphoto) VALUES ('car2.jpg');

-- Region
INSERT INTO Region (region) VALUES ('North');
INSERT INTO Region (region) VALUES ('South');

-- Commission
INSERT INTO Commission (datecommission, pourcentage_) VALUES ('2024-01-01', 5.0);
INSERT INTO Commission (datecommission, pourcentage_) VALUES ('2024-01-02', 7.5);

-- Moteur
INSERT INTO Moteur (moteur) VALUES ('V6');
INSERT INTO Moteur (moteur) VALUES ('Electric');

-- Annonceutilisateur
INSERT INTO Annonceutilisateur (matricule, dateannonce, kilometrage, annee, Id_Moteur, description, climatisation, prix, Id_Region, Id_Photo, Id_Volant, Id_Couleur, Id_Carburant, Id_Transmission, Id_Modele, Idutilisateur)
VALUES ('ABC123', '2024-01-03', 50000.0, 2022, 1, 'Good condition', 1, 20000.0, 1, 1, 1, 1, 1, 1, 1, 1);
INSERT INTO Annonceutilisateur (matricule, dateannonce, kilometrage, annee, Id_Moteur, description, climatisation, prix, Id_Region, Id_Photo, Id_Volant, Id_Couleur, Id_Carburant, Id_Transmission, Id_Modele, Idutilisateur)
VALUES ('1896ATT', '2024-01-03', 2000.0, 2018, 1, 'Efa ratsy rasty', 1, 12000.0, 1, 1, 1, 1, 1, 1, 2, 1);

-- Annoncefavoris
INSERT INTO Annoncefavoris (Id_Annonceutilisateur, Idutilisateur) VALUES (1, 1);

-- annoncevalide
INSERT INTO annoncevalide (datevalidation, Idutilisateur, Id_Annonceutilisateur) VALUES ('2024-01-04', 1, 1);

-- Historiqueachat
INSERT INTO Historiqueachat (dateachat, prixachat, Idutilisateur, Id_Annonceutilisateur) VALUES ('2024-01-05', 19000.0, 1, 1);
