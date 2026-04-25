package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ZrodloEnergiiDAO {
    public ZrodloEnergiiDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;

    /* Import java.util.List */
    public List<ZrodloEnergii> list() {
        return null;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(ZrodloEnergii zrodloEnergii) {
    }

    /* Read – odczytywanie danych z bazy */
    public ZrodloEnergii get(int zrodloEnergii) {
        return null;
    }

    /* Update – aktualizacja danych */
    public void update(ZrodloEnergii zrodloEnergii) {
    }

    /* Delete – wybrany rekord z danym id */
    public void delete(int zrodloEnergii) {
    }
}
