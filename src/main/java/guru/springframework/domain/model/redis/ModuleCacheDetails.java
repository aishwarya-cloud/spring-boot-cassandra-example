package guru.springframework.domain.model.redis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by vkakad on 1/27/2021
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModuleCacheDetails implements Serializable {

    private Long id;

    private String moduleUuid;

    private String customerUuid;

    private String firmwareVersion;

    private String model;

    private String moduleType;

    private String manufacturer;

    private Integer vulnCount;

    public String getUniqueKey() {
        return String.valueOf(Objects.hash(firmwareVersion, model, moduleType, manufacturer));
    }
}
