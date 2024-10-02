package tn.esprit.springproject.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;
    @ManyToOne
    Bloc Bloc;

    @ManyToOne
    Chambre chambre;

    @ManyToMany
    private Set<Etudiant> etudiants;


}
