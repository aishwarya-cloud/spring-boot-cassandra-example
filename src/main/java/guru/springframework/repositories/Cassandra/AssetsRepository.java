package guru.springframework.repositories.Cassandra;

import guru.springframework.domain.Cassandra.Assets;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface AssetsRepository extends CrudRepository<Assets, UUID> {
    List<Assets> findByCustomerUuidAndAssetUuid(UUID customerUuid,UUID assetUuid );
}
