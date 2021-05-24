package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OracleModule;
import guru.springframework.repositories.Oracle.OracleModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OracleModuleServiceImpl implements OracleModuleService {

    private OracleModuleRepository oracleModuleRepository;

    @Autowired
    public OracleModuleServiceImpl(OracleModuleRepository oracleModuleRepository) {
        this.oracleModuleRepository = oracleModuleRepository;

    }


    @Override
    public List<OracleModule> listAll() {
        List<OracleModule> oracleModuleList = new ArrayList<>();
        oracleModuleRepository.findAll().forEach(oracleModuleList::add); //fun with Java 8
        return oracleModuleList;
    }
    @Override
    public OracleModule getById(Long id) {
        Optional<OracleModule> oracleModuleOptional = oracleModuleRepository.findById(id);
        if(!oracleModuleOptional.isPresent()) {
            return null;
        }
        return oracleModuleOptional.get();
    }

    @Override
    public OracleModule saveOrUpdate(OracleModule oracleModule) {
        oracleModuleRepository.save(oracleModule);
        return oracleModule;
    }

    @Override
    public void delete(Long id) {
        Optional<OracleModule> oracleModule = oracleModuleRepository.findById(id);
        if(!oracleModule.isPresent())
            return;
        oracleModuleRepository.delete(oracleModule.get());
    }

}
