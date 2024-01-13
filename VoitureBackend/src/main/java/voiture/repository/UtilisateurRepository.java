package voiture.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import voiture.model.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
  Optional<Utilisateur> findByLoginAndMotdepasse(
    String login,
    String motdepasse
  );
  Optional<Utilisateur> findByLogin(String login);

}
