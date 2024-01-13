package back.service;


import back.model.Marque;
import back.repository.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarqueService {

    private final MarqueRepository marqueRepository;

    @Autowired
    public MarqueService(MarqueRepository marqueRepository) {
        this.marqueRepository = marqueRepository;
    }

    public Marque addMarque(Marque marque) {
        return marqueRepository.save(marque);
    }

    public List<Marque> getAllMarque() { return marqueRepository.findAll(); }
}
