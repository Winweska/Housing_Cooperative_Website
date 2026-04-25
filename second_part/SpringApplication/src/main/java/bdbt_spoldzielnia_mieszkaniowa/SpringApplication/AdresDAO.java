package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class AdresDAO {
    public AdresDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;
    /* Import java.util.List */
    public List<Adres> list(){
        return null;
    }
    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Adres adres) {
    }
    /* Read – odczytywanie danych z bazy */
    public Adres get(int nrAdresu) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(Adres adres) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int nrAdresu) {
    }

}
