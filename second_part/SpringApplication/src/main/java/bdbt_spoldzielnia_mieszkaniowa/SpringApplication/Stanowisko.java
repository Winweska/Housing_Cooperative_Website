package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

public class Stanowisko {
    private int nrStanowiska;
    private String nazwaStanowiska;
    private String opis;

    public Stanowisko(int nrStanowiska, String nazwaStanowiska, String opis) {
        this.nrStanowiska = nrStanowiska;
        this.nazwaStanowiska = nazwaStanowiska;
        this.opis = opis;
    }

    public int getNrStanowiska() {
        return nrStanowiska;
    }

    public void setNrStanowiska(int nrStanowiska) {
        this.nrStanowiska = nrStanowiska;
    }

    public String getNazwaStanowiska() {
        return nazwaStanowiska;
    }

    public void setNazwaStanowiska(String nazwaStanowiska) {
        this.nazwaStanowiska = nazwaStanowiska;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "stanowiska{" +
                "nrStanowiska=" + nrStanowiska +
                ", nazwaStanowiska='" + nazwaStanowiska + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
