package guru.springframework.services.Cassandra;


import guru.springframework.domain.Cassandra.Assets;

import java.util.List;
import java.util.UUID;

public interface AssetsService {

    List<Assets> listAll();
    Assets getById(UUID id);

    Assets saveOrUpdate(Assets assets);

    void delete(UUID id);
}
