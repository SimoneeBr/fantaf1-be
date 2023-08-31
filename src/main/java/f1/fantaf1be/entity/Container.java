package f1.fantaf1be.entity;

import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "containers")
public class Container {

    @Id
    private String id;
    private String name;
    @Nullable
    private String abbr;
    private String type;
    private int token;
}
