package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.entites.TypeChambre;

import java.lang.reflect.Type;
import java.util.List;

public interface IChambreService {
    public Chambre addChambre(Chambre chambre);
    public Chambre updateChambre(Chambre chambre);
    public List<Chambre> getAllChambres();
    public Chambre retreiveChambreById(long id);
    public void deleteChambreById(long id);
    public Bloc affecterChambreABloc(List<Long> numC, long idb);
    public Chambre desaffecterChambreABloc(long idc);
    public List<Chambre> getChambreParBlocEtType(long idBloc, TypeChambre typeChambre);



}
