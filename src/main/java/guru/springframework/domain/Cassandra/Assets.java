package guru.springframework.domain.Cassandra;

import com.datastax.driver.core.DataType;
import com.datastax.driver.mapping.annotations.Frozen;
import guru.springframework.domain.Cassandra.UDT.AssetMigrate;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.time.Instant;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


@Table("asset")
public class Assets implements Serializable{
    @PrimaryKeyColumn(name = "customerUuid", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private UUID customerUuid;

    @PrimaryKeyColumn(name = "assetUuid", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private UUID assetUuid;

    private String leId;
    private String name;
    private String address;
    private String macAddress;
    private String type;
    private String category;
    private String purdueLevel;
    private String deviceLocation;
    private String plantLocation;
    private String redundancy;
    private String criticality;
    private Instant firstSeen;
    private Instant lastSeen;
    private String state;
    private Integer importance;
    private String equipmentVendor;
    private String macVendor;
    private String product;
    private String model;
    private String serialNo;
    private String os;
    private String firmwareVersion;
    private Integer rack;
    private Integer slot;
   private Map<String, String> networkInterfaces;
    private String hardwareVersion;
    private Set<String> discoveryProtocol;
    private String domainName;
    //@Frozen("set<frozen<assetmigrate>>")
    //User-defined type
    @Frozen
    @Column
    @CassandraType(type = DataType.Name.UDT, userTypeName = "assetmigrate")
    private Set<AssetMigrate> assetMigrateHistory;

   // private Set<AssetMigrate> assetMigrateHistory;
    private String hardwareCategory1;
    private String hardwareCategory2;
    private Boolean isDeleted;
    private String lastModifiedBy;
    private Instant lastModified;

    public Assets() {
    }

    public Set<AssetMigrate> getAssetMigrateHistory() {
        return assetMigrateHistory;
    }

    public void setAssetMigrateHistory(Set<AssetMigrate> assetMigrateHistory) {
        this.assetMigrateHistory = assetMigrateHistory;
    }

    public UUID getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(UUID customerUuid) {
        this.customerUuid = customerUuid;
    }

    public UUID getAssetUuid() {
        return assetUuid;
    }

    public void setAssetUuid(UUID assetUuid) {
        this.assetUuid = assetUuid;
    }

    public String getLeId() {
        return leId;
    }

    public void setLeId(String leId) {
        this.leId = leId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurdueLevel() {
        return purdueLevel;
    }

    public void setPurdueLevel(String purdueLevel) {
        this.purdueLevel = purdueLevel;
    }

    public String getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public String getPlantLocation() {
        return plantLocation;
    }

    public void setPlantLocation(String plantLocation) {
        this.plantLocation = plantLocation;
    }

    public String getRedundancy() {
        return redundancy;
    }

    public void setRedundancy(String redundancy) {
        this.redundancy = redundancy;
    }

    public String getCriticality() {
        return criticality;
    }

    public void setCriticality(String criticality) {
        this.criticality = criticality;
    }

    public Instant getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Instant firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Instant getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Instant lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    public String getEquipmentVendor() {
        return equipmentVendor;
    }

    public void setEquipmentVendor(String equipmentVendor) {
        this.equipmentVendor = equipmentVendor;
    }

    public String getMacVendor() {
        return macVendor;
    }

    public void setMacVendor(String macVendor) {
        this.macVendor = macVendor;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
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

    public Map<String, String> getNetworkInterfaces() {
        return networkInterfaces;
    }

    public void setNetworkInterfaces(Map<String, String> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public Set<String> getDiscoveryProtocol() {
        return discoveryProtocol;
    }

    public void setDiscoveryProtocol(Set<String> discoveryProtocol) {
        this.discoveryProtocol = discoveryProtocol;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
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

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModified() {
        return lastModified;
    }

    public void setLastModified(Instant lastModified) {
        this.lastModified = lastModified;
    }
}
