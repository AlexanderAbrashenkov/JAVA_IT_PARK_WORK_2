package ru.itis;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.dao.AutoDao;
import ru.itis.dao.AutoDaoJdbcTemplateImpl;
import ru.itis.dao.UsersDao;
import ru.itis.dao.UsersDaoJdbcTemplateImpl;
import ru.itis.models.Auto;
import ru.itis.models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/abrashenkov_db");
        dataSource.setUsername("postgres");
        dataSource.setPassword("Zaq12wsx");

        UsersDao usersDao = new UsersDaoJdbcTemplateImpl(dataSource);
        List<User> users = usersDao.findAll();

        users.forEach(System.out::println);

        User updatedMarsel = new User(1, "Марсель",34, 189);
        usersDao.update(updatedMarsel);

        System.out.println("--------------------------");

        AutoDao autoDao = new AutoDaoJdbcTemplateImpl(dataSource);
        List<Auto> autos = autoDao.findAll();

        autos.forEach(System.out::println);

        System.out.println("--------------------------");

        List<User> users1 = usersDao.findAllWithAuto();

        users1.forEach(System.out::println);
    }
}
