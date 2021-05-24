package guru.springframework.domain.model.redis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by vkakad on 12/17/2020
 */
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NetworkInterfacePojo implements Serializable {

    private Long assetId;

    private String customerUuid;

    private String assetUuid;

    private Set<NetworkInterfaceDetails> networkInterfaces;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class NetworkInterfaceDetails implements Serializable {

        private Long id;

        private String address;

        private String macAddress;

        private Long lastSeen;

        private Set<String> gatewayIPs;

        private Set<String> dnsServers;

        private Set<String> protocols;
    }
}
