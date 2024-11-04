package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Reservation;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ReservationRepository  extends JpaRepository<Reservation, Long> {

    Long countByDataDebutBetween(LocalDate dated,LocalDate dataf);

}
