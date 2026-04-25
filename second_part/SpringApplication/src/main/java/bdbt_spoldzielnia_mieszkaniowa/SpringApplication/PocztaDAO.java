package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PocztaDAO {
    public PocztaDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;

    /* Import java.util.List */
    public List<Poczta> list() {
        return null;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Poczta poczta) {
    }

    /* Read – odczytywanie danych z bazy */
    public Poczta get(int nrPoczty) {
        return null;
    }

    /* Update – aktualizacja danych */
    public void update(Poczta poczta) {
    }

    /* Delete – wybrany rekord z danym id */
    public void delete(int nrPoczty) {
    }


}
