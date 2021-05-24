package guru.springframework.domain.model.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ASSET_MODULE")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AssetModule{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CUSTOMER_UUID")
    private String customerUuid;

    @Column(name = "ASSET_UUID")
    private String assetUuid;

    @Column(name = "MODULE_UUID")
    private String moduleUuid;

    @Column(name = "FIRMWARE_VERSION")
    private String firmwareVersion;

    @Column(name = "FIRST_SEEN")
    private Date firstSeen;

    @Column(name = "LAST_SEEN")
    private Date lastSeen;

    @Column(name ="MODEL")
    private String model;

    @Column(name = "MODULE_TYPE")
    private String moduleType;

    @Column(name = "MANUFACTURER")
    private String manufacturer;

    @Column(name="RACK")
    private Integer rack;

    @Column(name = "SLOT")
    private Integer slot;

    @Column(name="SERIAL_NO")
    private String serialNo;

    @Column(name="HARDWARE_VERSION ")
    private String hardwareVersion;

    @Column(name="ORDER_ID")
    private String orderId;

    @Column(name="OPERATIONAL_STATUS")
    private String operationalStatus;

    @Column(name="ASSET_RELATION")
    private Integer assetRelation;

    @Column(name = "ASSET_ID")
    private Long assetId;

    /*@Column
    private String osMappingStatus;

    @Column
    private String hwMappingStatus;*/

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "MODULE_ID", referencedColumnName = "id")
    private Module module;
}


