package guru.springframework.domain.model.redis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by Iqbal Tariq on 10/12/2020.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NetworkProtocolPojo implements Serializable {
    private String customerUuid;
    private String assetUuid;
    private String interfaceKey;
    private Set<String> protocols;
}
