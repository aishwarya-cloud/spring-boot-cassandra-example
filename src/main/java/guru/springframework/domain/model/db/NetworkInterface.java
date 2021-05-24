package guru.springframework.domain.model.db;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "NETWORK_INTERFACE")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NetworkInterface {

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

}
