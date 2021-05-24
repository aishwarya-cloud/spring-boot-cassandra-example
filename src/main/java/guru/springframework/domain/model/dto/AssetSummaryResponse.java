package guru.springframework.domain.model.dto;


import guru.springframework.domain.model.datastax.udts.NetworkInterface;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Set;

/**
 * Created by Iqbal Tariq on 08/18/2020.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssetSummaryResponse {
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
    private Integer rack;
    private Integer slot;
    private Map<String, NetworkInterface> networkInterfaces;
    //private Set<String> racks;
    private String hardwareVersion;
    private String discoveryProtocol;
    private String domainName;
    private Set<AssetMigrateResponse> assetMigrateHistory;
    private String hardwareCategory1;
    private String hardwareCategory2;
    private Boolean isDeleted;
    private String lastModifiedBy;
}
