package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class WynagrodzenieDAO {

    public WynagrodzenieDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;

    /* Import java.util.List */
    public List<Wynagrodzenie> list() {
        return null;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Wynagrodzenie wynagrodzenie) {
    }

    /* Read – odczytywanie danych z bazy */
    public Wynagrodzenie get(int nrWynagrodzenia) {
        return null;
    }

    /* Update – aktualizacja danych */
    public void update(Wynagrodzenie wynagrodzenie) {
    }

    /* Delete – wybrany rekord z danym id */
    public void delete(int nrWynagrodzenia) {
    }








}
