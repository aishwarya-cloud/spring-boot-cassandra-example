package guru.springframework.domain.Cassandra;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Set;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetworkInterface {
    private String address;
    private String macAddress;
    private Long lastSeen;
    private Set<String> gatewayIps;
    private Set<String> dnsServers;

    public NetworkInterface() {
    }

    public NetworkInterface(String address, String macAddress, Long lastSeen, Set<String> gatewayIps, Set<String> dnsServers) {
        this.address = address;
        this.macAddress = macAddress;
        this.lastSeen = lastSeen;
        this.gatewayIps = gatewayIps;
        this.dnsServers = dnsServers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public Long getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Long lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Set<String> getGatewayIps() {
        return gatewayIps;
    }

    public void setGatewayIps(Set<String> gatewayIps) {
        this.gatewayIps = gatewayIps;
    }

    public Set<String> getDnsServers() {
        return dnsServers;
    }

    public void setDnsServers(Set<String> dnsServers) {
        this.dnsServers = dnsServers;
    }
}

