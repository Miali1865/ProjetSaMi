package com.gestvehicule.gestvehicule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestvehicule.gestvehicule.model.VehiculeKilometrage;
import com.gestvehicule.gestvehicule.service.VehiculeKilometrageService;

@RestController
@RequestMapping("kilometrage")
public class VehiculeKilometrageController {
    @Autowired
    private VehiculeKilometrageService vehiculeKilometrageService;

    @PostMapping("/create")
    public VehiculeKilometrage create(@RequestBody VehiculeKilometrage vehiculekilometrage) {
        return vehiculeKilometrageService.createVehiculeKilometrage(vehiculekilometrage);
    }

    @GetMapping("/read")
    public List<VehiculeKilometrage> read() {
        return vehiculeKilometrageService.getAllVehiculeKilometrages();
    }

    @PutMapping("/update/{id}")
    public VehiculeKilometrage updateUser(@PathVariable Long id, @RequestBody VehiculeKilometrage vehiculeKilometrage) {
        return vehiculeKilometrageService.updateVehiculeKilometrage(id, vehiculeKilometrage);
    }
}
