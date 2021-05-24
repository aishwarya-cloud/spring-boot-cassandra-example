package guru.springframework.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Iqbal Tariq on 08/18/2020.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssetMigrateResponse {
    private String leId;
    //private String sensorName;
    //private String location;
    private Long firstSeen;
    private Long lastSeen;
}
