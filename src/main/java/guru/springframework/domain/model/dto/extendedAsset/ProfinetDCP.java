package guru.springframework.domain.model.dto.extendedAsset;

import lombok.Data;

@Data
public class ProfinetDCP {
    private String assetName;
    private String equipmentType;
    private String equipmentVendor;
    private String deviceId;
    private String vendorId;
}
