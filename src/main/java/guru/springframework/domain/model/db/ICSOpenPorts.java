package guru.springframework.domain.model.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ICS_OPEN_PORTS")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ICSOpenPorts{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CUSTOMER_UUID")
    private String customerUuid;

    @Column(name = "ASSET_UUID")
    private String assetUuid;

    @Column(name = "PORT")
    private Integer port;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="PROTOCOL")
    private String protocol;

    @Column(name="DETECTED_SERVICE")
    private String detectedService;

    @Column(name="SERVICE_FAMILY")
    private String serviceFamily;

    @Column(name="DETECTED_TIMESTAMP")
    private Date detectedTimeStamp;

    @Column(name="ASSET_ID")
    private Integer assetId;
}


