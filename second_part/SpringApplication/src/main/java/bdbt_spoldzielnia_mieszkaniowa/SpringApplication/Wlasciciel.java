package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

public class Wlasciciel {
   private int nrWlasciciela;
   private String imie;
   private String nazwisko;
   private int nrNieruchomosci;
   private int nrSpoldzielniMieszkaniowej;

    public int getNrWlasciciela() {
        return nrWlasciciela;
    }

    public void setNrWlasciciela(int nrWlasciciela) {
        this.nrWlasciciela = nrWlasciciela;
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

    public int getNrNieruchomosci() {
        return nrNieruchomosci;
    }

    public void setNrNieruchomosci(int nrNieruchomosci) {
        this.nrNieruchomosci = nrNieruchomosci;
    }

    public int getNrSpoldzielniMieszkaniowej() {
        return nrSpoldzielniMieszkaniowej;
    }

    public void setNrSpoldzielniMieszkaniowej(int nrSpoldzielniMieszkaniowej) {
        this.nrSpoldzielniMieszkaniowej = nrSpoldzielniMieszkaniowej;
    }

    @Override
    public String toString() {
        return "wlasciciele{" +
                "nrWlasciciela=" + nrWlasciciela +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrNieruchomosci=" + nrNieruchomosci +
                ", nrSpoldzielniMieszkaniowej=" + nrSpoldzielniMieszkaniowej +
                '}';
    }

    public Wlasciciel(int nrWlasciciela, String imie, String nazwisko, int nrNieruchomosci, int nrSpoldzielniMieszkaniowej) {
        super();
        this.nrWlasciciela = nrWlasciciela;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrNieruchomosci = nrNieruchomosci;
        this.nrSpoldzielniMieszkaniowej = nrSpoldzielniMieszkaniowej;
    }
}
