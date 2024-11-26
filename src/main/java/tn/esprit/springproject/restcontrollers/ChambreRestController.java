package tn.esprit.springproject.restcontrollers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.entites.TypeChambre;
import tn.esprit.springproject.services.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
@Tag(name = "Gestion Chambre")
public class ChambreRestController {
    IChambreService chambreService;
    // http://localhost:8089/tpfoyer/chambre/retrieve-all-chambres
    @Operation(description = "ws = récupérer toutes les chambres de la base de données")
    @GetMapping("/retrieve-all-chambres")
    @CrossOrigin(origins = "http://localhost:4200") // Allow requests from Angular
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.getAllChambres();
        return listChambres;
    }
    // http://localhost:8089/tpfoyer/chambre/retrieve-chambre/8

    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chId) {
        Chambre chambre = chambreService.retreiveChambreById(chId);
        return chambre;
    }
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.retreiveChambreById(chId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.updateChambre(c);
        return chambre;
    }

@PostMapping("/affecterChambreABloc/{idb}")
    public Bloc affecterChambreABloc(@RequestBody List<Long> numC,@PathVariable long idb) {
        return chambreService.affecterChambreABloc(numC,idb);
    }

    @PostMapping("/desaffecterChambreABloc/{idc}")
    public Chambre desaffecterChambreABloc(@PathVariable long idc) {
        return chambreService.desaffecterChambreABloc(idc);
    }

    @GetMapping("/getChambreParBlocEtType/{idBloc}/{typeChambre}")
    public List<Chambre> getChambreParBlocEtType(@PathVariable  Long idBloc ,@PathVariable TypeChambre typeChambre){
        return chambreService.getChambreParBlocEtType(idBloc,typeChambre);
    }
}