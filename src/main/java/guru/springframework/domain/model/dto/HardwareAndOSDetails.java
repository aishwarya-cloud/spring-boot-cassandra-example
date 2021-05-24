package guru.springframework.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by vkakad on 2/7/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HardwareAndOSDetails {

    private String firmwareVersion;
    private String serialNumber;
    private String orderId;
    private String hardwareVersion;
    private String manufacturer;
    private String model;
    private String category2;
    private String osName;
    private String product;
    private String category1;
    private String type;
    private String CategoryTag;  // aish

}
