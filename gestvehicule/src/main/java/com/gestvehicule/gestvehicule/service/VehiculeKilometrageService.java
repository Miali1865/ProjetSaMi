package com.gestvehicule.gestvehicule.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestvehicule.gestvehicule.interfacerepository.VehiculeKilometrageRepository;
import com.gestvehicule.gestvehicule.model.VehiculeKilometrage;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VehiculeKilometrageService {
    private final VehiculeKilometrageRepository vehiculeKilometrageRepository;

    public VehiculeKilometrage createVehiculeKilometrage(VehiculeKilometrage vehiculeKilometrage) {
        return vehiculeKilometrageRepository.save(vehiculeKilometrage);
    }

    public List<VehiculeKilometrage> getAllVehiculeKilometrages() {
        return vehiculeKilometrageRepository.findAll();
    }

    public VehiculeKilometrage updateVehiculeKilometrage(Long id_vehicule, VehiculeKilometrage vehiculeKilometrage) {
        return vehiculeKilometrageRepository.findByVehiculeId(id_vehicule).map(vckilometrage -> {
            // vckilometrage.setVehicule(vehiculeKilometrage.getVehicule());
            vckilometrage.setDate(vehiculeKilometrage.getDate());
            vckilometrage.setDebutkm(vehiculeKilometrage.getDebutkm());
            vckilometrage.setFinkm(vehiculeKilometrage.getFinkm());
            return vehiculeKilometrageRepository.save(vckilometrage);
        }).orElseThrow(() -> new RuntimeException("Vehicule non trouvé"));
    }
}
