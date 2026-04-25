package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

public class SpoldzielnieMieszkaniowe {
    private int nr_spoldzielni_mieszkaniowej;
    private String nazwa;
    private Date data_zalozenia;
    private int nr_adresu;

    public SpoldzielnieMieszkaniowe(){}

    public SpoldzielnieMieszkaniowe(int NR_SPOLDZIELNI_MIESZKANIOWEJ, String NAZWA, Date DATA_ZALOZENIA, int NR_ADRESU) {
        this.nr_spoldzielni_mieszkaniowej = NR_SPOLDZIELNI_MIESZKANIOWEJ;
        this.nazwa = NAZWA;
        this.data_zalozenia = DATA_ZALOZENIA;
        this.nr_adresu = NR_ADRESU;
    }


    //getters and setters


    public int getNr_spoldzielni_mieszkaniowej() {
        return nr_spoldzielni_mieszkaniowej;
    }

    public void setNr_spoldzielni_mieszkaniowej(int nr_spoldzielni_mieszkaniowej) {
        this.nr_spoldzielni_mieszkaniowej = nr_spoldzielni_mieszkaniowej;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getData_zalozenia() {
        return data_zalozenia;
    }

    public void setData_zalozenia(Date data_zalozenia) {
        this.data_zalozenia = data_zalozenia;
    }

    public int getNr_adresu() {
        return nr_adresu;
    }

    public void setNr_adresu(int nr_adresu) {
        this.nr_adresu = nr_adresu;
    }

    @Override
    public String toString() {
        return "Spoldzielnia_mieszkaniowa{" +
                "numerSpoldzielniMieszkaniowej=" + nr_spoldzielni_mieszkaniowej +
                ", nazwaSpoldzielni='" + nazwa + '\'' +
                ", dataZalozenia='" + data_zalozenia + '\'' +
                ", numerAdresu='" + nr_adresu + '\'' +
                '}';
    }




}
