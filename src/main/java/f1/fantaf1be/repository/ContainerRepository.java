package f1.fantaf1be.repository;

import f1.fantaf1be.entity.Container;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ContainerRepository extends MongoRepository<Container, String> {

    List<Container> findAllByType(String type);
}
