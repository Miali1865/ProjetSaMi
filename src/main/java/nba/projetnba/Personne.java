package nba.projetnba;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name= "vehicule")
public class Personne {

    @Id
    @Column(name = "idpersonne")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpersonne;
    private String nom;
    private String prenom;
    private Date datenaissance;
    private int idgenre;

    public Integer getIdpersonne() {
        return idpersonne;
    }

    public void setIdpersonne(Integer idpersonne) {
        this.idpersonne = idpersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public int getIdgenre() {
        return idgenre;
    }

    public void setIdgenre(int idgenre) {
        this.idgenre = idgenre;
    }
}
