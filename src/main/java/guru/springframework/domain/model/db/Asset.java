package guru.springframework.domain.model.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by vkakad on 11/25/2020
 */

@Entity
@Table(name = "ASSET")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Asset {

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
}
