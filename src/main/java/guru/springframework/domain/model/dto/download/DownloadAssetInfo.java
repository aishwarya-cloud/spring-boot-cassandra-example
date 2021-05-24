package guru.springframework.domain.model.dto.download;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Data
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DownloadAssetInfo {

    @JsonProperty(value = "uuid")
    private String assetUuid;

    @JsonProperty(value = "name")
    private String assetName;

    @JsonProperty(value = "type")
    private String assetType;

    @JsonProperty(value = "state")
    private String assetState;

    @JsonProperty
    private String vendor;

    @JsonProperty
    private String model;

    @JsonProperty
    private String product;

    @JsonProperty
    private String firmwareVersion;

    @JsonProperty
    private String operatingSystem;

    @JsonProperty
    private String serialNumber;

    @JsonProperty
    private String macManufacturer;

    @JsonProperty
    private String hardwareVersion;

    @JsonProperty
    private String discoveryProtocol;

    @JsonProperty
    private String protocols;

    @JsonProperty
    private String ipv4Address;

    @JsonProperty
    private String ipv6Address;

    @JsonProperty
    private String macAddress;

    //@JsonProperty
    //private String inventorySource;

    @JsonProperty(value = "sensorId")
    private String leId;

    @JsonProperty(value = "sensorLocation")
    private String leLocation;

    @JsonProperty(value = "created")
    private Long firstSeen;

    @JsonProperty(value = "lastUpdated")
    private Long lastSeen;
}
