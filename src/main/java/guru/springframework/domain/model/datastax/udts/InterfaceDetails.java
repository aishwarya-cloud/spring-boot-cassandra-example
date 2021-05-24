package guru.springframework.domain.model.datastax.udts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class InterfaceDetails {

    private String ipV4;
    private String ipV6;
    private String macAddress;
    private String domain;
    private Set<String> dnsServers;
    private Set<String> gatewayIps;
    private Set<String> protocols;
}
