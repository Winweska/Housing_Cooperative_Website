package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


public class CzynszDAO {
    public CzynszDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;
    /* Import java.util.List */
    public List<Czynsz> list(){
        return null;
    }
    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Czynsz czynsz) {
    }
    /* Read – odczytywanie danych z bazy */
    public Czynsz get(int nrCzynszu) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(Czynsz czynsz) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int nrCzynczu) {
    }

}



