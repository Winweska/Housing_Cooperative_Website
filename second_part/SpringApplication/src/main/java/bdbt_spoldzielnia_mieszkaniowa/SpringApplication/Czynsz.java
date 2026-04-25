package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

public class Czynsz {
    private int nrCzynszu;
    private float oplataZaMedia;
    private float kwota;
    private int nrMieszkanca;
    private int nrMieszkania;

    public Czynsz(int nrCzynszu, float oplataZaMedia, float kwota, int nrMieszkanca, int nrMieszkania) {
        super();
        this.nrCzynszu = nrCzynszu;
        this.oplataZaMedia = oplataZaMedia;
        this.kwota = kwota;
        this.nrMieszkanca = nrMieszkanca;
        this.nrMieszkania = nrMieszkania;
    }

    public int getNrCzynszu() {
        return nrCzynszu;
    }

    public void setNrCzynszu(int nrCzynszu) {
        this.nrCzynszu = nrCzynszu;
    }

    public float getOplataZaMedia() {
        return oplataZaMedia;
    }

    public void setOplataZaMedia(float oplataZaMedia) {
        this.oplataZaMedia = oplataZaMedia;
    }

    public float getKwota() {
        return kwota;
    }

    public void setKwota(float kwota) {
        this.kwota = kwota;
    }

    public int getNrMieszkanca() {
        return nrMieszkanca;
    }

    public void setNrMieszkanca(int nrMieszkanca) {
        this.nrMieszkanca = nrMieszkanca;
    }

    public int getNrMieszkania() {
        return nrMieszkania;
    }

    public void setNrMieszkania(int nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
    }

    @Override
    public String toString() {
        return "czynsze{" +
                "nrCzynszu=" + nrCzynszu +
                ", oplataZaMedia=" + oplataZaMedia +
                ", kwota=" + kwota +
                ", nrMieszkanca=" + nrMieszkanca +
                ", nrMieszkania=" + nrMieszkania +
                '}';
    }
}
