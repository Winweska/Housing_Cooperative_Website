package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping
public class PodatkiDAO {
    @Autowired
    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public PodatkiDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import java.util.List */
    public List<Podatki> list() {

    String sql = "SELECT * FROM PODATKI";

    List<Podatki> listPodatki = jdbcTemplate.query(sql,
            BeanPropertyRowMapper.newInstance(Podatki.class));
        return listPodatki;
}



    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Podatki podatki) {
    }

    /* Read – odczytywanie danych z bazy */
    public Podatki get(int nrPodatku) {
        return null;
    }

    /* Update – aktualizacja danych */
    public void update(Podatki podatki) {
    }

    /* Delete – wybrany rekord z danym id */
    public void delete(int nrPodatku) {
    }

}
