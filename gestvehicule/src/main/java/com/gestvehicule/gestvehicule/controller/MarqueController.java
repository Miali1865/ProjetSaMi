package com.gestvehicule.gestvehicule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestvehicule.gestvehicule.model.Marque;
import com.gestvehicule.gestvehicule.service.MarqueService;

@RestController
@RequestMapping("/marque")
public class MarqueController {
    @Autowired
    private MarqueService marqueService;

    @PostMapping("/create")
    public Marque create(@RequestBody Marque marque) {
        return marqueService.createMarque(marque);
    }

    @GetMapping("/read")
    public List<Marque> read() {
        return marqueService.getAllMarque();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return marqueService.deleteMarque(id);
    }
}
