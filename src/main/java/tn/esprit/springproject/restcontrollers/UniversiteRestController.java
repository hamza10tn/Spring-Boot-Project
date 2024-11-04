package tn.esprit.springproject.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.services.IUniversiteService;
import tn.esprit.springproject.services.UniversiteServiceImp;

import java.util.List;

@RestController
public class UniversiteRestController {

    @Autowired
    IUniversiteService universiteService;

    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @GetMapping("/getAllUniversities")
    public List<Universite> getAllUniversites() {
        return universiteService.retreiveAllUniversites();


    }
    @GetMapping("/retreiveUniversiteById/{id}")
    public Universite retreiveUniversiteById(@PathVariable int id) {
        return universiteService.retreiveUniversiteById(id);
    }
    @DeleteMapping("/deleteUniversiteById/{id}")
    public void deleteUniversiteById(@PathVariable int id) {
        universiteService.deleteUniversiteById(id);
    }

        @PostMapping("/affecteruf/{idf}/{idu}")
    public Universite affecterUF(@PathVariable long idf,@PathVariable long idu){
        return universiteService.affecterFoyerAUniversite(idf,idu);
    }


    @PostMapping("/desaffecteruf/{idu}")
    public Universite desaffecterFoyerFromUniverstite(@PathVariable int idu) {
    return universiteService.desaffecterFoyerFromUniverstite(idu);
    }

}