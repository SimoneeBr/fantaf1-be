package f1.fantaf1be.service;

import f1.fantaf1be.entity.ConfigF1;
import f1.fantaf1be.repository.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationService {

    @Autowired
    ConfigurationRepository configurationRepository;

    public ConfigF1 getConfiguration() {
        return configurationRepository.findAll().get(0);
    }

    public ConfigF1 updateConfiguration(ConfigF1 configF1) {
        configurationRepository.deleteAll();
        return configurationRepository.save(configF1);
    }
}
