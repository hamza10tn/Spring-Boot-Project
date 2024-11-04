package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Universite;

import java.util.List;

public interface IUniversiteService {
    public Universite addUniversite(Universite e);
    public Universite updateUniversite(Universite e);
    public List<Universite> retreiveAllUniversites();
    public Universite retreiveUniversiteById(long idE);
    public void deleteUniversiteById(long idE);

    public Universite affecterFoyerAUniversite(long idf,long idu);
    public Universite desaffecterFoyerFromUniverstite(long idu);

}
