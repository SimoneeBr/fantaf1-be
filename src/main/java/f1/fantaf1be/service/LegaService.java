package f1.fantaf1be.service;

import f1.fantaf1be.entity.Lega;
import f1.fantaf1be.repository.LegaRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LegaService {

    private final LegaRepository legaRepository;

    public LegaService(LegaRepository legaRepository) {
        this.legaRepository = legaRepository;
    }

    public Lega createLega(Lega lega) {
        return legaRepository.save(lega);
    }

    public List<Lega> getAllLeaguesConfig() {
        return legaRepository.findAll();
    }

    public List<Lega> getAllLeghe() {
        return legaRepository.findAll().stream().filter(l ->
                StringUtils.hasLength(l.getName())
        ).collect(Collectors.toList());
    }

    public Lega getLega(String id) {
        return legaRepository.findById(id).orElse(null);
    }

    public void deleteLegaById(String id) {
        legaRepository.deleteById(id);
    }

    public Lega updateLega(Lega lega) {
        Lega l = legaRepository.findById(lega.getId()).orElse(null);
        if (l == null) {
            return null;
        }
        l.setName(lega.getName());
        return legaRepository.save(lega);
    }

}
