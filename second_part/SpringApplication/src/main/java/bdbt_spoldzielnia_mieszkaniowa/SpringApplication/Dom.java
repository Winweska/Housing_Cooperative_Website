package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

public class Dom {
    private int nrNieruchomosci;
    private float pOgrodu;
    private int lPokoi;
    private int lOsob;

    public Dom(int nrNieruchomosci, float pOgrodu, int lPokoi, int lOsob) {
        super();
        this.nrNieruchomosci = nrNieruchomosci;
        this.pOgrodu = pOgrodu;
        this.lPokoi = lPokoi;
        this.lOsob = lOsob;
    }

    public int getNrNieruchomosci() {
        return nrNieruchomosci;
    }

    public void setNrNieruchomosci(int nrNieruchomosci) {
        this.nrNieruchomosci = nrNieruchomosci;
    }

    public float getpOgrodu() {
        return pOgrodu;
    }

    public void setpOgrodu(float pOgrodu) {
        this.pOgrodu = pOgrodu;
    }

    public int getlPokoi() {
        return lPokoi;
    }

    public void setlPokoi(int lPokoi) {
        this.lPokoi = lPokoi;
    }

    public int getlOsob() {
        return lOsob;
    }

    public void setlOsob(int lOsob) {
        this.lOsob = lOsob;
    }

    @Override
    public String toString() {
        return "domy{" +
                "nrNieruchomosci=" + nrNieruchomosci +
                ", pOgrodu=" + pOgrodu +
                ", lPokoi=" + lPokoi +
                ", lOsob=" + lOsob +
                '}';
    }
}
