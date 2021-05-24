package guru.springframework.domain.model.datastax.tables;

/*import com.datastax.driver.mapping.annotations.ClusteringColumn;
import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.qualys.ics.model.datastax.enums.JobStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;
import java.util.UUID;

import static com.qualys.ics.util.ICSConstants.ASSETPURGELOG_TABLE;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(keyspace = "qualys_ics", name = ASSETPURGELOG_TABLE)
@ToString
@Deprecated
public class AssetPurgeLog {
    @JsonIgnore
    private static final long serialVersionUID = 1L;
    @PartitionKey(value = 0)
    @Column
    private UUID customerUUID;
    @PartitionKey(value = 1)
    @Column
    private String leId;
    //This indicates all assets discoveries, link messages, traffic, OS update received before this timestamp should be ignored.
    @ClusteringColumn
    @Column
    private Instant receivedTimestamp;
    @Column
    private UUID jobId;
    @Column
    private JobStatus jobStatus;
    @Column
    private Instant updatedTimestamp;
}*/
