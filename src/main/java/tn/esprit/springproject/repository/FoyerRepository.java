package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Foyer;

public interface FoyerRepository extends JpaRepository<Foyer, Long> {
}
