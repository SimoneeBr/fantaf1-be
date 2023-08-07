package f1.fantaf1be.controller;

import f1.fantaf1be.entity.ConfigF1;
import f1.fantaf1be.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/config")
@CrossOrigin(origins = "*")
public class ConfigurationController {

    @Autowired
    ConfigurationService configurationService;

    @GetMapping("/get")
    public ResponseEntity<ConfigF1> getConfiguration(){
        return ResponseEntity.ok(configurationService.getConfiguration());
    }

    @PostMapping("/save")
    public ResponseEntity<ConfigF1> updateConfiguration(@RequestBody ConfigF1 configF1){
        return ResponseEntity.ok(configurationService.updateConfiguration(configF1));
    }
}
