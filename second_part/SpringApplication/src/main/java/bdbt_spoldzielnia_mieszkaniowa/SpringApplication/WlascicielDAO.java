package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class WlascicielDAO {
    public WlascicielDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;

    /* Import java.util.List */
    public List<Wlasciciel> list() {
        return null;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Wlasciciel wlasciciel) {
    }

    /* Read – odczytywanie danych z bazy */
    public Wlasciciel get(int nrWlasciciela) {
        return null;
    }

    /* Update – aktualizacja danych */
    public void update(Wlasciciel wlasciciel) {
    }

    /* Delete – wybrany rekord z danym id */
    public void delete(int nrWlasciciela) {
    }




}
