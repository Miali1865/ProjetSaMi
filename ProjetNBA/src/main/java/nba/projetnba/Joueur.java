package nba.projetnba;

import jakarta.persistence.*;

@Entity
@Table(name = "joueur")
public class Joueur {

    @Id
    @Column(name = "idjoueur")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idjoueur;
    private int idequipe;
    private int numerojoueur;

    public Integer getIdjoueur() {
        return idjoueur;
    }

    public void setIdjoueur(Integer idjoueur) {
        this.idjoueur = idjoueur;
    }

    public int getIdequipe() {
        return idequipe;
    }

    public void setIdequipe(int idequipe) {
        this.idequipe = idequipe;
    }

    public int getNumerojoueur() {
        return numerojoueur;
    }

    public void setNumerojoueur(int numerojoueur) {
        this.numerojoueur = numerojoueur;
    }
}
