package com.example.projetvehicule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/vehicules")
public class VehiculeController {

    private final VehiculeService vehiculeService;

    @Autowired
    public VehiculeController(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    @PostMapping()
    public ResponseEntity<Vehicule> addVehicule(@RequestBody Vehicule vehicule) {
        Vehicule createdVehicule = vehiculeService.addVehicule(vehicule);
        return new ResponseEntity<>(createdVehicule, HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public Iterable<Vehicule> getVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @GetMapping("/{idvehicule}")
    public Optional<Vehicule> findVehiculeById(@PathVariable Integer idvehicule) {
        return vehiculeService.findVehiculeById(idvehicule);
    }

    @PutMapping("/{idvehicule}")
    public ResponseEntity<Vehicule> updateVehicule(@PathVariable int idvehicule, @RequestBody Vehicule updatedVehicule) {
        Optional<Vehicule> optionalVehicule = vehiculeService.findVehiculeById(idvehicule);

        if (optionalVehicule.isPresent()) {
            Vehicule existingVehicule = optionalVehicule.get();
            existingVehicule.setImmatriculation(updatedVehicule.getImmatriculation());
            existingVehicule.setMarque(updatedVehicule.getMarque());
            existingVehicule.setModele(updatedVehicule.getModele());
            existingVehicule.setAnnee(updatedVehicule.getAnnee());
            existingVehicule.setKilometrage(updatedVehicule.getKilometrage());

            Vehicule updatedEntity = vehiculeService.updateVehicule(existingVehicule);
            return new ResponseEntity<>(updatedEntity, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{idvehicule}")
    public ResponseEntity<String> deleteVehicule(@PathVariable Integer idvehicule) {
        vehiculeService.deleteVehicule(idvehicule);
        return ResponseEntity.ok("Vehicule with ID " + idvehicule + " has been deleted");
    }

}
