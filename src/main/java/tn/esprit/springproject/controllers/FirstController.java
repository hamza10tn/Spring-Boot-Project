package tn.esprit.springproject.controllers;



import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.services.EtudiantServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v1")
    public class FirstController {

    private EtudiantServiceImp etudiantService;


      /*  @GetMapping("/etudiant")
        public List<Etudiant> getStudent() {
            return etudiantService.getEtudiant();
        }
        @PostMapping("/etudiant")
        public Etudiant addStudent(@RequestBody Etudiant etudiant) {
            return etudiantService.saveEtudiant(etudiant);
        }

    @DeleteMapping("/etudiant/{id}")
    public void deleteStudent(@PathVariable Long id) {
        etudiantService.deleteStudent(id);
    }

*/

}