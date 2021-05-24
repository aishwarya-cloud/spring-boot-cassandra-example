package guru.springframework.domain.model.redis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by vkakad on 2/4/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssetComponentCacheDetails implements Serializable {

    private String customerUuid;

    private String assetUuid;

    private Long assetId;

    private Set<AssetComponentDetails> assetComponentDetails;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AssetComponentDetails implements Serializable {

        private Long id;

        private String orderId;

        private String serialNo;

        private String hardwareVersion;

        private String firmwareVersion;

        private String model;
    }
}
