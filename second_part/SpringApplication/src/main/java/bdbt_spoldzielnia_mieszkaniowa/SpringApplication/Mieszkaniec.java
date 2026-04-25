package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

public class Mieszkaniec {
    private int nrMieszkanca;
    private String imie;
    private String nazwisko;
    private String PESEL;
    private String nrTelefonu;
    private String Email;
    private String dataUrodzenia;
    private boolean miejsceParkingowe;
    private int nrSpoldzielniMieszkaniowej;
    private int nrAdresu;

    public Mieszkaniec(int nrMieszkanca, String imie, String nazwisko, String PESEL, String nrTelefonu, String email, String dataUrodzenia, boolean miejsceParkingowe, int nrSpoldzielniMieszkaniowej, int nrAdresu) {
        super();
        this.nrMieszkanca = nrMieszkanca;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
        this.nrTelefonu = nrTelefonu;
        Email = email;
        this.dataUrodzenia = dataUrodzenia;
        this.miejsceParkingowe = miejsceParkingowe;
        this.nrSpoldzielniMieszkaniowej = nrSpoldzielniMieszkaniowej;
        this.nrAdresu = nrAdresu;
    }

    public int getNrMieszkanca() {
        return nrMieszkanca;
    }

    public void setNrMieszkanca(int nrMieszkanca) {
        this.nrMieszkanca = nrMieszkanca;
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

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public boolean isMiejsceParkingowe() {
        return miejsceParkingowe;
    }

    public void setMiejsceParkingowe(boolean miejsceParkingowe) {
        this.miejsceParkingowe = miejsceParkingowe;
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

    @Override
    public String toString() {
        return "mieszkancy{" +
                "nrMieszkanca=" + nrMieszkanca +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", PESEL='" + PESEL + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                ", Email='" + Email + '\'' +
                ", dataUrodzenia='" + dataUrodzenia + '\'' +
                ", miejsceParkingowe=" + miejsceParkingowe +
                ", nrSpoldzielniMieszkaniowej=" + nrSpoldzielniMieszkaniowej +
                ", nrAdresu=" + nrAdresu +
                '}';
    }
}
