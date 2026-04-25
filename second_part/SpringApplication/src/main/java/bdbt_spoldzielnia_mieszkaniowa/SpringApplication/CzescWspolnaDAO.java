package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CzescWspolnaDAO {
    public CzescWspolnaDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;
    /* Import java.util.List */
    public List<CzescWspolna> list(){
        return null;
    }
    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(CzescWspolna czesciWspolne) {
    }
    /* Read – odczytywanie danych z bazy */
    public CzescWspolna get(int nrCzesciWspolnej) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(CzescWspolna czescWspolna) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int nrCzesciWspolnej) {
    }


}
