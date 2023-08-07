package f1.fantaf1be.repository;

import f1.fantaf1be.entity.ConfigF1;
import f1.fantaf1be.entity.Schieramento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigurationRepository extends MongoRepository<ConfigF1, String> {
}
