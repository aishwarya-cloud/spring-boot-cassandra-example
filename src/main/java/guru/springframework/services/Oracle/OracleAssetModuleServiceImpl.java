package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OracleAssetModule;
import guru.springframework.repositories.Oracle.OracleAssetModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class OracleAssetModuleServiceImpl implements OracleAssetModuleService {

    private OracleAssetModuleRepository oracleAssetModuleRepository;


    @Autowired
    public OracleAssetModuleServiceImpl(OracleAssetModuleRepository oracleAssetModuleRepository) {
        this.oracleAssetModuleRepository = oracleAssetModuleRepository;

    }


    @Override
    public List<OracleAssetModule> listAll() {
        List<OracleAssetModule> oracleAssetModuleList = new ArrayList<>();
        oracleAssetModuleRepository.findAll().forEach(oracleAssetModuleList::add); //fun with Java 8
        return oracleAssetModuleList;
    }
    @Override
    public OracleAssetModule getById(Long id) {
        Optional<OracleAssetModule> oracleAssetsOptional = oracleAssetModuleRepository.findById(id);
        if(!oracleAssetsOptional.isPresent()) {
            return null;
        }
        return oracleAssetsOptional.get();
    }

    @Override
    public OracleAssetModule saveOrUpdate(OracleAssetModule oracleAssetModule) {
        oracleAssetModuleRepository.save(oracleAssetModule);
        return oracleAssetModule;
    }

    @Override
    public void delete(Long id) {
        Optional<OracleAssetModule> oracleAssetModuleOptional = oracleAssetModuleRepository.findById(id);
        if(!oracleAssetModuleOptional.isPresent())
            return;
        oracleAssetModuleRepository.delete(oracleAssetModuleOptional.get());
    }


}
