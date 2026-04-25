package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

public class Wynagrodzenie {
    private int nrWynagrodzenia;
    private String dataWynagrodzenia;
    private float kwota;
    private float kwotaDot;
    private int nrPracownika;

    public Wynagrodzenie(int nrWynagrodzenia, String dataWynagrodzenia, float kwota, float kwotaDot, int nrPracownika) {
        super();
        this.nrWynagrodzenia = nrWynagrodzenia;
        this.dataWynagrodzenia = dataWynagrodzenia;
        this.kwota = kwota;
        this.kwotaDot = kwotaDot;
        this.nrPracownika = nrPracownika;
    }

    public int getNrWynagrodzenia() {
        return nrWynagrodzenia;
    }

    public void setNrWynagrodzenia(int nrWynagrodzenia) {
        this.nrWynagrodzenia = nrWynagrodzenia;
    }

    public String getDataWynagrodzenia() {
        return dataWynagrodzenia;
    }

    public void setDataWynagrodzenia(String dataWynagrodzenia) {
        this.dataWynagrodzenia = dataWynagrodzenia;
    }

    public float getKwota() {
        return kwota;
    }

    public void setKwota(float kwota) {
        this.kwota = kwota;
    }

    public float getKwotaDot() {
        return kwotaDot;
    }

    public void setKwotaDot(float kwotaDot) {
        this.kwotaDot = kwotaDot;
    }

    public int getNrPracownika() {
        return nrPracownika;
    }

    public void setNrPracownika(int nrPracownika) {
        this.nrPracownika = nrPracownika;
    }

    @Override
    public String toString() {
        return "wynagrodzenia{" +
                "nrWynagrodzenia=" + nrWynagrodzenia +
                ", dataWynagrodzenia='" + dataWynagrodzenia + '\'' +
                ", kwota=" + kwota +
                ", kwotaDot=" + kwotaDot +
                ", nrPracownika=" + nrPracownika +
                '}';
    }
}
