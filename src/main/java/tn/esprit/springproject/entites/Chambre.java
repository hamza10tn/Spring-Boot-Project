package tn.esprit.springproject.entites;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idC;
    private long numC;
   @Enumerated(EnumType.STRING)
    private TypeChambre TypeC;

    @OneToMany(mappedBy="chambre")
    private Set<Reservation> reservations;


    @ManyToOne
    private Bloc bloc;

}
