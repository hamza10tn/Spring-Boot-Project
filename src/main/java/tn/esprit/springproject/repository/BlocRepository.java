package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Etudiant;

public interface BlocRepository  extends JpaRepository<Bloc, Long> {

    @Query("SELECT b from Bloc b where b.capaciteBloc=:capaciteB")
    Bloc getBlocByCapaciteBloc(@Param("capaciteB") Long capaciteB);

}
