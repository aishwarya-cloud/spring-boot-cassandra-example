package guru.springframework.domain.Cassandra;

import guru.springframework.domain.model.datastax.enums.SensorState;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.UUID;


@Table("passivesensordetails")
public class PassiveSensorDetails implements Serializable{

    private static final long serialVersionUID = 1L;
    @PrimaryKeyColumn(name = "leid", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String leId;
    @PrimaryKeyColumn(name = "customeruuid", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private UUID customerUuid;
    private SensorState state;
    private String name;
    private String location;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getLeId() {
        return leId;
    }

    public void setLeId(String leId) {
        this.leId = leId;
    }

    public UUID getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(UUID customerUuid) {
        this.customerUuid = customerUuid;
    }

    public SensorState getState() {
        return state;
    }

    public void setState(SensorState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public PassiveSensorDetails() {
    }
}
