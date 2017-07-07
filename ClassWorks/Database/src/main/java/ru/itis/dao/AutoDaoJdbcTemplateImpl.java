package ru.itis.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import ru.itis.models.Auto;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AutoDaoJdbcTemplateImpl implements AutoDao {
    //language=SQL
    private final static String SQL_SELECT_ALL_AUTOS =
            "SELECT * FROM auto";

    //language=SQL
    private final static String SQL_UPDATE_AUTO =
            "UPDATE auto SET model = ?, color = ?, owner_id = ? WHERE id = ?";

    //language=SQL
    private final static String SQL_SELECT_BY_ID =
            "SELECT * FROM auto WHERE id = ?";

    private JdbcTemplate template;

    public AutoDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    public int save(Auto model) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(template);
        jdbcInsert.withTableName("auto").usingGeneratedKeyColumns("id");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("model", model.getModel());
        params.put("color", model.getColor());
        params.put("owner_id", model.getOwner_id());
        int id = jdbcInsert.executeAndReturnKey(params).intValue();
        model.setId(id);
        return id;
    }

    public Auto find(int id) {
        return template.queryForObject(SQL_SELECT_BY_ID, autoRowMapper, id);
    }

    public void update(Auto model) {
        template.update(SQL_UPDATE_AUTO, model.getModel(), model.getColor(), model.getOwner_id(), model.getId());
    }

    public void delete(int id) {
    }

    private RowMapper<Auto> autoRowMapper = new RowMapper<Auto>() {
        public Auto mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Auto(
                resultSet.getInt("id"),
                    resultSet.getString("model"),
                    resultSet.getString("color"),
                    resultSet.getInt("owner_id")
            );
        }
    };

    public List<Auto> findAll() {
        return template.query(SQL_SELECT_ALL_AUTOS, autoRowMapper);
    }
}
