package guru.springframework.domain.model.redis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExtendedAssetDetailsPojo implements Serializable {
    private Long id;
    private Map<String, ProtocolInfoPojo> protocolInfo;
}
