package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Foyer;

import java.util.List;

public interface IFoyerService{

    public Foyer addFoyer(Foyer foyer);
    public void deleteFoyer(long id);
    public Foyer updateFoyer(Foyer foyer);
    public Foyer retrieveFoyerById(long id);
    public List<Foyer> retrieveAllFoyers();


}