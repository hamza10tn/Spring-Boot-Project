package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Universite;

public interface UniversiteRepository  extends JpaRepository<Universite, Long> {
}
