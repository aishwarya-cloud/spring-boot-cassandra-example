package guru.springframework.domain.model.dto.extendedAsset;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Profinet {
    private Map<String, AssetAttribute> assetName;

    private Map<String, AssetAttribute> equipmentVendor;

    private Map<String, AssetAttribute> equipmentType;

    private Map<String, AssetAttribute> deviceId;

    private Map<String, AssetAttribute> vendorId;

    private Map<String, AssetAttribute> aliasName;

    //pndcerpc
    private Map<String, AssetAttribute> slot;
    //To be removed
    private Map<String, AssetAttribute> firmwareSystem;
    private Map<String, AssetAttribute> firmwareVersion;
    private Map<String, AssetAttribute> hardwareVersion;
    private Map<String, AssetAttribute> serialNumber;
    private Map<String, AssetAttribute> orderId;
    private Map<String, AssetAttribute> location;
    private Map<String, AssetAttribute> function;
    private Map<String, AssetAttribute> installationDate;
    private Map<String, AssetAttribute> description;

}
