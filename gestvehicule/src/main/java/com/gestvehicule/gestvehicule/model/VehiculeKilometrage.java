package com.gestvehicule.gestvehicule.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Vehicule_Kilometrage")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VehiculeKilometrage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vehicule_kilometrage;

    @ManyToOne
    @JoinColumn(name = "id_vehicule")
    private Vehicule vehicule;

    @Column(name = "date")
    private Date date;

    @Column(name = "debut_km")
    private BigDecimal debutkm;

    @Column(name = "fin_km")
    private BigDecimal finkm;

}
