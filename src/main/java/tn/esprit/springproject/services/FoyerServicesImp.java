package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.repository.FoyerRepository;
import tn.esprit.springproject.repository.UniversiteRepository;

import java.util.List;
@AllArgsConstructor // Lombok annotation to create a constructor with all required fields.
@Service
public class FoyerServicesImp implements IFoyerService{

    private FoyerRepository foyerRepository;
    private UniversiteRepository universiteRepository;
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }
    @Override
    public void deleteFoyer(long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer retrieveFoyerById(long id) {
        return foyerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyerAndAsseignToUniversity(Foyer foyer, long idu) {
        Universite universite=universiteRepository.findById(idu).orElse(null);
        for (Bloc bloc: foyer.getBlocs()) {
            bloc.setFoyer(foyer);
        }
        Foyer foyer1=foyerRepository.save(foyer);
        foyer.setUniversite(universite);
        universite.setFoyer(foyer1);
        universiteRepository.save(universite);
        return foyer1;

    }

    @Override
    public Foyer getFoyerByNom(String nom) {
        return foyerRepository.findByNomF(nom);
    }

    @Override
    public Foyer getFoyerByCapacite(Long a, Long b) {
        return foyerRepository.findByCapaciteFBetween(a,b);
    }


}
