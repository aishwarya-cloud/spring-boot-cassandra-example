package guru.springframework.domain.model.dto.extendedAsset;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class S7Protocol {
    private Map<String, AssetAttribute> plcName;
    private Map<String, AssetAttribute> moduleName;
    private Map<String, AssetAttribute> plantName;
    private Map<String, AssetAttribute> oemName;
    private Map<String, AssetAttribute> serialNumber;
    private Map<String, AssetAttribute> moduleType;
    private Map<String, HWFWVersion> orderIds;
}
