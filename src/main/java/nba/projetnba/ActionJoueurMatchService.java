package nba.projetnba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class ActionJoueurMatchService {
    public final ActionJoueurMatchRepository actionJoueurMatchRepository;

    @Autowired
    public ActionJoueurMatchService(ActionJoueurMatchRepository actionJoueurMatchRepository) {
        this.actionJoueurMatchRepository = actionJoueurMatchRepository;
    }
    public List<ActionJoueurMatch> getListStatistiqueJoueur() throws Exception {
        // Utilisez directement la méthode du repository
        try {
            return actionJoueurMatchRepository.findAllFromCustomView();
        } catch (Exception e) {
            // Log or rethrow the exception as needed
            throw new Exception("Error while fetching data from the custom view", e);
        }
    }
}
