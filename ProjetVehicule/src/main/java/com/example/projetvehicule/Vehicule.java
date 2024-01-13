package com.example.projetvehicule;
import jakarta.persistence.*;

@Entity
@Table(name= "vehicule")
public class Vehicule {

    @Id
    @Column(name = "idvehicule")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idvehicule;

    @Column(name = "immatriculation")
    private String immatriculation;

    @Column(name = "marque")
    private String marque;

    @Column(name = "modele")
    private String modele;

    @Column(name = "annee")
    private int annee;

    @Column(name = "kilometrage")
    private int kilometrage;


    public Integer getIdvehicule() {
        return idvehicule;
    }

    public void setIdvehicule(Integer idvehicule) {
        this.idvehicule = idvehicule;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }
}
