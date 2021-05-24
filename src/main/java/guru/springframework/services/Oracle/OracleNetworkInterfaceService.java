package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OracleNetworkInterface;

import java.util.List;

public interface OracleNetworkInterfaceService {

    List<OracleNetworkInterface> listAll();

    OracleNetworkInterface getById(Long id);

    OracleNetworkInterface saveOrUpdate(OracleNetworkInterface oracleNetworkInterface);

    void delete(Long id);

}
