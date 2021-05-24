package guru.springframework.services.Oracle;

import guru.springframework.domain.Oracle.OracleAssetMigrateHistory;
import guru.springframework.repositories.Oracle.OracleAssetMigrateHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OracleAssetMigrateHistoryServiceImpl implements OracleAssetMigrateHistoryService {

    private OracleAssetMigrateHistoryRepository oracleAssetMigrateHistoryRepository;

    @Autowired
    public OracleAssetMigrateHistoryServiceImpl(OracleAssetMigrateHistoryRepository oracleAssetMigrateHistoryRepository) {
        this.oracleAssetMigrateHistoryRepository = oracleAssetMigrateHistoryRepository;

    }


    @Override
    public List<OracleAssetMigrateHistory> listAll() {
        List<OracleAssetMigrateHistory> oracleAssetMigrateHistories = new ArrayList<>();
        oracleAssetMigrateHistoryRepository.findAll().forEach(oracleAssetMigrateHistories::add); //fun with Java 8
        return oracleAssetMigrateHistories;
    }
    @Override
    public OracleAssetMigrateHistory getById(Long id) {
        Optional<OracleAssetMigrateHistory> optProduct = oracleAssetMigrateHistoryRepository.findById(id);
        if(!optProduct.isPresent()) {
            return null;
        }
        return optProduct.get();
    }

    @Override
    public OracleAssetMigrateHistory saveOrUpdate(OracleAssetMigrateHistory oracleAssetMigrateHistory) {
        oracleAssetMigrateHistoryRepository.save(oracleAssetMigrateHistory);
        return oracleAssetMigrateHistory;
    }

    @Override
    public void delete(Long id) {
        Optional<OracleAssetMigrateHistory> optionalProduct = oracleAssetMigrateHistoryRepository.findById(id);
        if(!optionalProduct.isPresent())
            return;
        oracleAssetMigrateHistoryRepository.delete(optionalProduct.get());
    }

}
