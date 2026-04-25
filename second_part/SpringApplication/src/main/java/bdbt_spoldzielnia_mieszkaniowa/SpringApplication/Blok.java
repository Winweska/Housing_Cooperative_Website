package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

public class Blok {
    private int nrNieruchomosci;
    private int lMieszkan;
    private float powierzchniaCzesciWspolnej;
    private boolean winda;

    public Blok(int nrNieruchomosci, int lMieszkan, float powierzchniaCzesciWspolnej, boolean winda) {
        super();
        this.nrNieruchomosci = nrNieruchomosci;
        this.lMieszkan = lMieszkan;
        this.powierzchniaCzesciWspolnej = powierzchniaCzesciWspolnej;
        this.winda = winda;
    }

    public int getNrNieruchomosci() {
        return nrNieruchomosci;
    }

    public void setNrNieruchomosci(int nrNieruchomosci) {
        this.nrNieruchomosci = nrNieruchomosci;
    }

    public int getlMieszkan() {
        return lMieszkan;
    }

    public void setlMieszkan(int lMieszkan) {
        this.lMieszkan = lMieszkan;
    }

    public float getPowierzchniaCzesciWspolnej() {
        return powierzchniaCzesciWspolnej;
    }

    public void setPowierzchniaCzesciWspolnej(float powierzchniaCzesciWspolnej) {
        this.powierzchniaCzesciWspolnej = powierzchniaCzesciWspolnej;
    }

    public boolean isWinda() {
        return winda;
    }

    public void setWinda(boolean winda) {
        this.winda = winda;
    }

    @Override
    public String toString() {
        return "bloki{" +
                "nrNieruchomosci=" + nrNieruchomosci +
                ", lMieszkan=" + lMieszkan +
                ", powierzchniaCzesciWspolnej=" + powierzchniaCzesciWspolnej +
                ", winda=" + winda +
                '}';
    }
}
