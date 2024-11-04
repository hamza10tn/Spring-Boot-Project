package tn.esprit.springproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.entites.TypeChambre;
import tn.esprit.springproject.repository.BlocRepository;
import tn.esprit.springproject.repository.ChambreRepository;

import java.util.EnumMap;
import java.util.List;

@Service
public class ChambreServiceImp  implements IChambreService{
    @Autowired //chaque champs a @Autowired
    private ChambreRepository chambreRepository;
    @Autowired
    private  BlocRepository br;


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

    @Override
    public Bloc affecterChambreABloc(List<Long> numC, long idb) {
        Bloc bloc=br.findById(idb).orElse(null);
        List<Chambre> chambreList=chambreRepository.findAllById(numC);
        for (Chambre chambre: chambreList ) {
            chambre.setBloc(bloc);
        }
        chambreRepository.saveAll(chambreList);
        return bloc;
    }

    @Override
    public Chambre desaffecterChambreABloc(long idc) {
        Chambre chambre=chambreRepository.findById(idc).orElse(null);
        chambre.setBloc(null);
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getChambreParBlocEtType(long idBloc, TypeChambre typeChambre) {
        //return chambreRepository.getByBlocAndType(idBloc,typeChambre);
      return chambreRepository.findByBloc_idBlocAndTypeC(idBloc,typeChambre);
    }


}