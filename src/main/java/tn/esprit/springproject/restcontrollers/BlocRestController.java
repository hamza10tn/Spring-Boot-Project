package tn.esprit.springproject.restcontrollers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {
    IBlocService blocService;

    @GetMapping("/retrieve-all-blocs")
    @CrossOrigin(origins = "http://localhost:4200") // Allow requests from Angular
    public List<Bloc> getBlocs() {
        List<Bloc> bloc = blocService.retreiveAllBlocs();
        return bloc;
    }
    @PostMapping("/affecterBlocAFoyer/{idb}/{idf}")
    public Bloc affecterBlocAFoyer(@PathVariable long idb,@PathVariable long idf) {
       return blocService.affecterBlocAFoyer(idb,idf);
    }

    @GetMapping("/getBlocByCapcite/{capacite}")
    public Bloc getBlocByCapacite(@PathVariable long capacite){
        return blocService.getBlocByCapacite(capacite);
    }

}
