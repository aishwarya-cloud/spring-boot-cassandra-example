package guru.springframework.domain.model.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "MODULE")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Module{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="MODULE_UUID")
    private String moduleUUID;

    @Column(name = "CUSTOMER_UUID")
    private String customerUuid;

    @Column(name="FIRMWARE_VERSION ")
    private String firmwareVersion;

    @Column(name="MODEL")
    private String model;

    @Column(name="MODULE_TYPE")
    private String moduleType;

    @Column(name="MANUFACTURER")
    private String manufacturer;

    @Column(name="VULN_COUNT")
    private Integer vulnCount;
}


