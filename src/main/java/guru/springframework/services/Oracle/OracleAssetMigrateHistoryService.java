package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OracleAssetMigrateHistory;

import java.util.List;

public interface OracleAssetMigrateHistoryService {

    List<OracleAssetMigrateHistory> listAll();

    OracleAssetMigrateHistory getById(Long id);

    OracleAssetMigrateHistory saveOrUpdate(OracleAssetMigrateHistory oracleAssetMigrateHistory);

    void delete(Long id);


}
