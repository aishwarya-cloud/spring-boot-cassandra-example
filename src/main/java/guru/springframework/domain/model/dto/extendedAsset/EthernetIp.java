package guru.springframework.domain.model.dto.extendedAsset;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EthernetIp {
    private Map<String, AssetAttribute> vendorId;
    private Map<String, AssetAttribute> itemRevision;
    private Map<String, AssetAttribute> assignedName;
    private Map<String, AssetAttribute> assignedDescription;
    private Map<String, AssetAttribute> geographicLocation;
    private Map<String, AssetAttribute> deviceType;
    private Map<String, AssetAttribute> productName;
    private Map<String, AssetAttribute> productCode;
    private Map<String, AssetAttribute> serialNumber;
    private Map<String, AssetAttribute> hardwareVersion;
    private Map<String, AssetAttribute> status;
}
