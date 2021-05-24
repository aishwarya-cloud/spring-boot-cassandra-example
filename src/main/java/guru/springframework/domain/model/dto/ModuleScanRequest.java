package guru.springframework.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by vkakad on 2/9/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModuleScanRequest {

    private String customerUuid;
    private String assetUuid;
    private String leId;
    private Long timestamp;
    private String manufacturer;
    private String product;
    private String model;
    private String version;
    private String address;
}
