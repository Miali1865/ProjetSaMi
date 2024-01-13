CREATE OR REPLACE VIEW v_action_joueur_match AS
SELECT
    sj.idstatistique,
    sj.idmatch,
    sj.idjoueur,
    e.idequipe,
    sj.idaction,
    sj.statusabouti,
    a.points,
    sj.datetimeevenement,
    j.numerojoueur,
    p.nom AS nomjoueur,
    p.prenom AS prenomjoueur,
    e.nomequipe
FROM
    statistiquejoueur sj
JOIN
    joueur j ON sj.idjoueur = j.idjoueur
JOIN
    personne p ON j.idjoueur = p.idpersonne
JOIN
    equipe e ON j.idequipe = e.idequipe
JOIN
    actionjoueur a ON a.idaction = sj.idaction;

CREATE OR REPLACE VIEW v_action_joueur_match_total_points AS
SELECT
    sj.idjoueur,
    e.idequipe,
    a.idaction,
    a.action AS actioneffectuee,
    SUM(a.points) AS totalpoints
FROM
    statistiquejoueur sj
        JOIN
    joueur j ON sj.idjoueur = j.idjoueur
        JOIN
    equipe e ON j.idequipe = e.idequipe
        JOIN
    actionjoueur a ON a.idaction = sj.idaction
WHERE
        sj.statusabouti = 1
GROUP BY
    sj.idjoueur, e.idequipe, a.action , a.idaction;
