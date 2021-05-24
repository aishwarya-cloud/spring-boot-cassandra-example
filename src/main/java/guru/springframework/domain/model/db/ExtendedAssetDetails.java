package guru.springframework.domain.model.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "EXTENDED_ASSET_DETAILS")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExtendedAssetDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CUSTOMER_UUID")
    private String customerUuid;

    @Column(name = "ASSET_UUID")
    private String assetUuid;

    @Column(name = "ADDITIONAL_INFO")
    private String hardwareVersion;

    @Column(name ="ASSET_ID ")
    private Long assetId;

    @Column(name = "PROTOCOL_INFO")
    private String protocolInfo;
}
