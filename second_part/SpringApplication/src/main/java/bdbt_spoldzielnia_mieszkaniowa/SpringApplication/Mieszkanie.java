package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

public class Mieszkanie {
    private int nrMieszkania;
    private int nrPietra;
    private int nrBloku;
    private boolean telewizja;
    private int miejscaParkingowe;
    private int nrMieszkanca;
    private int nrNieruchomosci;

    public Mieszkanie(int nrMieszkania, int nrPietra, int nrBloku, boolean telewizja, int miejscaParkingowe, int nrMieszkanca, int nrNieruchomosci) {
        super();
        this.nrMieszkania = nrMieszkania;
        this.nrPietra = nrPietra;
        this.nrBloku = nrBloku;
        this.telewizja = telewizja;
        this.miejscaParkingowe = miejscaParkingowe;
        this.nrMieszkanca = nrMieszkanca;
        this.nrNieruchomosci = nrNieruchomosci;
    }

    public int getNrMieszkania() {
        return nrMieszkania;
    }

    public void setNrMieszkania(int nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
    }

    public int getNrPietra() {
        return nrPietra;
    }

    public void setNrPietra(int nrPietra) {
        this.nrPietra = nrPietra;
    }

    public int getNrBloku() {
        return nrBloku;
    }

    public void setNrBloku(int nrBloku) {
        this.nrBloku = nrBloku;
    }

    public boolean isTelewizja() {
        return telewizja;
    }

    public void setTelewizja(boolean telewizja) {
        this.telewizja = telewizja;
    }

    public int getMiejscaParkingowe() {
        return miejscaParkingowe;
    }

    public void setMiejscaParkingowe(int miejscaParkingowe) {
        this.miejscaParkingowe = miejscaParkingowe;
    }

    public int getNrMieszkanca() {
        return nrMieszkanca;
    }

    public void setNrMieszkanca(int nrMieszkanca) {
        this.nrMieszkanca = nrMieszkanca;
    }

    public int getNrNieruchomosci() {
        return nrNieruchomosci;
    }

    public void setNrNieruchomosci(int nrNieruchomosci) {
        this.nrNieruchomosci = nrNieruchomosci;
    }

    @Override
    public String toString() {
        return "mieszkania{" +
                "nrMieszkania=" + nrMieszkania +
                ", nrPietra=" + nrPietra +
                ", nrBloku=" + nrBloku +
                ", telewizja=" + telewizja +
                ", miejscaParkingowe=" + miejscaParkingowe +
                ", nrMieszkanca=" + nrMieszkanca +
                ", nrNieruchomosci=" + nrNieruchomosci +
                '}';
    }
}
