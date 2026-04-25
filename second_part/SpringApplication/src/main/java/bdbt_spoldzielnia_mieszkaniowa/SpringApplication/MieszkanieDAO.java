package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
public class MieszkanieDAO {
    public MieszkanieDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;

    /* Import java.util.List */
    public List<Mieszkanie> list() {
        return null;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Mieszkanie mieszkanie) {
    }

    /* Read – odczytywanie danych z bazy */
    public Mieszkanie get(int nrMieszkania) {
        return null;
    }

    /* Update – aktualizacja danych */
    public void update(Mieszkanie mieszkanie) {
    }

    /* Delete – wybrany rekord z danym id */
    public void delete(int nrMieszkania) {
    }

}









