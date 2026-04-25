package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

public class Podatki {
    private int nrPodatku;
    private float kwota;
    private String opis;
    private int nrNieruchomości;

    public Podatki(int nrPodatku, float kwota, String opis, int nrNieruchomości) {
        this.nrPodatku = nrPodatku;
        this.kwota = kwota;
        this.opis = opis;
        this.nrNieruchomości = nrNieruchomości;
    }

    public int getNrPodatku() {
        return nrPodatku;
    }

    public void setNrPodatku(int nrPodatku) {
        this.nrPodatku = nrPodatku;
    }

    public float getKwota() {
        return kwota;
    }

    public void setKwota(float kwota) {
        this.kwota = kwota;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getNrNieruchomości() {
        return nrNieruchomości;
    }

    public void setNrNieruchomości(int nrNieruchomości) {
        this.nrNieruchomości = nrNieruchomości;
    }

    @Override
    public String toString() {
        return "podatki{" +
                "nrPodatku=" + nrPodatku +
                ", kwota=" + kwota +
                ", opis='" + opis + '\'' +
                ", nrNieruchomości=" + nrNieruchomości +
                '}';
    }
}
