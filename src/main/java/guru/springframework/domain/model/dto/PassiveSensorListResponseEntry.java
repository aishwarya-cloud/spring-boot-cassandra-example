package guru.springframework.domain.model.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by Iqbal Tariq on 05/15/2020.
 */
@Data
public class PassiveSensorListResponseEntry {

    private SensorInfo sensorInfo;
    private List<SensorInfo> sensorHistory;
}
