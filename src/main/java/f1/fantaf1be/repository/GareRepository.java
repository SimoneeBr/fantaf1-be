package f1.fantaf1be.repository;

import f1.fantaf1be.entity.Gare;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GareRepository extends MongoRepository<Gare, String> {

    List<Gare> findAllByNomeGara(String nomeGara);
}
