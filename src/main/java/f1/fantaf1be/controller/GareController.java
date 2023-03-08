package f1.fantaf1be.controller;

import f1.fantaf1be.entity.Gare;
import f1.fantaf1be.service.GareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gare")
@CrossOrigin(origins = "*")
public class GareController {
    @Autowired
    GareService gareService;

    @PostMapping("/create")
    public ResponseEntity<Gare> createGara(@RequestBody Gare gara){

        return ResponseEntity.ok(gareService.createGara(gara));
    }

    @GetMapping("/getAllGare")
    public List<Gare> getAll(){
        return gareService.getAllGare();
    }

    @GetMapping("/get/gara/{id}")
    public Gare getGara(@PathVariable String id){
        return gareService.getGara(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable String id){
        gareService.deleteGaraById(id);
    }

    @PostMapping("/updateGara/{id}")
    public ResponseEntity<Gare> updateGara(@PathVariable String id, @RequestBody Gare gara){
        Gare garaTmp = gareService.getGara(id);

        garaTmp.setNomeGara(gara.getNomeGara());
        garaTmp.setScadenzaSchieramento(gara.getScadenzaSchieramento());
        garaTmp.setDataGara(gara.getDataGara());

        final Gare updateGara = gareService.createGara(garaTmp);
        return ResponseEntity.ok(updateGara);
    }

    @GetMapping("/getAllBy/nomeGara/{nomeGara}")
    public List<Gare> getAllByNomeGara(@PathVariable String nomeGara){
        return gareService.getAllGareByNomeGara(nomeGara);
    }
}
