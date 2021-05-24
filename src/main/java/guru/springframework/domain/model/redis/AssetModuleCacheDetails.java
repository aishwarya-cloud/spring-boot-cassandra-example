package guru.springframework.domain.model.redis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by vkakad on 1/28/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssetModuleCacheDetails implements Serializable {

    private Long id;

    private String customerUuid;

    private String assetUuid;

    private String moduleUuid;

    private String firmwareVersion;

    private Date firstSeen;

    private Date lastSeen;

    private String model;

    private String moduleType;

    private String manufacturer;

    private Integer rack;

    private Integer slot;

    private String serialNo;

    private String hardwareVersion;

    private String orderId;

    private String operationalStatus;

    private Integer assetRelation;

    private Long assetId;

    private Long moduleId;

}
