package global.goit.edu.ticket;

import global.goit.edu.planet.Planets;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Builder
@Entity(name = "ticket")
@Data
public class Ticket {

    @Id
    private long id;

    @Column(name = "create_at")
    private String createAt;

    @Column(name = "client_id")
    private long clientId;

    @Column(name = "from_planet_id")
    private Planets fromPlanet;

    @Column(name = "to_planet_id")
    private Planets toPlanet;

}
