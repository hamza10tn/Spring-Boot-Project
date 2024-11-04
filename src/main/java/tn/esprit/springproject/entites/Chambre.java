package tn.esprit.springproject.entites;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
   //bonne pratique les noms les noms des attribut en miniscules 'typec')
    private TypeChambre typeC;

    @OneToMany(mappedBy="chambre")
    private Set<Reservation> reservations;


    @ManyToOne
    @JsonIgnore
    private Bloc bloc;

}
