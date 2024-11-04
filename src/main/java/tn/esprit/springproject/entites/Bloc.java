package tn.esprit.springproject.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private long capaciteBloc;

    @OneToMany(mappedBy="bloc")
    private Set<Chambre> chambres;

@ManyToOne
@JsonIgnore
    private Foyer foyer;

}
