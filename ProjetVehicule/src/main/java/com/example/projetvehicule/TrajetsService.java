package com.example.projetvehicule;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TrajetsService {

    private final TrajetsRepository trajetsRepository;

    @Autowired
    public TrajetsService(TrajetsRepository trajetsRepository) {
        this.trajetsRepository = trajetsRepository;
    }

    public Trajets addTrajets(Trajets trajets) {
        return trajetsRepository.save(trajets);
    }


    public List<Trajets> getAllTrajets() {
        return trajetsRepository.findAll();
    }


    public Optional<Trajets> findTrajetsById(Integer id) {
        return trajetsRepository.findById(id);
    }


    public Trajets updateTrajets(Trajets trajets) {
        return trajetsRepository.save(trajets);
    }


    public void deleteTrajets(Integer id) {
        trajetsRepository.deleteById(id);
    }
}
