package guru.springframework.domain.model.es;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;
import java.util.Set;

//@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AssetData {

    private String leId;

    private String customerUuid;

    private String assetUuid;

    private String name;

    private String address;

    private String type;

    private Integer importance;

    private String manufacturer;

    private String model;

    private Long firstSeen;

    private Long lastSeen;

    private String macAddress;

    private OperatingSystem operatingSystem;

    private Hardware hardware;

    private List<Interface> interfaces;

    private Long assetId;

    private Long vulnerabilityCount;

    private Short risk;

    private String state;

    private Set<String> discoveryProtocols;

    private String serialNumber;

    private String orderId;

    private List<AssetModule> assetModules;

    public AssetData() {
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

    public String getAssetUuid() {
        return assetUuid;
    }

    public void setAssetUuid(String assetUuid) {
        this.assetUuid = assetUuid;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Long firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Long getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Long lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Hardware getHardware() {
        return hardware;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    public List<Interface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<Interface> interfaces) {
        this.interfaces = interfaces;
    }

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public Long getVulnerabilityCount() {
        return vulnerabilityCount;
    }

    public void setVulnerabilityCount(Long vulnerabilityCount) {
        this.vulnerabilityCount = vulnerabilityCount;
    }

    public Short getRisk() {
        return risk;
    }

    public void setRisk(Short risk) {
        this.risk = risk;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Set<String> getDiscoveryProtocols() {
        return discoveryProtocols;
    }

    public void setDiscoveryProtocols(Set<String> discoveryProtocols) {
        this.discoveryProtocols = discoveryProtocols;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<AssetModule> getAssetModules() {
        return assetModules;
    }

    public void setAssetModules(List<AssetModule> assetModules) {
        this.assetModules = assetModules;
    }
}
