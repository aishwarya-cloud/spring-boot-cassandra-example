package guru.springframework.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssetComponentResponse {
    private Long id;
    private String customerUuid;
    private String assetUuid;
    private String orderId;
    private String serialNo;
    private String hardwareVersion;
    private String firmwareVersion;
    private String model;
    private Long assetId;
}
