package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OracleAssets;

import java.util.List;

public interface OracleAssetsService {

    List<OracleAssets> listAll();

    OracleAssets getById(Long id);

    OracleAssets saveOrUpdate(OracleAssets oracleAssets);

    void delete(Long id);


}
