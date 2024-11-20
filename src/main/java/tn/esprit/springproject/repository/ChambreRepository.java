package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.TypeChambre;

import java.time.LocalDate;
import java.util.List;

public interface ChambreRepository  extends JpaRepository<Chambre, Long> {
    //selon le type de retour

List<Chambre> findByBloc_idBlocAndTypeC(Long idb, TypeChambre typeC);

 /*   @Query("SELECT c from Chambre c where c.bloc.idBloc=:idb and c.TypeC=:typeChambre ")
    List<Chambre> getByBlocAndType(@Param("idb") Long idb, @Param("typeChambre") TypeChambre typeChambre);
*/

/*    @Query("SELECT c FROM Chambre c WHERE c.typeC = :type AND c.bloc.foyer.nomF= :nomFoyer AND c.idC NOT IN (SELECT r.chambre.idC FROM Reservation r WHERE r.dataDebut BETWEEN :startDate AND :endDate)")
    List<Chambre> findUnreservedChambresByTypeAndFoyerName(@Param("type") TypeChambre type, @Param("nomFoyer") String nomFoyer, @Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
    // JPQL query to find unreserved rooms of a specific type, belonging to a given Foyer, for the current academic year.
    @Query("SELECT c FROM Chambre c JOIN c.foyer f " +
            "LEFT JOIN c.reservations r ON r.anneeUniversitaire = :currentYear " +
            "WHERE f.nomFoyer = :nomFoyer " +
            "AND c.typeC = :type " +
            "AND (r IS NULL OR r.estValide = false)")
    List<Chambre> findUnreservedChambresByFoyerAndType(
            @Param("nomFoyer") String nomFoyer,
            @Param("type") TypeChambre type,
            @Param("currentYear") LocalDate currentYear);

*/
}