package guru.springframework.domain.model.redis;

import com.fasterxml.jackson.annotation.JsonIgnore;
import guru.springframework.domain.model.datastax.enums.JobStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Iqbal Tariq on 09/16/2020.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssetPurgeLogPojo implements Serializable {
    @JsonIgnore
    private static final long serialVersionUID = 1L;
    private String customerUUID;
    private String leId;
    //This indicates all assets discoveries, link messages, traffic, OS update received before this timestamp should be ignored.
    private Long receivedTimestamp;
    private String jobId;
    private JobStatus jobStatus;
    private Long updatedTimestamp;
}
