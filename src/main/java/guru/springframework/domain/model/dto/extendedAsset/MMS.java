package guru.springframework.domain.model.dto.extendedAsset;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MMS {
    private Map<String, AssetAttribute> vendorName;
    private Map<String, AssetAttribute> modelName;
    private Map<String, AssetAttribute> revision;
}
