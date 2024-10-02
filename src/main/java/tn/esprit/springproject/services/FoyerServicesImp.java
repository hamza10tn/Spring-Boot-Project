package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.repository.FoyerRepository;

import java.util.List;
@AllArgsConstructor // Lombok annotation to create a constructor with all required fields.
@Service
public class FoyerServicesImp implements IFoyerService{

    private FoyerRepository foyerRepository;
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



}
