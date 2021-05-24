package guru.springframework.domain.Oracle;

import javax.persistence.*;

@Entity
@Table(name = "MODULE")
public class OracleModule {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="MODULE_UUID")
    private String moduleUUID;

    @Column(name = "CUSTOMER_UUID")
    private String customerUuid;

    @Column(name="FIRMWARE_VERSION ")
    private String firmwareVersion;

    @Column(name="MODEL")
    private String model;

    @Column(name="MODULE_TYPE")
    private String moduleType;

    @Column(name="MANUFACTURER")
    private String manufacturer;

    @Column(name="VULN_COUNT")
    private Integer vulnCount;

    public OracleModule() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModuleUUID() {
        return moduleUUID;
    }

    public void setModuleUUID(String moduleUUID) {
        this.moduleUUID = moduleUUID;
    }

    public String getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getVulnCount() {
        return vulnCount;
    }

    public void setVulnCount(Integer vulnCount) {
        this.vulnCount = vulnCount;
    }
}
