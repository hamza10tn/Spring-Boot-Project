package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.repository.EtudiantRepository;

import java.util.List;

@Service


public class EtudiantServiceImp implements IEtudientService{
    @Autowired
    private EtudiantRepository etudiantRepository;


    @Override
    public Etudiant addEtudient(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudient(long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant updateEtudient(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant retrieveEtudientById(long id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Etudiant> retrieveAllEtudients() {
        return etudiantRepository.findAll();
    }
}