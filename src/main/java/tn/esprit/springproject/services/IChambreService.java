package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Chambre;

import java.util.List;

public interface IChambreService {
    public Chambre addChambre(Chambre chambre);
    public Chambre updateChambre(Chambre chambre);
    public List<Chambre> getAllChambres();
    public Chambre retreiveChambreById(long id);
    public void deleteChambreById(long id);

}
