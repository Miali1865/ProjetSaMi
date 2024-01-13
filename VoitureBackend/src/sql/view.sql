CREATE VIEW ViewAnnoncesValides AS
SELECT
    au.Id_Annonceutilisateur,
    au.matricule,
    au.dateannonce,
    au.kilometrage,
    au.annee,
    au.Id_Moteur,
    au.description,
    au.climatisation,
    au.prix,
    au.Id_Region,
    au.Id_Photo,
    au.Id_Volant,
    au.Id_Couleur,
    au.Id_Carburant,
    au.Id_Transmission,
    au.Id_Modele,
    au.Idutilisateur,
    av.datevalidation
FROM
    Annonceutilisateur au
        JOIN
    annoncevalide av ON au.Id_Annonceutilisateur = av.Id_Annonceutilisateur;
