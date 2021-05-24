package guru.springframework.services.Cassandra;


import guru.springframework.domain.Cassandra.PassiveSensorDetails;
import guru.springframework.repositories.Cassandra.PassiveSensorDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PassiveSensorDetailsServiceImpl implements PassiveSensorDetailsService {

    private PassiveSensorDetailsRepository passiveSensorDetailsRepository;

    @Autowired
    public PassiveSensorDetailsServiceImpl(PassiveSensorDetailsRepository passiveSensorDetailsRepository1) {
        this.passiveSensorDetailsRepository = passiveSensorDetailsRepository1;
    }


    @Override
    public List<PassiveSensorDetails> listAll() {
        List<PassiveSensorDetails> passiveSensorDetails = new ArrayList<>();
        passiveSensorDetailsRepository.findAll().forEach(passiveSensorDetails::add);
        return passiveSensorDetails;
    }

    @Override
    public PassiveSensorDetails getById(UUID id) {
        return passiveSensorDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public PassiveSensorDetails saveOrUpdate(PassiveSensorDetails passiveSensorDetails) {
       passiveSensorDetailsRepository.save(passiveSensorDetails);
        return passiveSensorDetails;
    }

    @Override
    public void delete(UUID id) {
        passiveSensorDetailsRepository.deleteById(id);

    }


}
