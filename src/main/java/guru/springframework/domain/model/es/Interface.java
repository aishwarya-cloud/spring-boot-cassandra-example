package guru.springframework.domain.model.es;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Set;

/**
 * Created by vkakad on 6/12/2020
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Interface {

    private String address;

    private String macAddress;

    private Set<String> gatewayIps;

    private Set<String> protocols;
}
