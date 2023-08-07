package f1.fantaf1be.service;

import f1.fantaf1be.entity.Schieramento;
import f1.fantaf1be.repository.SchieramentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchieramentoService {

    @Autowired
    SchieramentoRepository schieramentoRepository;

    public Schieramento createSchieramento(Schieramento schieramento){
        Optional<Schieramento> s = schieramentoRepository.findByEmail(schieramento.getEmail());
        if(s.isPresent()){
            schieramento.setId(s.get().getId());
            return this.updateSchieramento(schieramento);
        }
        return schieramentoRepository.save(schieramento);
    }

    public Schieramento getSchieramento(String id){
        return schieramentoRepository.findById(id).get();
    }

    public void deleteSchieramento(String id){
        schieramentoRepository.deleteById(id);
    }

    public Schieramento updateSchieramento(Schieramento schieramento){
        return schieramentoRepository.save(schieramento);
    }

    public List<Schieramento> getAllSchieramenti(){
        return schieramentoRepository.findAll();
    }

    public Schieramento getSchieramentoByEmail(String email) {
        return schieramentoRepository.findByEmail(email).orElse(null);
    }

    public Integer countSchieramenti() {
        return schieramentoRepository.findAll().size();
    }

    public void deleteAll() {
        schieramentoRepository.deleteAll();
    }
}
