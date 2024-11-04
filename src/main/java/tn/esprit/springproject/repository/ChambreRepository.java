package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.TypeChambre;

import java.util.List;

public interface ChambreRepository  extends JpaRepository<Chambre, Long> {
    //selon le type de retour

List<Chambre> findByBloc_idBlocAndTypeC(Long idb, TypeChambre typeC);

 /*   @Query("SELECT c from Chambre c where c.bloc.idBloc=:idb and c.TypeC=:typeChambre ")
    List<Chambre> getByBlocAndType(@Param("idb") Long idb, @Param("typeChambre") TypeChambre typeChambre);
*/

}
