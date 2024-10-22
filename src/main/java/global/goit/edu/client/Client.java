package global.goit.edu.client;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Builder
@Entity(name = "client")
@Data
public class Client {
    @Id
    private long id;
    @Column(name = "name", length = 200)
    private String name;
}

