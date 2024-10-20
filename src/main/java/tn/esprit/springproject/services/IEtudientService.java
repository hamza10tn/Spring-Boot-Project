package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Foyer;

import java.util.List;

public interface IEtudientService {
    public Etudiant addEtudient(Etudiant etudiant);
    public void deleteEtudient(long id);
    public Etudiant updateEtudient(Etudiant etudiant);
    public Etudiant retrieveEtudientById(long id);
    public List<Etudiant> retrieveAllEtudients();
}
