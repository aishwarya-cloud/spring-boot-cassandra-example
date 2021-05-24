package guru.springframework.domain.model.es;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OperatingSystem {

    private String name;
}
