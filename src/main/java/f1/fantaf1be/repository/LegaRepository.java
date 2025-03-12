package f1.fantaf1be.repository;

import f1.fantaf1be.entity.Lega;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LegaRepository extends MongoRepository<Lega, String> {
}
