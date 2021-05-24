package guru.springframework.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssetModuleResponse {
    private Long assetModuleId;
    private String customerUuid;
    private String assetUuid;
    private Long assetId;
    private String moduleUuid;
    private String modelName;
    private String moduleType;
    private Integer rack;
    private Integer slot;
    private Integer assetRelation;
    private Long moduleId;
    private ModuleResponse module;
}
