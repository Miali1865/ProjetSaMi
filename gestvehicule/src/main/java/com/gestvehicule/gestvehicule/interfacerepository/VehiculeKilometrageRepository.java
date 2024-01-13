package com.gestvehicule.gestvehicule.interfacerepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestvehicule.gestvehicule.model.VehiculeKilometrage;

public interface VehiculeKilometrageRepository extends JpaRepository<VehiculeKilometrage, Long>{
    @Query("SELECT vehicule_k FROM VehiculeKilometrage vehicule_k WHERE vehicule_k.vehicule.id = :vehiculeId")
    Optional<VehiculeKilometrage> findByVehiculeId(@Param("vehiculeId") Long vehiculeId);
}
