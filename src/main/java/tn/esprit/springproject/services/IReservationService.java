package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface IReservationService {
    public Reservation addReservation(Reservation e);
    public Reservation updateReservation(Reservation e);
    public List<Reservation> retreiveAllReservation();
    public Reservation retreiveReservationById(long idE);
    public void deleteReservationById(long idE);
    public long getReservationParAnneeUniversitaire( LocalDate debutAnnee, LocalDate finAnnee ) ;
    public void mettreAJourEtAfficherReservations();
}
