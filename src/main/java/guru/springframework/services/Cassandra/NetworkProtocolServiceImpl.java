package guru.springframework.services.Cassandra;

import guru.springframework.domain.Cassandra.NetworkProtocol;
import guru.springframework.repositories.Cassandra.NetworkProtocolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class NetworkProtocolServiceImpl implements NetworkProtocolService {

    private NetworkProtocolRepository networkProtocolRepository;

    @Autowired
    public NetworkProtocolServiceImpl(NetworkProtocolRepository networkProtocolRepository) {
        this.networkProtocolRepository = networkProtocolRepository;
    }

    @Override
    public List<NetworkProtocol> listAll() {
        List<NetworkProtocol> networkProtocols = new ArrayList<>();
        networkProtocolRepository.findAll().forEach(networkProtocols::add);
        return networkProtocols;
    }

    @Override
    public NetworkProtocol getById(UUID id) {
        return networkProtocolRepository.findById(id).orElse(null);
    }

    @Override
    public NetworkProtocol saveOrUpdate(NetworkProtocol networkProtocol) {
        networkProtocolRepository.save(networkProtocol);
        return networkProtocol;
    }

    @Override
    public void delete(UUID id) {
        networkProtocolRepository.deleteById(id);

    }


}
