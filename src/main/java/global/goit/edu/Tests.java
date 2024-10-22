package global.goit.edu;

import global.goit.edu.client.Client;
import global.goit.edu.database.DatabaseInitService;
import global.goit.edu.hibernateservice.HibernateService;
import global.goit.edu.planet.PlanetService;
import global.goit.edu.planet.Planets;
import global.goit.edu.ticket.DateTimeService;
import global.goit.edu.ticket.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Arrays;

public class Tests {

    public static void main(String[] args) {
        //DatabaseInitService.main(null);

        PlanetService jupiter = PlanetService.builder()
                .id(Planets.JUP)
                .name(Planets.JUP.name)
                .build();

        PlanetService earth = PlanetService.builder()
                .id(Planets.EAR)
                .name(Planets.EAR.name)
                .build();

        Client client = Client.builder()
                .name("Denis")
                .build();

        Ticket ticket = Ticket
                .builder()
                .clientId(client.getId())
                .createAt(DateTimeService.get())
                .fromPlanet(Planets.JUP)
                .toPlanet(Planets.EAR)
                .build();

        SessionFactory sessionFactory = HibernateService.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        session.persist(jupiter);
        session.persist(earth);
        session.persist(client);
        session.persist(ticket);
        transaction.commit();
        session.close();

        //System.out.println(Planets.EAR.name);

    }
}