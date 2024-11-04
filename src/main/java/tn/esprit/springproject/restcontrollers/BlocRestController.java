package tn.esprit.springproject.restcontrollers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.services.IBlocService;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {
    IBlocService blocService;


    @PostMapping("/affecterBlocAFoyer/{idb}/{idf}")
    public Bloc affecterBlocAFoyer(@PathVariable long idb,@PathVariable long idf) {
       return blocService.affecterBlocAFoyer(idb,idf);
    }

    @GetMapping("/getBlocByCapcite/{capacite}")
    public Bloc getBlocByCapacite(@PathVariable long capacite){
        return blocService.getBlocByCapacite(capacite);
    }

}
