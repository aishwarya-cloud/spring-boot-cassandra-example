package guru.springframework.domain.model.redis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by mpahade on 14/09/2020.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssetMigratePojo {
    private Long id;
    private String leId;
    private Long firstSeen;
    private Long lastSeen;

    @Override
    public int hashCode() {
        return this.getLeId().hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof AssetMigratePojo))
            return false;
        else
            return this.getLeId().equals(((AssetMigratePojo) obj).getLeId());
    }
}
