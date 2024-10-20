package tn.esprit.springproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.repository.ChambreRepository;

import java.util.List;

@Service
public class ChambreServiceImp  implements IChambreService{
    @Autowired
    private ChambreRepository chambreRepository;


    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retreiveChambreById(long id) {
        return chambreRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteChambreById(long id) {
        chambreRepository.deleteById(id);
    }
}