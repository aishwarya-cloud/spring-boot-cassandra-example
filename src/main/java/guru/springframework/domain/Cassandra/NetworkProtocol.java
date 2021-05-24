package guru.springframework.domain.Cassandra;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;


@Table("networkprotocol")
public class NetworkProtocol implements Serializable{
    @PrimaryKeyColumn(name = "customerUuid", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private UUID customerUuid;

    @PrimaryKeyColumn(name = "assetUuid", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private UUID assetUuid;
    private String interfaceKey;
    private Set<String> protocols;

    public NetworkProtocol(UUID customerUuid, UUID assetUuid, String interfaceKey, Set<String> protocols) {
        this.customerUuid = customerUuid;
        this.assetUuid = assetUuid;
        this.interfaceKey = interfaceKey;
        this.protocols = protocols;
    }

    public UUID getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(UUID customerUuid) {
        this.customerUuid = customerUuid;
    }

    public UUID getAssetUuid() {
        return assetUuid;
    }

    public void setAssetUuid(UUID assetUuid) {
        this.assetUuid = assetUuid;
    }

    public String getInterfaceKey() {
        return interfaceKey;
    }

    public void setInterfaceKey(String interfaceKey) {
        this.interfaceKey = interfaceKey;
    }

    public Set<String> getProtocols() {
        return protocols;
    }

    public void setProtocols(Set<String> protocols) {
        this.protocols = protocols;
    }
}
