package back.repository;

import back.model.Marque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarqueRepository extends JpaRepository<Marque, Integer> {
}
