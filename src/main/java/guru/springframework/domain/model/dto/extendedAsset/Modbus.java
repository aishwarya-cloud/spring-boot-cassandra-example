package guru.springframework.domain.model.dto.extendedAsset;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Modbus {
    private Map<String, AssetAttribute> vendorName;
    private Map<String, AssetAttribute> productCode;
    private Map<String, AssetAttribute> firmwareVersion;
    private Map<String, AssetAttribute> productName;
    private Map<String, AssetAttribute> modelName;
}
