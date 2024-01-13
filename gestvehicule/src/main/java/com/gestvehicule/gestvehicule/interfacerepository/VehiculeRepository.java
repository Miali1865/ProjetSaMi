package com.gestvehicule.gestvehicule.interfacerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestvehicule.gestvehicule.model.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

}
