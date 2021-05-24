package guru.springframework.repositories.Cassandra;

import guru.springframework.domain.Cassandra.NetworkProtocol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface NetworkProtocolRepository extends CrudRepository<NetworkProtocol, UUID> {
    List<NetworkProtocol> findByCustomerUuidAndAssetUuidAndInterfaceKey(UUID customerUuid,UUID assetUuid,String interfaceKey);
}
