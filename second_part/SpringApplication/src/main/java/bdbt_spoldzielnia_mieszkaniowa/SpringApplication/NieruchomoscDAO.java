package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class NieruchomoscDAO {
    public NieruchomoscDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;

    /* Import java.util.List */
    public List<Nieruchomosc> list() {
        return null;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Nieruchomosc nieruchomosc) {
    }

    /* Read – odczytywanie danych z bazy */
    public Nieruchomosc get(int nrNieruchomosci) {
        return null;
    }

    /* Update – aktualizacja danych */
    public void update(Nieruchomosc nieruchomosc) {
    }

    /* Delete – wybrany rekord z danym id */
    public void delete(int nrNieruchomosci) {
    }

}






