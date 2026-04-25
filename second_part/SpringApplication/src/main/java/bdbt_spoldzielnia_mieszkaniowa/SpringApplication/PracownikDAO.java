package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PracownikDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public PracownikDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Pracownik> list() {
        String sql = "SELECT * FROM PRACOWNIK";
        var resp= jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Pracownik.class));
        return resp;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Pracownik pracownik) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("PRACOWNIK").usingColumns("NR_PRACOWNIKA", "IMIE", "NAZWISKO","PESEL","NR_TELEFONU","EMAIL","DATA_URODZENIA","NR_SPOLDZIELNI_MIESZKANIOWEJ","NR_ADRESU","NR_STANOWISKA");
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownik);
        System.out.println(param);
        insertActor.execute(param);
    }

    /* Read – odczytywanie danych z bazy */
    public Pracownik get(int nrPracownika) {
        String sql = "SELECT * FROM PRACOWNIK WHERE NR_PRACOWNIKA = ?";
        Object[] args = {nrPracownika};
        Pracownik pracownik = jdbcTemplate.queryForObject(sql, args,
                BeanPropertyRowMapper.newInstance(Pracownik.class));
        return pracownik;
    }

    /* Update – aktualizacja danych */
    public void update(Pracownik pracownik) {
        String sql = "UPDATE PRACOWNIK SET IMIE=:imie, NAZWISKO=:nazwisko,PESEL=:pesel,NR_TELEFONU=:nrTelefonu,EMAIL=:email,DATA_URODZENIA=:dataUrodzenia,NR_SPOLDZIELNI_MIESZKANIOWEJ=:nrSpoldzielniMieszkaniowej,NR_ADRESU=:nrAdresu,NR_STANOWISKA=:nrStanowiska WHERE NR_PRACOWNIKA=:nrPracownika";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownik);

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
        template.update(sql, param);
    }

    /* Delete – wybrany rekord z danym id */
    public void delete(int nrPracownika) {
        String sql = "DELETE FROM PRACOWNIK WHERE NR_PRACOWNIKA= ?";
        jdbcTemplate.update(sql, nrPracownika);
    }


}
