package tn.esprit.springproject.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.repository.BlocRepository;
import tn.esprit.springproject.repository.FoyerRepository;

import java.util.List;

@Service
@Slf4j //simple log facade for java
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

    @Scheduled(cron = "15 * * * * *")
    //@Scheduled(cron = "15 * * * * *")
    //@Scheduled(cron = "0/15 * * * * *")
    //@Scheduled(cron = "0 0/30 11 * * *") //2 fois par hour 11h00 et 11h30
    //@Scheduled(cron = "0 0 8 ? 4 ?") or (cron = "0 0 8 * 4 *")
    //@Scheduled(cron = "0 0 9 14 2 SUN,TUE") //sun or tue

   // @Scheduled(cron = "0 0 23 25 12 * ")
    @Override
    public List<Bloc> retreiveAllBlocs() {
        List<Bloc> listB= blocRepository.findAll();
        log.info("les bloc: "+listB);
    return listB;
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
