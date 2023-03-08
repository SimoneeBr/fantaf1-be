package f1.fantaf1be.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "gare")
public class Gare {
    @Id
    private String id;

    private String nomeGara;

    private LocalDateTime scadenzaSchieramento;

    private LocalDateTime dataGara;
}
