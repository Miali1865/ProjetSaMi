package nba.projetnba;

import jakarta.persistence.*;

@Entity
@Table(name = "statistiquejoueur")
public class StatistiqueJoueur {

    @Id
    @Column(name = "idstatistique")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idstatistique ;

    private int idmatch;
    private int idjoueur;
    private int idaction;
    private int statusabouti;

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
}
