package guru.springframework.domain.Oracle;

import javax.persistence.*;


@Entity
@Table(name = "ASSET_COMPONENT")

public class OracleAssetComponent {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CUSTOMER_UUID")
    private String customerUuid;

    @Column(name = "ASSET_UUID")
    private String assetUuid;

    @Column(name = "ORDER_ID")
    private String orderId;

    @Column(name = "SERIAL_NO")
    private String serialNo;

    @Column(name = "HARDWARE_VERSION")
    private String hardwareVersion;

    @Column(name = "FIRMWARE_VERSION")
    private String firmwareVersion;

    @Column(name = "MODEL")
    private String model;

    @Column(name ="ASSET_ID ")
    private Long assetId;

    public OracleAssetComponent() {
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }
}
