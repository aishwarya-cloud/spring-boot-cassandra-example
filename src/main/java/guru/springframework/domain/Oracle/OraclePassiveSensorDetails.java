package guru.springframework.domain.Oracle;

import javax.persistence.*;

@Entity
@Table(name = "PASSIVE_SENSOR")
public class OraclePassiveSensorDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "LE_ID")
    private String leId;

    @Column(name = "CUSTOMER_UUID")
    private String customerUuid;

    @Column(name = "STATE")
    private String state;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LOCATION")
    private String location;

    public OraclePassiveSensorDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLeId() {
        return leId;
    }

    public void setLeId(String leId) {
        this.leId = leId;
    }

    public String getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
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
}
