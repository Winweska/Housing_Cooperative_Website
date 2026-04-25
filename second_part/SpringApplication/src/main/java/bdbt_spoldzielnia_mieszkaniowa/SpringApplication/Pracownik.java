package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import javax.print.attribute.standard.MediaSize;
import javax.validation.constraints.*;
import java.util.Date;

public class Pracownik {
    private int nrPracownika;
    @NotNull
    @Size(min=1,max=11,message = "Imię nie może być dłuższe niż 10 liter")
    private String imie;
    @NotNull
    @Size(min=1,max=15,message = "Nazwisko nie może być dłuższe niż 15 liter")
    private String nazwisko;
    @NotNull
    @Size(min = 10, max = 11, message="Podaj prawidłowy numer PESEL")
    private String pesel;
    @NotNull
    @Size(min=9,max = 10, message="Możesz wpisać tylko polski numer telefonu")
    private String nrTelefonu;
    @Email(message="Podaj poprawny adres e-mail")
    private String email;
    @NotNull
    @Past(message = "A więc sugerujesz, że przybywasz z przyszłości?")
    private Date dataUrodzenia;
    private int nrSpoldzielniMieszkaniowej=81;
    @NotNull
    @Min(value = 44,message ="Wszystkie dostępne numery adresów znajdują się w przedziale 44-50")
    @Max(value = 50,message ="Wszystkie dostępne numery adresów znajdują się w przedziale 44-50")
    private int nrAdresu;
    @NotNull
    @Min(value = 1,message ="Wszystkie dostępne numery adresów znajdują się w przedziale 1-10")
    @Max(value = 10,message ="Wszystkie dostępne numery adresów znajdują się w przedziale 1-10")
    private int nrStanowiska;

    public Pracownik(){}

    public Pracownik(int NR_PRACOWNIKA, String IMIE, String NAZWISKO, String PESEL, String NR_TELEFONU, String EMAIL, Date DATA_URODZENIA, int NR_SPOLDZIELNI_MIESZKANIOWEJ, int NR_ADRESU, int NR_STANOWISKA) {
        super();
        this.nrPracownika = NR_PRACOWNIKA;
        this.imie = IMIE;
        this.nazwisko = NAZWISKO;
        this.pesel = PESEL;
        this.nrTelefonu = NR_TELEFONU;
        this.email = EMAIL;
        this.dataUrodzenia = DATA_URODZENIA;
        this.nrSpoldzielniMieszkaniowej = NR_SPOLDZIELNI_MIESZKANIOWEJ;
        this.nrAdresu = NR_ADRESU;
        this.nrStanowiska = NR_STANOWISKA;
    }

    public int getNrPracownika() {
        return nrPracownika;
    }

    public void setNrPracownika(int nrPracownika) {
        this.nrPracownika = nrPracownika;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public String getEmail() {return email;}

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public int getNrSpoldzielniMieszkaniowej() {
        return nrSpoldzielniMieszkaniowej;
    }

    public void setNrSpoldzielniMieszkaniowej(int nrSpoldzielniMieszkaniowej) {
        this.nrSpoldzielniMieszkaniowej = nrSpoldzielniMieszkaniowej;
    }

    public int getNrAdresu() {
        return nrAdresu;
    }

    public void setNrAdresu(int nrAdresu) {
        this.nrAdresu = nrAdresu;
    }

    public int getNrStanowiska() {
        return nrStanowiska;
    }

    public void setNrStanowiska(int nrStanowiska) {
        this.nrStanowiska = nrStanowiska;
    }

    @Override
    public String toString() {
        return "pracownicy{" +
                "nrPracownika=" + nrPracownika +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                ", email='" + email + '\'' +
                ", dataUrodzenia='" + dataUrodzenia + '\'' +
                ", nrSpoldzielniMieszkaniowej=" + nrSpoldzielniMieszkaniowej +
                ", nrAdresu=" + nrAdresu +
                ", nrStanowiska=" + nrStanowiska +
                '}';
    }
}
