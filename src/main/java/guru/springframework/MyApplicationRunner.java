package guru.springframework;

import guru.springframework.controllers.DataMigration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Order(2)
class MyApplicationRunner implements ApplicationRunner {

    private DataMigration dataMigration;
    @Autowired
    public void setDataMigration(DataMigration dataMigration) {
        this.dataMigration = dataMigration;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("Inside My Application................");
        dataMigration.UpdateOracleAssets();
        dataMigration.UpdatePassiveSensorDetails();
        System.out.println("Data Migration Complete !!!!!!!!!!!!!!!");
    }
}
