package guru.springframework.domain.model.es;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Data
public class Documents {

    private List<Document> documents;
}
