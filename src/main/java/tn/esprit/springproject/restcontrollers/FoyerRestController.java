package tn.esprit.springproject.restcontrollers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.services.FoyerServicesImp;
import tn.esprit.springproject.services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {

    private IFoyerService foyerService;

    @GetMapping("/allFoyer")
    public List<Foyer> getAllFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    @GetMapping("/getid/{id}")
    public Foyer getFoyerById(@PathVariable Long id) {
        return foyerService.retrieveFoyerById(id);
    }

    @PostMapping("/addFoyer")
    public Foyer createFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @PutMapping("/updateFoyer/{id}")
    public Foyer updateFoyer(@PathVariable Long id, @RequestBody Foyer foyer) {
        foyer.setIdF(id);
        return foyerService.updateFoyer(foyer);
    }

    @DeleteMapping("/deleteFoyer/{id}")
    public void deleteFoyer(@PathVariable Long id) {
        foyerService.deleteFoyer(id);
    }

    @PostMapping("/addFoyerAndAsseignToUniversity/{idu}")
    public Foyer addFoyerAndAsseignToUniversity(@RequestBody Foyer foyer,@PathVariable long idu) {
        return foyerService.addFoyerAndAsseignToUniversity(foyer, idu);
    }

    @GetMapping("/getfoyerbyname/{nom}")
    public Foyer getFoyerByNom(@PathVariable String nom){
        return foyerService.getFoyerByNom(nom);
    }
    @GetMapping("/getfoyerbycapacite/{a}/{b}")
    public Foyer getFoyerByCapacite(@PathVariable Long a,@PathVariable Long b){
        return foyerService.getFoyerByCapacite(a,b);
    }
}
