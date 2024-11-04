package tn.esprit.springproject.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.repository.BlocRepository;
import tn.esprit.springproject.repository.FoyerRepository;

import java.util.List;

@Service
public class BlocServiceImp implements IBlocService{
    @Autowired
    private BlocRepository blocRepository;
    @Autowired
    private FoyerRepository foyerRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> retreiveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retreiveBlocById(long id) {
        return blocRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteBlocById(long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public Bloc affecterBlocAFoyer(long idb, long idf) {
        Bloc bloc=blocRepository.findById(idb).orElse(null);
        Foyer foyer=foyerRepository.findById(idf).orElse(null);
        if (bloc ==null || foyer ==null){
            throw new RuntimeException("bloc ou foyer n'existe pas");
        }
        bloc.setFoyer(foyer);
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc getBlocByCapacite(long capacite) {
        return blocRepository.getBlocByCapaciteBloc(capacite);
        //return list<bloc> si plusiur bloc avec meme capcite
    }


}
