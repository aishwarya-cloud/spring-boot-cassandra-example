package guru.springframework.services.Cassandra;


import guru.springframework.domain.Cassandra.PassiveSensorDetails;

import java.util.List;
import java.util.UUID;

public interface PassiveSensorDetailsService {

    List<PassiveSensorDetails> listAll();

    PassiveSensorDetails getById(UUID id);

    PassiveSensorDetails saveOrUpdate(PassiveSensorDetails passiveSensorDetails);

    void delete(UUID id);


}
