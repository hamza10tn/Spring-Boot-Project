package tn.esprit.springproject.restcontrollers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.services.IEtudientService;

import java.util.List;

@RestController
@RequestMapping("/etudient")
public class EtudientRestController {

    @Autowired
    private IEtudientService iEtudientService;

    @GetMapping("/allStudent")
    public List<Etudiant> getAllStudent() {
        return iEtudientService.retrieveAllEtudients();
    }

    @GetMapping("/getid/{id}")
    public Etudiant getFoyerById(@PathVariable Long id) {
        return iEtudientService.retrieveEtudientById(id);
    }

    @PostMapping("/addstudent")
    public Etudiant createFoyer(@RequestBody Etudiant etudiant) {
        return iEtudientService.addEtudient(etudiant);
    }

    @PutMapping("/updatestudent/{id}")
    public Etudiant updateFoyer(@PathVariable Long id, @RequestBody Etudiant etudiant) {
        etudiant.setIdEtudiant(id);
        return iEtudientService.updateEtudient(etudiant);
    }

    @DeleteMapping("/deletestudent/{id}")
    public void deleteFoyer(@PathVariable Long id) {
        iEtudientService.deleteEtudient(id);
    }
}