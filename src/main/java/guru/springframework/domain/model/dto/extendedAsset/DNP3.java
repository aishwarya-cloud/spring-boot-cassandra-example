package guru.springframework.domain.model.dto.extendedAsset;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DNP3 {

    private Map<String, AssetAttribute> vendorName;
    private Map<String, AssetAttribute> modelName;
    private Map<String, AssetAttribute> softwareVersion;
    private String hostname;
    private Map<String, AssetAttribute> serialNumber;
    private Map<String, AssetAttribute> deviceId;
    private Map<String, AssetAttribute> location;
    private Map<String, AssetAttribute> hardwareVersion;
}
