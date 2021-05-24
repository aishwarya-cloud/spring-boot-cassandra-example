package guru.springframework.repositories.Oracle;

import guru.springframework.domain.Oracle.OracleAssetComponent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OracleAssetComponentRepository extends CrudRepository<OracleAssetComponent, Long> {
}
