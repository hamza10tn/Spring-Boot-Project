package tn.esprit.springproject.restcontrollers;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproject.services.IReservationService;

import java.time.LocalDate;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {
    private IReservationService reservationService;

    @GetMapping("/getReservationParAnneeUniversitaire/{datedebut}/{datefin}")
    public Long getReservationParAnneeUniversitaire(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate datedebut,@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate datefin){
        return reservationService.getReservationParAnneeUniversitaire(datedebut,datefin);
    }

}
