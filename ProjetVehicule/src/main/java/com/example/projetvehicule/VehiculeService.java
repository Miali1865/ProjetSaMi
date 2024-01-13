package com.example.projetvehicule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VehiculeService {

    private final VehiculeRepository vehiculeRepository;

    @Autowired
    public VehiculeService(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }


    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }


    public Optional<Vehicule> findVehiculeById(Integer id) {
        return vehiculeRepository.findById(id);
    }


    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }


    public void deleteVehicule(Integer id) {
        vehiculeRepository.deleteById(id);
    }
}
