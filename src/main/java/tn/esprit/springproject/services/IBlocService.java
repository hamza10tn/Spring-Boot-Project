package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Bloc;

import java.util.List;

public interface IBlocService {
    public Bloc addBloc(Bloc bloc);
    public Bloc updateBloc(Bloc bloc);
    public List<Bloc> retreiveAllBlocs();
    public Bloc retreiveBlocById(long id);
    public void deleteBlocById(long id);


}
