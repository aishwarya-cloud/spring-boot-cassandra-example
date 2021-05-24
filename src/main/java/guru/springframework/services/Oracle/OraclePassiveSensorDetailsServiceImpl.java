package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OraclePassiveSensorDetails;
import guru.springframework.repositories.Oracle.OraclePassiveSensorDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OraclePassiveSensorDetailsServiceImpl implements OraclePassiveSensorDetailsService {

    private OraclePassiveSensorDetailsRepository oraclePassiveSensorDetailsRepository;

    @Autowired
    public OraclePassiveSensorDetailsServiceImpl(OraclePassiveSensorDetailsRepository oraclePassiveSensorDetailsRepository) {
        this.oraclePassiveSensorDetailsRepository = oraclePassiveSensorDetailsRepository;

    }


    @Override
    public List<OraclePassiveSensorDetails> listAll() {
        List<OraclePassiveSensorDetails> oraclePassiveSensorDetailsList = new ArrayList<>();
        oraclePassiveSensorDetailsRepository.findAll().forEach(oraclePassiveSensorDetailsList::add); //fun with Java 8
        return oraclePassiveSensorDetailsList;
    }
    @Override
    public OraclePassiveSensorDetails getById(Long id) {
        Optional<OraclePassiveSensorDetails> optionalOraclePassiveSensorDetails = oraclePassiveSensorDetailsRepository.findById(id);
        if(!optionalOraclePassiveSensorDetails.isPresent()) {
            return null;
        }
        return optionalOraclePassiveSensorDetails.get();
    }

    @Override
    public OraclePassiveSensorDetails saveOrUpdate(OraclePassiveSensorDetails oraclePassiveSensorDetails) {
        oraclePassiveSensorDetailsRepository.save(oraclePassiveSensorDetails);
        return oraclePassiveSensorDetails;
    }

    @Override
    public void delete(Long id) {
        Optional<OraclePassiveSensorDetails> oraclePassiveSensorDetailsOptional = oraclePassiveSensorDetailsRepository.findById(id);
        if(!oraclePassiveSensorDetailsOptional.isPresent())
            return;
        oraclePassiveSensorDetailsRepository.delete(oraclePassiveSensorDetailsOptional.get());
    }

}
