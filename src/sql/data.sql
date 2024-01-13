-- Insertion de données dans la table genre
INSERT INTO genre (genre) VALUES
('Homme'),
('Femme');

-- Insertion de données dans la table personne
INSERT INTO personne (nom, prenom, datenaisssance, idgenre) VALUES
('James', 'LeBron', '1984-12-30', 1),
('Curry', 'Stephen', '1988-03-14', 1),
('Durant', 'Kevin', '1988-09-29', 1),
('Harden', 'James', '1989-08-26', 1),
('Antetokounmpo', 'Giannis', '1994-12-06', 1),
('Davis', 'Anthony', '1993-03-11', 1),
('Lillard', 'Damian', '1990-07-15', 1),
('Embiid', 'Joel', '1994-03-16', 1),
('Tatum', 'Jayson', '1998-03-03', 1),
('Mitchell', 'Donovan', '1996-09-07', 1);

-- Insertion de données dans la table equipe
INSERT INTO equipe (nomequipe, lieuprovenance) VALUES
('Los Angeles Lakers', 'Los Angeles'),
('Golden State Warriors', 'San Francisco');

-- Insertion de données dans la table joueur
INSERT INTO joueur (idjoueur, idequipe, numerojoueur) VALUES
(1, 1, 23),
(2, 1, 30),
(3, 1, 7),
(4, 1, 13),
(5, 1, 34),
(6, 2, 3),
(7, 2, 10),
(8, 2, 21),
(9, 2, 0),
(10, 2, 45);

-- Insertion de données dans la table match
INSERT INTO match (idequipe1, idequipe2, datetimedebut, datetimefin) VALUES
(1, 2, '2023-01-01 18:00:00', '2023-01-01 20:00:00'),
(2, 1, '2023-01-02 15:30:00', '2023-01-02 17:30:00');

-- Insertion de données dans la table etatjoueur
INSERT INTO etatjoueur (etat) VALUES
('Actif'),
('Blessé');

INSERT INTO actionjoueur (action, points) VALUES
('Rebonds par match', 0),
('Tire 1 point', 1),
('Tire 2 points', 2),
('Tire 3 points', 3),
('Passes décisives par match', 0),
('Interceptions par match', 0),
('Contres par match', 0),
('Balles perdues par match', 0),
('Fautes personnelles par match', 0);

-- Insertion de données dans la table activitejoueur pour tous les joueurs
INSERT INTO activitejoueur (idmatch, idjoueur, datetimeactdebut, datetimetactfin, idetatjoueur) VALUES
(1, 1, '2023-01-01 18:15:00', '2023-01-01 19:30:00', 1),
(2, 1, '2023-01-02 16:00:00', '2023-01-02 17:15:00', 2),

(1, 2, '2023-01-01 18:10:00', '2023-01-01 19:45:00', 1),
(2, 2, '2023-01-02 16:05:00', '2023-01-02 17:30:00', 2),

(1, 3, '2023-01-01 18:20:00', '2023-01-01 19:40:00', 1),
(2, 3, '2023-01-02 16:15:00', '2023-01-02 17:20:00', 2),

(1, 4, '2023-01-01 18:25:00', '2023-01-01 19:35:00', 1),
(2, 4, '2023-01-02 16:30:00', '2023-01-02 17:45:00', 2),

(1, 5, '2023-01-01 18:30:00', '2023-01-01 19:50:00', 1),
(2, 5, '2023-01-02 16:35:00', '2023-01-02 17:25:00', 2),

(1, 6, '2023-01-01 18:35:00', '2023-01-01 19:55:00', 1),
(2, 6, '2023-01-02 16:40:00', '2023-01-02 17:35:00', 2),

(1, 7, '2023-01-01 18:40:00', '2023-01-01 19:45:00', 1),
(2, 7, '2023-01-02 16:45:00', '2023-01-02 17:50:00', 2),

(1, 8, '2023-01-01 18:45:00', '2023-01-01 19:55:00', 1),
(2, 8, '2023-01-02 16:50:00', '2023-01-02 17:40:00', 2),

(1, 9, '2023-01-01 18:50:00', '2023-01-01 19:50:00', 1),
(2, 9, '2023-01-02 16:55:00', '2023-01-02 17:45:00', 2),

(1, 10, '2023-01-01 18:55:00', '2023-01-01 19:55:00', 1),
(2, 10, '2023-01-02 17:00:00', '2023-01-02 18:00:00', 2);


-- Insertion de données dans la table statistiquejoueur pour tous les joueurs
INSERT INTO statistiquejoueur (idmatch, idjoueur, idaction, statusabouti, datetimeevenement) VALUES
(1, 1, 1, 1, '2023-01-01 18:30:00'),
(2, 1, 3, 1, '2023-01-02 16:10:00'),

(1, 2, 2, 1, '2023-01-01 18:25:00'),
(2, 2, 4, 1, '2023-01-02 16:15:00'),

(1, 3, 1, 1, '2023-01-01 18:35:00'),
(2, 3, 4, 1, '2023-01-02 16:20:00'),

(1, 4, 2, 1, '2023-01-01 18:40:00'),
(2, 4, 3, 1, '2023-01-02 16:25:00'),

(1, 5, 1, 1, '2023-01-01 18:50:00'),
(2, 5, 4, 1, '2023-01-02 16:30:00'),

(1, 6, 2, 1, '2023-01-01 18:55:00'),
(2, 6, 3, 1, '2023-01-02 16:35:00'),

(1, 7, 3, 1, '2023-01-01 19:00:00'),
(2, 7, 4, 1, '2023-01-02 16:40:00'),

(1, 8, 1, 1, '2023-01-01 19:05:00'),
(2, 8, 4, 1, '2023-01-02 16:45:00'),

(1, 9, 2, 1, '2023-01-01 19:10:00'),
(2, 9, 3, 1, '2023-01-02 16:50:00'),

(1, 10, 3, 1, '2023-01-01 19:15:00'),
(2, 10, 4, 1, '2023-01-02 16:55:00');