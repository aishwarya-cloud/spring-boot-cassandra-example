package guru.springframework.repositories.Oracle;

import guru.springframework.domain.Oracle.OracleAssets;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OracleAssetsRepository extends CrudRepository<OracleAssets, Long> {
}
