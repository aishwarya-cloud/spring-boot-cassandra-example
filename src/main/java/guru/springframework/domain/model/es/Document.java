package guru.springframework.domain.model.es;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Data
public class Document {

    private String id;

    private String index;

    private String type;

    private String operation;

    private Object data;
}
