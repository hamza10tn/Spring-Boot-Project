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
}
