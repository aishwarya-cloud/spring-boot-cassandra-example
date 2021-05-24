package guru.springframework.services.Cassandra;


import guru.springframework.domain.Cassandra.NetworkProtocol;

import java.util.List;
import java.util.UUID;

public interface NetworkProtocolService {

    List<NetworkProtocol> listAll();
    NetworkProtocol getById(UUID id);

    NetworkProtocol saveOrUpdate(NetworkProtocol networkProtocol);
    void delete(UUID id);
}
