package voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import voiture.model.Marque;

@Repository
public interface MarqueRepository extends JpaRepository<Marque, Integer>  {
}
