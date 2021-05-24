package guru.springframework.repositories.Cassandra;


import guru.springframework.domain.Cassandra.PassiveSensorDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PassiveSensorDetailsRepository extends CrudRepository<PassiveSensorDetails, UUID> {
}
