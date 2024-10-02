package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.repository.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class EtudiantService {

    private EtudiantRepository etudiantRepository;


    public List<Etudiant> getEtudiant() {
        return etudiantRepository.findAll();
    }


    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.saveAndFlush(etudiant);
        //sauvegarder les données et les envoyer directement à la base de données
    }

    public void deleteStudent(Long id) {
        etudiantRepository.deleteById(id);
    }
}
