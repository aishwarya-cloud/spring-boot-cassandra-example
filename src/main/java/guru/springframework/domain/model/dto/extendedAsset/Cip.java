package guru.springframework.domain.model.dto.extendedAsset;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cip {
    private String assignedName;
    private String status;
    private String deviceType;
    private String assignedDescription;
    private String vendorId;
    private String productName;
    private String itemRevision;
    private String serialNumber;
    private String geographicLocation;
    private String productCode;
    private String rackNo;
    private String slotNo;
}
