package tn.esprit.springproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.repository.FoyerRepository;
import tn.esprit.springproject.repository.UniversiteRepository;

import java.util.List;
@Service
@RequiredArgsConstructor //+final
public class UniversiteServiceImp implements IUniversiteService{

    private final UniversiteRepository universiteRepository;
    private final FoyerRepository foyerRepository;
    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public List<Universite> retreiveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retreiveUniversiteById(long idE) {
        return universiteRepository.findById(idE).orElse(null);
    }

    @Override
    public void deleteUniversiteById(long idE) {
        universiteRepository.deleteById(idE);
    }

    @Override
    public Universite affecterFoyerAUniversite(long idf, long idu) {
        Foyer foyer=foyerRepository.findById(idf).orElse(null);
        Universite universite=universiteRepository.findById(idu).orElse(null);
        if(foyer ==null || universite==null){
            throw new RuntimeException();
        }
        universite.setFoyer(foyer);
        return universiteRepository.save(universite);
    }
    @Override
    public Universite desaffecterFoyerFromUniverstite(long idu){
        Universite universite=universiteRepository.findById(idu).orElse(null);
        universite.setFoyer(null);
        return  universiteRepository.save(universite);
    }
}
