package nba.projetnba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/statistiquejoueurmatch")
public class ActionJoueurMatchController {

    public final ActionJoueurMatchService actionJoueurMatchService;

    @Autowired
    public ActionJoueurMatchController(ActionJoueurMatchService actionJoueurMatchService) {
        this.actionJoueurMatchService = actionJoueurMatchService;
    }

    @GetMapping("/liststatistiquejoueurmatch")
    public List<ActionJoueurMatch> getListStatistiqueJoueur() throws Exception {
        return actionJoueurMatchService.getListStatistiqueJoueur();
    }
}
