package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OracleAssetComponent;

import java.util.List;

public interface OracleAssetComponentService {

    List<OracleAssetComponent> listAll();

    OracleAssetComponent getById(Long id);

    OracleAssetComponent saveOrUpdate(OracleAssetComponent oracleAssetComponent);

    void delete(Long id);



}
