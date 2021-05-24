package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OracleAssets;
import guru.springframework.repositories.Oracle.OracleAssetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OracleAssetsServiceImpl implements OracleAssetsService {

    private OracleAssetsRepository OracleAssetsRepository;
    

    @Autowired
    public OracleAssetsServiceImpl(OracleAssetsRepository OracleAssetsRepository) {
        this.OracleAssetsRepository = OracleAssetsRepository;
        
    }


    @Override
    public List<OracleAssets> listAll() {
        List<OracleAssets> oracleAssets = new ArrayList<>();
        OracleAssetsRepository.findAll().forEach(oracleAssets::add); //fun with Java 8
        return oracleAssets;
    }
    @Override
    public OracleAssets getById(Long id) {
        Optional<OracleAssets> optAssets = OracleAssetsRepository.findById(id);
        if(!optAssets.isPresent()) {
            return null;
        }
        return optAssets.get();
    }

    @Override
    public OracleAssets saveOrUpdate(OracleAssets oracleAssets) {
       return OracleAssetsRepository.save(oracleAssets);
       // return oracleAssets;
    }

    @Override
    public void delete(Long id) {
        Optional<OracleAssets> optionalAssets = OracleAssetsRepository.findById(id);
        if(!optionalAssets.isPresent())
            return;
        OracleAssetsRepository.delete(optionalAssets.get());
    }


}
