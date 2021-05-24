package guru.springframework.domain.model.dto;

import lombok.Data;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by Iqbal Tariq on 05/15/2020.
 */
@Data
public class SensorInfo {
    private String id;
    private String name;
    private String location;
    private Long firstSeen;
    private Long lastSeen;
    private String status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SensorInfo that = (SensorInfo) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

    public static class SensorLastSeenComparator implements Comparator<SensorInfo> {

        @Override
        public int compare(SensorInfo o1, SensorInfo o2) {
            if (o1 == null) {
                return (o2 == null) ? 0 : 1;
            } else if (o2 == null) {
                return -1;
            } else if (o1 == null && o2 == null){
                return 0;
            } else {
                return o1.getLastSeen().compareTo(o2.getLastSeen());
            }
        }
    }
}
