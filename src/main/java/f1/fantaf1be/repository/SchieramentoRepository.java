package f1.fantaf1be.repository;

import f1.fantaf1be.entity.Schieramento;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SchieramentoRepository extends MongoRepository<Schieramento, String> {
    Optional<Schieramento> findByEmail(String email);
}
