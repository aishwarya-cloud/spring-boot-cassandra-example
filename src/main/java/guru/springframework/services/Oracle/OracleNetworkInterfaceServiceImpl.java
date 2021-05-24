package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OracleNetworkInterface;
import guru.springframework.repositories.Oracle.OracleNetworkInterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OracleNetworkInterfaceServiceImpl implements OracleNetworkInterfaceService {

    private OracleNetworkInterfaceRepository oracleNetworkInterfaceRepository;

    @Autowired
    public OracleNetworkInterfaceServiceImpl(OracleNetworkInterfaceRepository oracleNetworkInterfaceRepository) {
        this.oracleNetworkInterfaceRepository = oracleNetworkInterfaceRepository;

    }


    @Override
    public List<OracleNetworkInterface> listAll() {
        List<OracleNetworkInterface> oracleNetworkInterfaceList = new ArrayList<>();
        oracleNetworkInterfaceRepository.findAll().forEach(oracleNetworkInterfaceList::add); //fun with Java 8
        return oracleNetworkInterfaceList;
    }
    @Override
    public OracleNetworkInterface getById(Long id) {
        Optional<OracleNetworkInterface> optionalOracleNetworkInterface = oracleNetworkInterfaceRepository.findById(id);
        if(!optionalOracleNetworkInterface.isPresent()) {
            return null;
        }
        return optionalOracleNetworkInterface.get();
    }

    @Override
    public OracleNetworkInterface saveOrUpdate(OracleNetworkInterface oracleNetworkInterface) {
        oracleNetworkInterfaceRepository.save(oracleNetworkInterface);
        return oracleNetworkInterface;
    }

    @Override
    public void delete(Long id) {
        Optional<OracleNetworkInterface> optionalOracleNetworkInterface = oracleNetworkInterfaceRepository.findById(id);
        if(!optionalOracleNetworkInterface.isPresent())
            return;
        oracleNetworkInterfaceRepository.delete(optionalOracleNetworkInterface.get());
    }

}
