package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
public class MieszkaniecDAO {
        public MieszkaniecDAO(JdbcTemplate jdbcTemplate) {
            super();
            this.jdbcTemplate = jdbcTemplate;
        }

        /* Import org.springframework.jd....Template */
        private JdbcTemplate jdbcTemplate;

        /* Import java.util.List */
        public List<Mieszkaniec> list() {
            return null;
        }

        /* Insert – wstawianie nowego wiersza do bazy */
        public void save(Mieszkaniec mieszkaniec) {
        }

        /* Read – odczytywanie danych z bazy */
        public Mieszkaniec get(int nrMieszkanca) {
            return null;
        }

        /* Update – aktualizacja danych */
        public void update(Mieszkaniec mieszkaniec) {
        }

        /* Delete – wybrany rekord z danym id */
        public void delete(int nrMieszkanca) {
        }

    }




