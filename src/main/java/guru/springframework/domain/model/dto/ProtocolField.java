package guru.springframework.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProtocolField {
    String label;
    String value;
}
