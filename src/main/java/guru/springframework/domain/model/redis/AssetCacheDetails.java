package guru.springframework.domain.model.redis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by mpahade on 11/09/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssetCacheDetails implements Serializable {
    private Long id;
    private String customerUuid;
    private String assetUuid;
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
    private Long firstSeen;
    private Long lastSeen;
    private String state;
    private Integer importance;
    private String equipmentVendor;
    private String macVendor;
    private String product;
    private String model;
    private String serialNo;
    private String os;
    private String firmwareVersion;
    private String hardwareVersion;
    private Set<String> discoveryProtocol;
    private String domainName;
    private Set<AssetMigratePojo> assetMigrateHistory;
    private ExtendedAssetDetailsPojo extendedAssetDetails;
    private String hardwareCategory1;
    private String hardwareCategory2;
    private Boolean isDeleted;
    private String lastModifiedBy;
    private Long lastModified;
}
