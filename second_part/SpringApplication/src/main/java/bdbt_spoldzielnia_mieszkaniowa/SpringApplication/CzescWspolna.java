package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

public class CzescWspolna {
    private int nrCzesciWspolnej;
    private float powierzchnia;
    private boolean czyCzescWBudynku;
    private boolean czyDlaDzieci;
    private int nrSpoldzielniMieszkaniowej;
    private int nrAdresu;

    public CzescWspolna(int nrCzesciWspolnej, float powierzchnia, boolean czyCzescWBudynku, boolean czyDlaDzieci, int nrSpoldzielniMieszkaniowej, int nrAdresu) {
        super();
        this.nrCzesciWspolnej = nrCzesciWspolnej;
        this.powierzchnia = powierzchnia;
        this.czyCzescWBudynku = czyCzescWBudynku;
        this.czyDlaDzieci = czyDlaDzieci;
        this.nrSpoldzielniMieszkaniowej = nrSpoldzielniMieszkaniowej;
        this.nrAdresu = nrAdresu;
    }

    public int getNrCzesciWspolnej() {
        return nrCzesciWspolnej;
    }

    public void setNrCzesciWspolnej(int nrCzesciWspolnej) {
        this.nrCzesciWspolnej = nrCzesciWspolnej;
    }

    public float getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(float powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public boolean isCzyCzescWBudynku() {
        return czyCzescWBudynku;
    }

    public void setCzyCzescWBudynku(boolean czyCzescWBudynku) {
        this.czyCzescWBudynku = czyCzescWBudynku;
    }

    public boolean isCzyDlaDzieci() {
        return czyDlaDzieci;
    }

    public void setCzyDlaDzieci(boolean czyDlaDzieci) {
        this.czyDlaDzieci = czyDlaDzieci;
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
        return "czesciWspolne{" +
                "nrCzesciWspolnej=" + nrCzesciWspolnej +
                ", powierzchnia=" + powierzchnia +
                ", czyCzescWBudynku=" + czyCzescWBudynku +
                ", czyDlaDzieci=" + czyDlaDzieci +
                ", nrSpoldzielniMieszkaniowej=" + nrSpoldzielniMieszkaniowej +
                ", nrAdresu=" + nrAdresu +
                '}';
    }
}
