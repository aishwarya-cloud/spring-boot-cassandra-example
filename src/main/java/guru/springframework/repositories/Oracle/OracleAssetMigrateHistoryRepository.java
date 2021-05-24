package guru.springframework.repositories.Oracle;

import guru.springframework.domain.Oracle.OracleAssetMigrateHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OracleAssetMigrateHistoryRepository extends CrudRepository<OracleAssetMigrateHistory, Long> {
}
