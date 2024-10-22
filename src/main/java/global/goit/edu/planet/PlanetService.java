package global.goit.edu.planet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@Entity(name = "planet")
public class PlanetService {
    @Getter
    @Setter
    @Id
    private Planets id;
    @Getter
    @Column(name = "name")
    private String name;

    public PlanetService(Planets id, String name) {
        this.id = id;

        if (checkForValidPlanetName(name)) {
            this.name = name;
        }
    }

    public void setName(String name) {
        if (checkForValidPlanetName(name)) {
            this.name = name;
        }
    }

    private boolean checkForValidPlanetName(String name) {

        Planets[] planets = Planets.values();

        for (Planets planet : planets) {
            if (planet.name.equals(name)) {
                return true;
            }
        }
        throw new IllegalArgumentException("Invalid planet name = " + name);
    }
}
