package guru.springframework.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModuleResponse {
    private Long moduleId;
    private String moduleUuid;
    private String customerUuid;
    private String modelName;
    private String type;
    private String manufacturer;
    private String firmwareVersion;
    private Integer vulnCount;
}
