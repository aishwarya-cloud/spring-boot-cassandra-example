package guru.springframework.domain.Oracle;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ASSET")
public class OracleAssets {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;

    @Column(name = "CUSTOMER_UUID")
    private String customerUuid;

    @Column(name = "ASSET_UUID")
    private String assetUuid;

    @Column(name = "ADDRESS")
    private String address;


    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "CRITICALITY")
    private String criticality;

    @Column(name = "DEVICE_LOCATION")
    private String deviceLocation;

    @Column(name = "DISCOVERY_PROTOCOLS")
    private String discoveryProtocols;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

    @Column(name = "EQUIPMENT_VENDOR")
    private String equipmentVendor;

    @Column(name = "FIRMWARE_VERSION")
    private String firmwareVersion;

    @Column(name = "FIRST_SEEN")
    private Date firstSeen;

    @Column(name = "HARDWARE_CATEGORY1")
    private String hardwareCategory1;

    @Column(name = "HARDWARE_CATEGORY2")
    private String hardwareCategory2;

    @Column(name = "HARDWARE_VERSION")
    private String hardwareVersion;

    @Column(name = "IMPORTANCE")
    private Integer importance;

    @Column(name = "IS_DELETED")
    private boolean isDeleted;

    @Column(name = "LAST_MODIFIED")
    private Date lastModified;

    @Column(name = "LAST_MODIFIEDBY")
    private String lastModifiedBy;

    @Column(name = "LAST_SEEN")
    private Date lastSeen;

    @Column(name = "LE_ID")
    private String leId;

    @Column(name = "MAC_ADDRESS")
    private String macAddress;

    @Column(name = "MAC_VENDOR")
    private String macVendor;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "NAME")
    private String name;

    @Column(name = "OS")
    private String os;

    @Column(name = "PLANT_LOCATION")
    private String plantLocation;

    @Column(name = "PRODUCT")
    private String product;

    @Column(name = "PURDUE_LEVEL")
    private String purdueLevel;

    @Column(name = "REDUNDANCY")
    private String redundancy;

    @Column(name = "SERIAL_NO")
    private String serialNo;

    @Column(name = "STATE")
    private String state;

    @Column(name = "TYPE")
    private String type;



    public OracleAssets() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCriticality() {
        return criticality;
    }

    public void setCriticality(String criticality) {
        this.criticality = criticality;
    }

    public String getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public String getDiscoveryProtocols() {
        return discoveryProtocols;
    }

    public void setDiscoveryProtocols(String discoveryProtocols) {
        this.discoveryProtocols = discoveryProtocols;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getEquipmentVendor() {
        return equipmentVendor;
    }

    public void setEquipmentVendor(String equipmentVendor) {
        this.equipmentVendor = equipmentVendor;
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

    public String getHardwareCategory1() {
        return hardwareCategory1;
    }

    public void setHardwareCategory1(String hardwareCategory1) {
        this.hardwareCategory1 = hardwareCategory1;
    }

    public String getHardwareCategory2() {
        return hardwareCategory2;
    }

    public void setHardwareCategory2(String hardwareCategory2) {
        this.hardwareCategory2 = hardwareCategory2;
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getLeId() {
        return leId;
    }

    public void setLeId(String leId) {
        this.leId = leId;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getMacVendor() {
        return macVendor;
    }

    public void setMacVendor(String macVendor) {
        this.macVendor = macVendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getPlantLocation() {
        return plantLocation;
    }

    public void setPlantLocation(String plantLocation) {
        this.plantLocation = plantLocation;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPurdueLevel() {
        return purdueLevel;
    }

    public void setPurdueLevel(String purdueLevel) {
        this.purdueLevel = purdueLevel;
    }

    public String getRedundancy() {
        return redundancy;
    }

    public void setRedundancy(String redundancy) {
        this.redundancy = redundancy;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
