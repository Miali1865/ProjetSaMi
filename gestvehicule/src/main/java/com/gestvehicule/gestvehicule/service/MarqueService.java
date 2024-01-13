package com.gestvehicule.gestvehicule.service;

import org.springframework.stereotype.Service;

import com.gestvehicule.gestvehicule.interfacerepository.MarqueRepository;
import com.gestvehicule.gestvehicule.model.Marque;

import lombok.AllArgsConstructor;

import java.util.List;

@Service
@AllArgsConstructor
public class MarqueService {
    private final MarqueRepository marqueRepository;

    public Marque createMarque(Marque marque) {
        return marqueRepository.save(marque);
    }

    public List<Marque> getAllMarque() {
        return marqueRepository.findAll();
    }

    public void deleteAllMarque() {
        marqueRepository.deleteAll();
    }

    public String deleteMarque(Long id) {
        marqueRepository.deleteById(id);
        return "Success";
    }
}
