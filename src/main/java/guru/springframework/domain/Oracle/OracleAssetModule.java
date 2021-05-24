package guru.springframework.domain.Oracle;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ASSET_MODULE")
public class OracleAssetModule {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CUSTOMER_UUID")
    private String customerUuid;

    @Column(name = "ASSET_UUID")
    private String assetUuid;

    @Column(name = "MODULE_UUID")
    private String moduleUuid;

    @Column(name = "FIRMWARE_VERSION")
    private String firmwareVersion;

    @Column(name = "FIRST_SEEN")
    private Date firstSeen;

    @Column(name = "LAST_SEEN")
    private Date lastSeen;

    @Column(name ="MODEL")
    private String model;

    @Column(name = "MODULE_TYPE")
    private String moduleType;

    @Column(name = "MANUFACTURER")
    private String manufacturer;

    @Column(name="RACK")
    private Integer rack;

    @Column(name = "SLOT")
    private Integer slot;

    @Column(name="SERIAL_NO")
    private String serialNo;

    @Column(name="HARDWARE_VERSION ")
    private String hardwareVersion;

    @Column(name="ORDER_ID")
    private String orderId;

    @Column(name="OPERATIONAL_STATUS")
    private String operationalStatus;

    @Column(name="ASSET_RELATION")
    private Integer assetRelation;

    @Column(name = "ASSET_ID")
    private Long assetId;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "MODULE_ID", referencedColumnName = "id")
    private OracleModule module;

    public OracleModule getModule() {
        return module;
    }

    public void setModule(OracleModule module) {
        this.module = module;
    }

    public OracleAssetModule() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
    }

    public String getAssetUuid() {
        return assetUuid;
    }

    public void setAssetUuid(String assetUuid) {
        this.assetUuid = assetUuid;
    }

    public String getModuleUuid() {
        return moduleUuid;
    }

    public void setModuleUuid(String moduleUuid) {
        this.moduleUuid = moduleUuid;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public Date getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
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

    public Integer getRack() {
        return rack;
    }

    public void setRack(Integer rack) {
        this.rack = rack;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOperationalStatus() {
        return operationalStatus;
    }

    public void setOperationalStatus(String operationalStatus) {
        this.operationalStatus = operationalStatus;
    }

    public Integer getAssetRelation() {
        return assetRelation;
    }

    public void setAssetRelation(Integer assetRelation) {
        this.assetRelation = assetRelation;
    }

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }
}
