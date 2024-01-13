package nba.projetnba;

import nba.projetnba.StatistiqueJoueur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import nba.projetnba.StatistiqueJoueurRepository;
import java.util.List;

@Service
public class StatistiqueJoueurService {
    public final StatistiqueJoueurRepository statistiqueJoueurRepository;

    @Autowired
    public StatistiqueJoueurService(StatistiqueJoueurRepository statistiqueJoueurRepository) {
        this.statistiqueJoueurRepository = statistiqueJoueurRepository;
    }

    public List<StatistiqueJoueur> getAllStatistiques() {
        return statistiqueJoueurRepository.findAll();
    }



}
