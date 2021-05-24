package guru.springframework.domain.model.dto.extendedAsset;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class S7CommPlus {

    private Map<String, AssetAttribute> vendorId;

    private Map<String, AssetAttribute> orderId;

    private Map<String, AssetAttribute> firmwareVersion;

    private Map<String, AssetAttribute> description;

    private Map<String, AssetAttribute> hardwareVersion;

    private Map<String, AssetAttribute> location;

    private Map<String, AssetAttribute> serialNumber;

}
