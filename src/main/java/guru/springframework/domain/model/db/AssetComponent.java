package guru.springframework.domain.model.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "ASSET_COMPONENT")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AssetComponent{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CUSTOMER_UUID")
    private String customerUuid;

    @Column(name = "ASSET_UUID")
    private String assetUuid;

    @Column(name = "ORDER_ID")
    private String orderId;

    @Column(name = "SERIAL_NO")
    private String serialNo;

    @Column(name = "HARDWARE_VERSION")
    private String hardwareVersion;

    @Column(name = "FIRMWARE_VERSION")
    private String firmwareVersion;

    @Column(name = "MODEL")
    private String model;

    @Column(name ="ASSET_ID ")
    private Long assetId;
}


