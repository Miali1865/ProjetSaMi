package com.example.projetvehicule;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/trajets")
public class TrajetsController {

    private final TrajetsService trajetsService;

    @Autowired
    public TrajetsController(TrajetsService trajetsService) { this.trajetsService = trajetsService; }

    @PostMapping()
    public ResponseEntity<Trajets> addTrajets(@RequestBody Trajets trajets) {
        Trajets createdTrajets = trajetsService.addTrajets(trajets);
        return  new ResponseEntity<>(createdTrajets, HttpStatus.CREATED);
    }

    @GetMapping("/listkilometrage")
    public Iterable<Trajets> getTrajets() { return trajetsService.getAllTrajets(); }

    @DeleteMapping("/{idtrajet}")
    public ResponseEntity<String> deleteTrajet(@PathVariable Integer idtrajet) {
        trajetsService.deleteTrajets(idtrajet);
        return ResponseEntity.ok("Trajet with ID " + idtrajet + " has been deleted");
    }

    @PostMapping("{idtrajet}")
    public ResponseEntity<Trajets> updateTrajet(@PathVariable int idtrajet, @RequestBody Trajets updatedTrajets) {
        Optional<Trajets> optionalTrajets = trajetsService.findTrajetsById(idtrajet);

        if (optionalTrajets.isPresent()) {
            Trajets existingTrajets = optionalTrajets.get();
            existingTrajets.setIdvehicule(updatedTrajets.getIdvehicule());
            existingTrajets.setDatetrajet(updatedTrajets.getDatetrajet());
            existingTrajets.setKilometragedepart(updatedTrajets.getKilometragedepart());
            existingTrajets.setKilometragearrivee(updatedTrajets.getKilometragearrivee());

            Trajets updatedEntity = trajetsService.updateTrajets(existingTrajets);
            return new ResponseEntity<>(updatedEntity, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
