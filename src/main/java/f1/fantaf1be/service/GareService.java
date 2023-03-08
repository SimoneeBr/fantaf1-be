package f1.fantaf1be.service;

import f1.fantaf1be.entity.Gare;
import f1.fantaf1be.repository.GareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GareService {
    @Autowired
    GareRepository gareRepository;

    public Gare createGara(Gare gare){
        return gareRepository.save(gare);
    }

    public Gare getGara(String id){ return gareRepository.findById(id).orElse(null); }

    public void deleteGaraById(String id){gareRepository.deleteById(id);}

    public List<Gare> getAllGare(){return gareRepository.findAll();}

    public List<Gare> getAllGareByNomeGara(String nomeGara){return gareRepository.findAllByNomeGara(nomeGara);}


}
