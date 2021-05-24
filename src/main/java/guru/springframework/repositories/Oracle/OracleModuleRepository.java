package guru.springframework.repositories.Oracle;

import guru.springframework.domain.Oracle.OracleModule;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OracleModuleRepository extends CrudRepository<OracleModule, Long> {
    //List<OracleModule> findByCustomerUuidAndFirmwareVersionAndModelAndModuleTypeAndManufacturer(String customerUuid, String firmwareVersion, String model , String moduleType, String manufacturer);
    List<OracleModule> findByFirmwareVersionAndModelAndModuleTypeAndManufacturer(String firmwareVersion, String model , String moduleType, String manufacturer);
}
