package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import java.util.List;

import org.apache.catalina.valves.JDBCAccessLogValve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class SpoldzielnieMieszkanioweDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public SpoldzielnieMieszkanioweDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    //Reading data from the database
    public List<SpoldzielnieMieszkaniowe> list() {
        String sql = "SELECT * FROM SPOLDZIELNIE_MIESZKANIOWE";
        var resp = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(SpoldzielnieMieszkaniowe.class));
        return resp;
    }

    //Inserting data from the database
    public void save(SpoldzielnieMieszkaniowe spoldzielnieMieszkaniowe) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("SPOLDZIELNIE_MIESZKANIOWE").usingColumns("NR_SPOLDZIELNI_MIESZKANIOWEJ", "NAZWA", "DATA_ZALOZENIA","NR_ADRESU");
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(spoldzielnieMieszkaniowe);
        System.out.println(param);
        insertActor.execute(param);
    }

    //Reading data from the database - based on primary key (nr_spoldzielni_mieszkaniowej)
    public SpoldzielnieMieszkaniowe get(int nr_spoldzielni_mieszkaniowej) {
        String sql = "SELECT * FROM SPOLDZIELNIE_MIESZKANIOWE WHERE NR_SPOLDZIELNI_MIESZKANIOWEJ = ?";
        Object[] args = {nr_spoldzielni_mieszkaniowej};
        SpoldzielnieMieszkaniowe spoldzielnieMieszkaniowe = jdbcTemplate.queryForObject(sql, args,
                BeanPropertyRowMapper.newInstance(SpoldzielnieMieszkaniowe.class));
        return spoldzielnieMieszkaniowe;
    }
    /*
    public SpoldzielnieMieszkaniowe get1(int nr_spoldzielni_mieszkaniowej){
        Object[] args= {nr_spoldzielni_mieszkaniowej};
        String sql = "SELECT * FROM SPOLDZIELNIE_MIESZKANIOWE WHERE NR_SPOLDZIELNI_MIESZKANIOWEJ = " + args[0];
        SpoldzielnieMieszkaniowe spoldzielnieMieszkaniowe= jdbcTemplate.queryForObject(sql, args,
                BeanPropertyRowMapper.newInstance(SpoldzielnieMieszkaniowe.class));
        return spoldzielnieMieszkaniowe;
    }
    */


    //Updating data in the database
    public void update(SpoldzielnieMieszkaniowe spoldzielniaMieszkaniowa) {
            String sql = "UPDATE SPOLDZIELNIE_MIESZKANIOWE SET NAZWA=:nazwa, DATA_ZALOZENIA=:data_zalozenia,NR_ADRESU=:nr_adresu WHERE NR_SPOLDZIELNI_MIESZKANIOWEJ=:nr_spoldzielni_mieszkaniowej";
            BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(spoldzielniaMieszkaniowa);

            NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
            template.update(sql, param);
        }


    //Deleting record from the database
    public void delete(int numerSpoldzielniMieszkaniowej ) {
        String sql = "DELETE FROM SPOLDZIELNIE_MIESZKANIOWE WHERE NR_SPOLDZIELNI_MIESZKANIOWEJ = ?";
        jdbcTemplate.update(sql, numerSpoldzielniMieszkaniowej);
    }


}
