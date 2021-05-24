package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OracleAssetComponent;
import guru.springframework.repositories.Oracle.OracleAssetComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class OracleAssetComponentServiceImpl implements OracleAssetComponentService {

    private OracleAssetComponentRepository oracleAssetComponentRepository;

    @Autowired
    public OracleAssetComponentServiceImpl(OracleAssetComponentRepository oracleAssetComponentRepository) {
        this.oracleAssetComponentRepository = oracleAssetComponentRepository;

    }


    @Override
    public List<OracleAssetComponent> listAll() {
        List<OracleAssetComponent> oracleAssetComponentList = new ArrayList<>();
        oracleAssetComponentRepository.findAll().forEach(oracleAssetComponentList::add); //fun with Java 8
        return oracleAssetComponentList;
    }
    @Override
    public OracleAssetComponent getById(Long id) {
        Optional<OracleAssetComponent> optProduct = oracleAssetComponentRepository.findById(id);
        if(!optProduct.isPresent()) {
            return null;
        }
        return optProduct.get();
    }

    @Override
    public OracleAssetComponent saveOrUpdate(OracleAssetComponent oracleAssetComponent) {
        oracleAssetComponentRepository.save(oracleAssetComponent);
        return oracleAssetComponent;
    }

    @Override
    public void delete(Long id) {
        Optional<OracleAssetComponent> oracleAssetComponent = oracleAssetComponentRepository.findById(id);
        if(!oracleAssetComponent.isPresent())
            return;
        oracleAssetComponentRepository.delete(oracleAssetComponent.get());

    }

}
