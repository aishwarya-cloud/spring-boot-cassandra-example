package guru.springframework.domain.Cassandra.UDT;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.time.Instant;

@UserDefinedType(value = "assetmigrate")
public class AssetMigrate {

    private String leId;
    private Instant firstSeen;
    private Instant lastSeen;

    public AssetMigrate() {
    }

    public String getLeId() {
        return leId;
    }

    public void setLeId(String leId) {
        this.leId = leId;
    }

    public Instant getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Instant firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Instant getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Instant lastSeen) {
        this.lastSeen = lastSeen;
    }
}
