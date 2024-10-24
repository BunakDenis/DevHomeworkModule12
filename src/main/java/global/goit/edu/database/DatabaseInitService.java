package global.goit.edu.database;

import org.flywaydb.core.Flyway;

import java.util.Arrays;

public class DatabaseInitService {
//jdbc:h2:mem:test;DB_CLOSE_DELAY=-1
    //jdbc:h2:./space_travel
    public static void main(String[] args) {

        Flyway flyway = Flyway.configure()
                .dataSource(
                        "jdbc:h2:./space_travel",
                        null,
                        null
                )
                .load();

        flyway.migrate();
    }
}