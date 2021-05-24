package guru.springframework.domain.model.es;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AssetModule {

    private Long assetModuleId;
    private String customerUuid;
    private String assetUuid;
    private Long assetId;
    private String moduleUuid;
    private Integer rack;
    private Integer slot;
    private Integer assetRelation;
    private Long moduleId;
    private Long vulnerabilityCount;
    private String modelName;
    private Short risk;
}
