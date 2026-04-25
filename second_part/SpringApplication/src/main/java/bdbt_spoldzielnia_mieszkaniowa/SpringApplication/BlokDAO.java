package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class BlokDAO {

    public BlokDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;
    /* Import java.util.List */
    public List<Blok> list(){
        return null;
    }
    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Blok blok) {
    }
    /* Read – odczytywanie danych z bazy */
    public Blok get(int nrNieruchomosci) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(Blok blok) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int nrNieruchomosci) {
    }

}
