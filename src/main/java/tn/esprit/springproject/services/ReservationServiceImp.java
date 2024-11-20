package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Reservation;
import tn.esprit.springproject.repository.ReservationRepository;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class ReservationServiceImp implements IReservationService{
    private ReservationRepository rp;
    @Override
    public Reservation addReservation(Reservation e) {
        return rp.save(e);
    }

    @Override
    public Reservation updateReservation(Reservation e) {
        return rp.save(e);
    }

    @Override
    public List<Reservation> retreiveAllReservation() {
        return rp.findAll();
    }

    @Override
    public Reservation retreiveReservationById(long idE) {
        return rp.findById(idE).orElse(null);
    }

    @Override
    public void deleteReservationById(long idE) {
        rp.deleteById(idE);
    }

    @Override
    public long getReservationParAnneeUniversitaire(LocalDate debutAnnee, LocalDate finAnnee) {
     return   rp.countByDataDebutBetween(debutAnnee,finAnnee);
    }

    @Override
     @Scheduled(fixedRate = 50000) // Run every 50 seconds
        public void mettreAJourEtAfficherReservations() {
            LocalDate cutoffDate = LocalDate.of(2024, 1, 1);
            List<Reservation> reservations = rp.findAll();

            for (Reservation reservation : reservations) {
                if (reservation.getDataDebut().isBefore(cutoffDate)) {
                    reservation.setEstValide(false);
                    rp.save(reservation);
                }
            }

            log.info("Toutes les réservations: " + reservations);
        }


}
