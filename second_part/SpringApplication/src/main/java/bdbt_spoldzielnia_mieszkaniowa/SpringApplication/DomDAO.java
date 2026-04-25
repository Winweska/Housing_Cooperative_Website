package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class DomDAO {
    public DomDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;
    /* Import java.util.List */
    public List<Dom> list(){
        return null;
    }
    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Dom dom) {
    }
    /* Read – odczytywanie danych z bazy */
    public Dom get(int nrNieruchomosci) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(Dom dom) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int nrNieruchomosci) {
    }


}
