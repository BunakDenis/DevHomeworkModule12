package global.goit.edu;

import global.goit.edu.client.Client;
import global.goit.edu.client.ClientDAO;
import global.goit.edu.database.DatabaseInitService;
import global.goit.edu.hibernateservice.HibernateService;
import global.goit.edu.planet.PlanetDAO;
import global.goit.edu.planet.PlanetService;
import global.goit.edu.planet.Planets;
import global.goit.edu.ticket.DateTimeService;
import global.goit.edu.ticket.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.*;
import java.util.List;

public class Tests {

    public static void main(String[] args) throws SQLException {
        //DatabaseInitService.main(null);
        PlanetDAO planetDAO = new PlanetDAO();
        System.out.println(planetDAO.delete(Planets.JUP));
        planetDAO.getAll().forEach(System.out::println);
        System.out.println(planetDAO.save(Planets.JUP));
        planetDAO.getAll().forEach(System.out::println);
    }
}