package f1.fantaf1be.controller;

import f1.fantaf1be.entity.Schieramento;
import f1.fantaf1be.service.SchieramentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schieramento")
@CrossOrigin(origins = "*")
public class SchieramentoController {

    @Autowired
    SchieramentoService schieramentoService;


    @PostMapping("/create")
    public ResponseEntity<Schieramento> createSchieramento(@RequestBody Schieramento schieramento){

        return ResponseEntity.ok(schieramentoService.createSchieramento(schieramento));
    }

    @PostMapping("/update")
    public ResponseEntity<Schieramento> updateSchieramento(@RequestBody Schieramento schieramento){
        return ResponseEntity.ok(schieramentoService.updateSchieramento(schieramento));
    }

    @PostMapping("/delete")
    public ResponseEntity<String> deleteSchieramento(String id){
        schieramentoService.deleteSchieramento(id);
        return ResponseEntity.ok("Schieramento eliminato");
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Schieramento> getSchieramento(@PathVariable(value="id") String id){
        return ResponseEntity.ok(schieramentoService.getSchieramento(id));
    }

    @GetMapping("/get-email/{email}")
    public ResponseEntity<Schieramento> getEmail(@PathVariable(value="email") String email){
        return ResponseEntity.ok(schieramentoService.getSchieramentoByEmail(email));
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Schieramento>> getAllSchieramenti(){
        return ResponseEntity.ok(schieramentoService.getAllSchieramenti());
    }


    @GetMapping("/countschier")
    public ResponseEntity<Integer> countSchieramenti(){
        return ResponseEntity.ok(schieramentoService.countSchieramenti());
    }


    @GetMapping("/deleteall")
    public ResponseEntity<String> deleteAll(){
        schieramentoService.deleteAll();
        return ResponseEntity.ok("Schieramenti eliminati");
    }



}
