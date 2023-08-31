package f1.fantaf1be.controller;

import f1.fantaf1be.entity.Container;
import f1.fantaf1be.service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/container")
@CrossOrigin(origins = "*")
public class ContainerController {

    @Autowired
    ContainerService containerService;

    @PostMapping("/update")
    public ResponseEntity<Container> updateContainer(@RequestBody Container container) {
        Container tmpCont = containerService.updateContainer(container);
        return ResponseEntity.ok(tmpCont);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id) {
        containerService.deleteContainer(id);
    }

    @GetMapping("/getall/piloti")
    public ResponseEntity<List<Container>> getAllPiloti() {
        return ResponseEntity.ok(containerService.getAllPiloti());
    }

    @GetMapping("/getall/costruttori")
    public ResponseEntity<List<Container>> getAllCostruttori() {
        return ResponseEntity.ok(containerService.getAllCostruttori());
    }

    @GetMapping("/getall/motori")
    public ResponseEntity<List<Container>> getAllMotori() {
        return ResponseEntity.ok(containerService.getAllMotori());
    }


    /*@GetMapping("/savecostruttori")
    public ResponseEntity<String> saveCostruttori(){
        containerService.saveCostruttori();
        return ResponseEntity.ok("Costruttori salvati");
    }

    @GetMapping("/savepiloti")
    public ResponseEntity<String> savePiloti(){
        containerService.savePiloti();
        return ResponseEntity.ok("Piloti salvati");
    }

    @GetMapping("/savemotori")
    public ResponseEntity<String> saveMotori(){
        containerService.saveMotori();
        return ResponseEntity.ok("Motori salvati");
    }*/

}
