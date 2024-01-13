package com.gestvehicule.gestvehicule.service;

import org.springframework.stereotype.Service;

import com.gestvehicule.gestvehicule.interfacerepository.VehiculeRepository;
import com.gestvehicule.gestvehicule.model.Vehicule;

import lombok.AllArgsConstructor;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService {
    private final VehiculeRepository vehiculeRepository;

    public Vehicule createVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }

    public void deleteAllVehicule() {
        vehiculeRepository.deleteAll();
    }

    public String deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
        return "Success";
    }
}
