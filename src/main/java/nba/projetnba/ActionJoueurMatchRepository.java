package nba.projetnba;

import nba.projetnba.ActionJoueurMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface ActionJoueurMatchRepository extends JpaRepository<ActionJoueurMatch, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM v_action_joueur_match")
    List<ActionJoueurMatch> findAllFromCustomView();
}
