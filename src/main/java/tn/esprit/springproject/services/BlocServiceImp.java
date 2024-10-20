package tn.esprit.springproject.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.repository.BlocRepository;

import java.util.List;

@Service
public class BlocServiceImp implements IBlocService{
    @Autowired
    private BlocRepository blocRepository;

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

}
