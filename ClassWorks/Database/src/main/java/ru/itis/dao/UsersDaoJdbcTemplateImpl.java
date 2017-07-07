package ru.itis.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import ru.itis.models.Auto;
import ru.itis.models.User;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersDaoJdbcTemplateImpl implements UsersDao {

    //language=SQL
    private final static String SQL_SELECT_ALL_USERS =
            "SELECT * FROM human";
    //language=SQL
    private final static String SQL_SELECT_ALL_USERS_BY_AGE =
            "SELECT * FROM human WHERE age = ?";

    //language=SQL
    private final static String SQL_UPDATE_USER =
            "UPDATE human SET name = ?, age = ?, height = ? WHERE id = ?";

    //language=SQL
    private final static String SQL_SELECT_BY_ID =
            "SELECT * FROM human WHERE id = ?";

    //language=SQL
    private final static String SQL_SELECT_ALL_WITH_AUTO =
            "SELECT h.id as h_id, h.name, h.age, h.height, a.id as a_id, a.model, a.color " +
                    "FROM human h " +
                    "LEFT JOIN auto a on a.owner_id = h.id ";

    private Map<User, List<Auto>> userAutoMap = new HashMap<User, List<Auto>>();

    private JdbcTemplate template;

    public UsersDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    public boolean isExistById(int userId) {
        return false;
    }

    public List<User> findByName(String name) {
        return null;
    }

    public List<User> findByAge(int age) {
        return null;
    }

    public int save(User model) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(template);
        jdbcInsert.withTableName("human").usingGeneratedKeyColumns("id");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", model.getName());
        params.put("age", model.getAge());
        params.put("height", model.getHeight());
        int id = jdbcInsert.executeAndReturnKey(params).intValue();
        model.setId(id);
        return id;
    }

    public User find(int id) {
        return template.queryForObject(SQL_SELECT_BY_ID, userRowMapper, id);
    }

    public void update(User model) {
        template.update(SQL_UPDATE_USER, model.getName(), model.getHeight(), model.getAge(), model.getId());
    }

    public void delete(int id) {
    }

    private RowMapper<User> userRowMapper = (resultSet, i) -> {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int age = resultSet.getInt("age");
        int height = resultSet.getInt("height");
        return new User(id, name, age, height);
    };

    private RowMapper<Void> userRowMapper2 = (resultSet, i) -> {
        int id = resultSet.getInt("h_id");
        String name = resultSet.getString("name");
        int age = resultSet.getInt("age");
        int height = resultSet.getInt("height");
        User user = new User(id, name, age, height);

        if (!userAutoMap.containsKey(user)) {
            userAutoMap.put(user, new ArrayList<Auto>());
        }

        int autoId = resultSet.getInt("a_id");
        if (autoId != 0) {
            Auto auto = new Auto(autoId,
                    resultSet.getString("model"),
                    resultSet.getString("color"),
                    id);
            userAutoMap.get(user).add(auto);
        }
        return null;
    };

    public List<User> findAll() {
        return template.query(SQL_SELECT_ALL_USERS, userRowMapper);
    }

    public List<User> findAllWithAuto() {
        template.query(SQL_SELECT_ALL_WITH_AUTO, userRowMapper2);
        List<User> users = new ArrayList<User>();
        for (Map.Entry<User, List<Auto>> pair : userAutoMap.entrySet()) {
            User user = pair.getKey();
            user.setAutoList(pair.getValue());
            users.add(user);
        }
        return users;
    }
}
