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
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="id")
    private long idF;
    private String nomF;
    private long capaciteF;

    @OneToOne(mappedBy = "foyer" ,cascade = CascadeType.ALL)
    //@JoinColumn() to name the foreign key
    private Universite universite;
@OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs;



}
