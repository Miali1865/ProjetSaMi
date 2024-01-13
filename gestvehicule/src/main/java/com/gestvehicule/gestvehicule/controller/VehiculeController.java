package com.gestvehicule.gestvehicule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestvehicule.gestvehicule.model.Vehicule;
import com.gestvehicule.gestvehicule.service.VehiculeService;

import java.util.List;

@RestController
@RequestMapping("/vehicule")
public class VehiculeController {
    @Autowired
    private VehiculeService vehiculeService;

    @PostMapping("/create")
    public Vehicule create(@RequestBody Vehicule vehicule) {
        return vehiculeService.createVehicule(vehicule);
    }

    @GetMapping("/read")
    public List<Vehicule> read() {
        return vehiculeService.getAllVehicules();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return vehiculeService.deleteVehicule(id);
    }
}
