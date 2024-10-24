package global.goit.edu.planet;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@Entity(name = "planetEntity")
@Table(name = "planet")
public class PlanetService {

    @Getter
    @Id
    private String id;

    @Getter
    @Column(name = "name")
    private String name;

    public PlanetService(String id, String name) {
        if (checkForValidPlanetValue(id)) {
            this.id = id;
        }
        if (checkForValidPlanetName(name)) {
            this.name = name;
        }
    }

    public void setId(String id) {
        if (checkForValidPlanetValue(id)) {
            this.id = id;
        }
    }

    public void setName(String name) {
        if (checkForValidPlanetName(name)) {
            this.name = name;
        }
    }

    public boolean checkForValidPlanetName(String name) {

        Planets[] planets = Planets.values();

        for (Planets planet : planets) {
            if (planet.name.equals(name)) {
                return true;
            }
        }
        throw new IllegalArgumentException("Invalid planet name = " + name);
    }

    public boolean checkForValidPlanetValue(String value) {

        Planets[] planets = Planets.values();

        for (Planets planet : planets) {
            if (planet.toString().equals(value)) {
                return true;
            }
        }
        throw new IllegalArgumentException("Invalid planet id = " + value);
    }

}
