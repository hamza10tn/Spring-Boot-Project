package tn.esprit.springproject.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idUniversite;
    private String nomUniversite;
    private String adresse;
    @OneToOne
    private Foyer foyer;
}
