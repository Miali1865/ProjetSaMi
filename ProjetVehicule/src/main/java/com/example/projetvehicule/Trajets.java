package com.example.projetvehicule;

import jakarta.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name= "trajets")
public class Trajets {

    @Id
    @Column(name = "idtrajet")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtrajet;

    @Column(name = "idvehicule")
    private int idvehicule;

    public int getIdvehicule() {
        return idvehicule;
    }

    public void setIdvehicule(int idvehicule) {
        this.idvehicule = idvehicule;
    }

    @Column(name = "datetrajet")
    private Date datetrajet;

    @Column(name = "kilometragedepart")
    private int kilometragedepart;

    @Column(name = "kilometragearrivee")
    private int kilometragearrivee;

    public Integer getIdtrajet() {
        return idtrajet;
    }

    public void setIdtrajet(Integer idtrajet) {
        this.idtrajet = idtrajet;
    }

    public Date getDatetrajet() {
        return datetrajet;
    }

    public void setDatetrajet(Date datetrajet) {
        this.datetrajet = datetrajet;
    }

    public int getKilometragedepart() {
        return kilometragedepart;
    }

    public void setKilometragedepart(int kilometragedepart) {
        this.kilometragedepart = kilometragedepart;
    }

    public int getKilometragearrivee() {
        return kilometragearrivee;
    }

    public void setKilometragearrivee(int kilometragearrivee) {
        this.kilometragearrivee = kilometragearrivee;
    }
}
