/* insert data vehicule */
INSERT INTO vehicule (immatriculation, marque, modele, annee, kilometrage)
VALUES ('AB123CD', 'Toyota', 'Yaris', 2020, 50000);

INSERT INTO vehicule (immatriculation, marque, modele, annee, kilometrage)
VALUES ('EF456GH', 'Honda', 'Civic', 2018, 80000);

/* insert data trajets */
INSERT INTO trajets (idtrajet, idvehicule, datetrajet, kilometragedepart, kilometragearrivee)
VALUES (1, 1, '2023-11-01 08:00:00', 10000, 10500);

-- Insertion de données dans la table d'authentification
INSERT INTO authentification (login, motdepasse) VALUES
    ('utilisateur1', 'motdepasse1'),
    ('utilisateur2', 'motdepasse2'),
    ('utilisateur3', 'motdepasse3');
