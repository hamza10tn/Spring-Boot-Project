package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.entites.Etudiant;

public interface ChambreRepository  extends JpaRepository<Chambre, Long> {
}
