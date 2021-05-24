package guru.springframework.domain.model.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ASSET_MIGRATE_HISTORY")
public class AssetMigrateHistory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CUSTOMER_UUID")
    private String customerUuid;

    @Column(name = "ASSET_UUID")
    private String assetUuid;

    @Column(name = "LE_ID")
    private String leId;

    @Column(name="FIRST_SEEN")
    private Date firstSeen;

    @Column(name="LAST_SEEN")
    private Date lastSeen;

    @Column(name = "ASSET_ID")
    private Long assetId;

    @Override
    public int hashCode() {
        return this.getLeId().hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof AssetMigrateHistory))
            return false;
        else
            return this.getLeId().equals(((AssetMigrateHistory) obj).getLeId());
    }
}
