package guru.springframework.domain.model.datastax.udts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetworkInterface {
    private String address;
    private String macAddress;
    private Long lastSeen;
    private Set<String> gatewayIps;
    private Set<String> dnsServers;
}