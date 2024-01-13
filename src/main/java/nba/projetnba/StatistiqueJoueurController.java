package nba.projetnba;

import nba.projetnba.ActionJoueurMatch;
import nba.projetnba.StatistiqueJoueur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import nba.projetnba.StatistiqueJoueurService;
import java.util.List;

@RestController
@RequestMapping("/statistique")
public class StatistiqueJoueurController {

    private final StatistiqueJoueurService statistiqueJoueurService;

    @Autowired
    public StatistiqueJoueurController(StatistiqueJoueurService statistiqueJoueurService ) { this.statistiqueJoueurService = statistiqueJoueurService; }

    @GetMapping("/list")
    public Iterable<StatistiqueJoueur> getListStatistiqueJoueur() {
        return statistiqueJoueurService.getAllStatistiques();
    }

}
