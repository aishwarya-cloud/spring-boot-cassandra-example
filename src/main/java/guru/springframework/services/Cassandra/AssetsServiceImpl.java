package guru.springframework.services.Cassandra;


import guru.springframework.domain.Cassandra.Assets;
import guru.springframework.repositories.Cassandra.AssetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AssetsServiceImpl implements AssetsService {

    private AssetsRepository assetsRepository;

    @Autowired
    public AssetsServiceImpl(AssetsRepository assetsRepository) {
        this.assetsRepository = assetsRepository;
    }

    @Override
    public List<Assets> listAll() {
        List<Assets> assets = new ArrayList<>();
        assetsRepository.findAll().forEach(assets::add);
        return assets;
    }

    @Override
    public Assets getById(UUID id) {
         return assetsRepository.findById(id).orElse(null);
    }

    @Override
    public Assets saveOrUpdate(Assets assets) {
        assetsRepository.save(assets);
        return assets;
    }

    @Override
    public void delete(UUID id) {
        assetsRepository.deleteById(id);

    }


}
