package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StanowiskoDAO {
    public StanowiskoDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;

    /* Import java.util.List */
    public List<Stanowisko> list() {
        return null;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Stanowisko stanowisko) {
    }

    /* Read – odczytywanie danych z bazy */
    public Stanowisko get(int nrStanowiska) {
        return null;
    }

    /* Update – aktualizacja danych */
    public void update(Stanowisko stanowisko) {
    }

    /* Delete – wybrany rekord z danym id */
    public void delete(int nrStanowiska) {
    }


}



