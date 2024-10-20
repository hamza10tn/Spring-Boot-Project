package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Reservation;

public interface ReservationRepository  extends JpaRepository<Reservation, Long> {
}
