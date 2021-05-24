package guru.springframework.domain.Oracle;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "NETWORK_INTERFACE")
public class OracleNetworkInterface {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CUSTOMER_UUID")
    private String customerUuid;

    @Column(name = "ASSET_UUID")
    private String assetUuid;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name="MAC_ADDRESS")
    private String macAddress;

    @Column(name="LAST_SEEN")
    private Date lastSeen;

    @Column(name="GATEWAY_IPS")
    private String gatewayIPs;

    @Column(name="DNS_SERVERS")
    private String dnsServers;

    @Column(name="PROTOCOLS")
    private String protocols;

    @Column(name="ASSET_ID")
    private Long assetId;

    public OracleNetworkInterface() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
    }

    public String getAssetUuid() {
        return assetUuid;
    }

    public void setAssetUuid(String assetUuid) {
        this.assetUuid = assetUuid;
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

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getGatewayIPs() {
        return gatewayIPs;
    }

    public void setGatewayIPs(String gatewayIPs) {
        this.gatewayIPs = gatewayIPs;
    }

    public String getDnsServers() {
        return dnsServers;
    }

    public void setDnsServers(String dnsServers) {
        this.dnsServers = dnsServers;
    }

    public String getProtocols() {
        return protocols;
    }

    public void setProtocols(String protocols) {
        this.protocols = protocols;
    }

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }
}
