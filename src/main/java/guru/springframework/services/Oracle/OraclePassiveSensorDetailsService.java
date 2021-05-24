package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OraclePassiveSensorDetails;

import java.util.List;

public interface OraclePassiveSensorDetailsService {
    List<OraclePassiveSensorDetails> listAll();

    OraclePassiveSensorDetails getById(Long id);

    OraclePassiveSensorDetails saveOrUpdate(OraclePassiveSensorDetails oraclePassiveSensorDetails);

    void delete(Long id);

}
