package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Etudiant;

public interface BlocRepository  extends JpaRepository<Bloc, Long> {
}
