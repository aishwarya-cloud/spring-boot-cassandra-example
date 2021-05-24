package guru.springframework.domain.model.es;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

/**
 * Created by vkakad on 2/3/2021
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ModuleData {
    private Long moduleId;
    private String moduleUuid;
    private String customerUuid;
    private String modelName;
    private String type;
    private String manufacturer;
    private String firmwareVersion;
    private Integer vulnCount;
    private String productName;
    private Short risk;
    private List<Long> qids;
    private String hardwareCategory1;
}
