package nba.projetnba;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "v_action_joueur_match")
public class ActionJoueurMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idstatistique")
    private int idstatistique;
    private int idmatch;
    private int idjoueur;
    private int idequipe;
    private int idaction;
    private int statusabouti;
    private int points;
    private Timestamp datetimeevenement;
    private int numerojoueur;
    private String nomjoueur;
    private String prenomjoueur;
    private String nomequipe;

    public int getIdstatistique() {
        return idstatistique;
    }

    public void setIdstatistique(int idstatistique) {
        this.idstatistique = idstatistique;
    }

    public int getIdmatch() {
        return idmatch;
    }

    public void setIdmatch(int idmatch) {
        this.idmatch = idmatch;
    }

    public int getIdjoueur() {
        return idjoueur;
    }

    public void setIdjoueur(int idjoueur) {
        this.idjoueur = idjoueur;
    }

    public int getIdequipe() {
        return idequipe;
    }

    public void setIdequipe(int idequipe) {
        this.idequipe = idequipe;
    }

    public int getIdaction() {
        return idaction;
    }

    public void setIdaction(int idaction) {
        this.idaction = idaction;
    }

    public int getStatusabouti() {
        return statusabouti;
    }

    public void setStatusabouti(int statusabouti) {
        this.statusabouti = statusabouti;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Timestamp getDatetimeevenement() {
        return datetimeevenement;
    }

    public void setDatetimeevenement(Timestamp datetimeevenement) {
        this.datetimeevenement = datetimeevenement;
    }

    public int getNumerojoueur() {
        return numerojoueur;
    }

    public void setNumerojoueur(int numerojoueur) {
        this.numerojoueur = numerojoueur;
    }

    public String getNomjoueur() {
        return nomjoueur;
    }

    public void setNomjoueur(String nomjoueur) {
        this.nomjoueur = nomjoueur;
    }

    public String getPrenomjoueur() {
        return prenomjoueur;
    }

    public void setPrenomjoueur(String prenomjoueur) {
        this.prenomjoueur = prenomjoueur;
    }

    public String getNomequipe() {
        return nomequipe;
    }

    public void setNomequipe(String nomequipe) {
        this.nomequipe = nomequipe;
    }

    public ActionJoueurMatch(int idstatistique, int idmatch, int idjoueur, int idequipe, int idaction,
                             int statusabouti, int points, Timestamp datetimeevenement, int numerojoueur,
                             String nomjoueur, String prenomjoueur, String nomequipe) {
        this.idstatistique = idstatistique;
        this.idmatch = idmatch;
        this.idjoueur = idjoueur;
        this.idequipe = idequipe;
        this.idaction = idaction;
        this.statusabouti = statusabouti;
        this.points = points;
        this.datetimeevenement = datetimeevenement;
        this.numerojoueur = numerojoueur;
        this.nomjoueur = nomjoueur;
        this.prenomjoueur = prenomjoueur;
        this.nomequipe = nomequipe;
    }

    public ActionJoueurMatch() {

    }
}

