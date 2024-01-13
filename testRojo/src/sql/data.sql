INSERT INTO Etudiant (nom, prenom, date_naissance)
VALUES
    ('Dupont', 'Mialivola', '2004-01-16'),
    ('Martin', 'Loann', '2004-05-17'),
    ('Leclerc', 'Sariaka', '2003-01-26');


INSERT INTO Semestre (nomSemestre)
VALUES
    ('Semestre 1'),
    ('Semestre 2'),
    ('Semestre 3'),
    ('Semestre 4'),
    ('Semestre 5'),
    ('Semestre 6');

INSERT INTO Inscription (dateInscription, ETU, idSemestre)
VALUES
    ('2021-09-23', 1, 1),
    ('2021-09-24', 2, 1),
    ('2021-09-25', 3, 1),
    ('2022-01-23', 1, 2),
    ('2022-01-24', 2, 2),
    ('2022-01-25', 3, 2),
    ('2022-09-23', 1, 3),
    ('2022-09-24', 2, 3),
    ('2022-09-25', 3, 3),
    ('2023-01-23', 1, 4),
    ('2023-01-24', 2, 4),
    ('2023-01-25', 3, 4),
    ('2022-09-23', 1, 5),
    ('2022-09-24', 2, 5),
    ('2022-09-25', 3, 5);

INSERT INTO Matiere (nomMatiere,coefficient)
VALUES
    ('Mathématiques',3),
    ('Anglais',2),
    ('Programmation procédurale',4),
    ('Html WEB',4),
    ('Gestion',3),
    ('BdD Objet',3),
    ('Programmation Objet',4),
    ('ProgSys',4),
    ('Reseaux',4);


INSERT INTO Option (nomOption)
VALUES
    ('Option 1'),
    ('Option 2'),
    ('Option 3');


INSERT INTO Groupe (groupe)
VALUES
    ('Groupe 1'),
    ('Groupe 2'),
    ('Groupe 3');

INSERT INTO SemestreMatiere (idSemestre, idMatiere, idGroupe, idOption)
VALUES
    (1, 1, 1, 1),
    (1, 2, 2, 2),
    (1, 3, 3, 3),
    (2, 1, 1, 1),
    (2, 2, 2, 2),
    (2, 3, 3, 3);

INSERT INTO Note (dateNote, ETU, idMatiere, valeurNote)
VALUES
    ('2023-01-23', 1, 1, 15.5),
    ('2023-01-24', 2, 2, 14.5),
    ('2023-01-25', 3, 3, 16.5);


