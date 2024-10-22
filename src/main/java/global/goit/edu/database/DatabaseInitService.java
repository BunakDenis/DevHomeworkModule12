package global.goit.edu.database;

import org.flywaydb.core.Flyway;

public class DatabaseInitService {

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