package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OracleAssetModule;

import java.util.List;

public interface OracleAssetModuleService {

    List<OracleAssetModule> listAll();

    OracleAssetModule getById(Long id);

    OracleAssetModule saveOrUpdate(OracleAssetModule oracleAssetModule);

    void delete(Long id);


}
