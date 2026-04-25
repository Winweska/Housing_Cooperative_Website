package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

public class Adres {
    private int nrAdresu;
    private int nrLokalu;
    private String ulica;
    private String miasto;
    private int nrPoczty;

    public Adres(int nrAdresu, int nrLokalu, String ulica, String miasto, int nrPoczty) {
        super();
        this.nrAdresu = nrAdresu;
        this.nrLokalu = nrLokalu;
        this.ulica = ulica;
        this.miasto = miasto;
        this.nrPoczty = nrPoczty;
    }

    public int getNrAdresu() {
        return nrAdresu;
    }

    public void setNrAdresu(int nrAdresu) {
        this.nrAdresu = nrAdresu;
    }

    public int getNrLokalu() {
        return nrLokalu;
    }

    public void setNrLokalu(int nrLokalu) {
        this.nrLokalu = nrLokalu;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public int getNrPoczty() {
        return nrPoczty;
    }

    public void setNrPoczty(int nrPoczty) {
        this.nrPoczty = nrPoczty;
    }

    @Override
    public String toString() {
        return "adresy{" +
                "nrAdresu=" + nrAdresu +
                ", nrLokalu=" + nrLokalu +
                ", ulica='" + ulica + '\'' +
                ", miasto='" + miasto + '\'' +
                ", nrPoczty=" + nrPoczty +
                '}';
    }
}
