package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OracleModule;

import java.util.List;

public interface OracleModuleService {

    List<OracleModule> listAll();

    OracleModule getById(Long id);

    OracleModule saveOrUpdate(OracleModule oracleModule);

    void delete(Long id);

}
