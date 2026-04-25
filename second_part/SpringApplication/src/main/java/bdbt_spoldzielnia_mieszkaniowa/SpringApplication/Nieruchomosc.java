package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

public class Nieruchomosc {
    private int nrNieruchmosci;
    private int liczbaPieter;
    private float pCalkowita;
    private float pUzytkowa;
    private String DataWybudowania;
    private char kanalizacja;
    private int podatek;
    private char hipoteka;
    private int nrSpoldzielniMieszkaniowej;
    private int nrMieszkanca;
    private int nrAdresu;
    private int idZrodlaEnergii;

    public int getNrNieruchmosci() {
        return nrNieruchmosci;
    }

    public void setNrNieruchmosci(int nrNieruchmosci) {
        this.nrNieruchmosci = nrNieruchmosci;
    }

    public int getLiczbaPieter() {
        return liczbaPieter;
    }

    public void setLiczbaPieter(int liczbaPieter) {
        this.liczbaPieter = liczbaPieter;
    }

    public float getpCalkowita() {
        return pCalkowita;
    }

    public void setpCalkowita(float pCalkowita) {
        this.pCalkowita = pCalkowita;
    }

    public float getpUzytkowa() {
        return pUzytkowa;
    }

    public void setpUzytkowa(float pUzytkowa) {
        this.pUzytkowa = pUzytkowa;
    }

    public String getDataWybudowania() {
        return DataWybudowania;
    }

    public void setDataWybudowania(String dataWybudowania) {
        DataWybudowania = dataWybudowania;
    }

    public char getKanalizacja() {
        return kanalizacja;
    }

    public void setKanalizacja(char kanalizacja) {
        this.kanalizacja = kanalizacja;
    }

    public int getPodatek() {
        return podatek;
    }

    public void setPodatek(int podatek) {
        this.podatek = podatek;
    }

    public char getHipoteka() {
        return hipoteka;
    }

    public void setHipoteka(char hipoteka) {
        this.hipoteka = hipoteka;
    }

    public int getNrSpoldzielniMieszkaniowej() {
        return nrSpoldzielniMieszkaniowej;
    }

    public void setNrSpoldzielniMieszkaniowej(int nrSpoldzielniMieszkaniowej) {
        this.nrSpoldzielniMieszkaniowej = nrSpoldzielniMieszkaniowej;
    }

    public int getNrMieszkanca() {
        return nrMieszkanca;
    }

    public void setNrMieszkanca(int nrMieszkanca) {
        this.nrMieszkanca = nrMieszkanca;
    }

    public int getNrAdresu() {
        return nrAdresu;
    }

    public void setNrAdresu(int nrAdresu) {
        this.nrAdresu = nrAdresu;
    }

    public int getIdZrodlaEnergii() {
        return idZrodlaEnergii;
    }

    public void setIdZrodlaEnergii(int idZrodlaEnergii) {
        this.idZrodlaEnergii = idZrodlaEnergii;
    }

    public Nieruchomosc(int nrNieruchmosci, int liczbaPieter, float pCalkowita, float pUzytkowa, String dataWybudowania, char kanalizacja, int podatek, char hipoteka, int nrSpoldzielniMieszkaniowej, int nrMieszkanca, int nrAdresu, int idZrodlaEnergii) {
        super();
        this.nrNieruchmosci = nrNieruchmosci;
        this.liczbaPieter = liczbaPieter;
        this.pCalkowita = pCalkowita;
        this.pUzytkowa = pUzytkowa;
        DataWybudowania = dataWybudowania;
        this.kanalizacja = kanalizacja;
        this.podatek = podatek;
        this.hipoteka = hipoteka;
        this.nrSpoldzielniMieszkaniowej = nrSpoldzielniMieszkaniowej;
        this.nrMieszkanca = nrMieszkanca;
        this.nrAdresu = nrAdresu;
        this.idZrodlaEnergii = idZrodlaEnergii;
    }

    @Override
    public String toString() {
        return "nieruchomosci{" +
                "nrNieruchmosci=" + nrNieruchmosci +
                ", liczbaPieter=" + liczbaPieter +
                ", pCalkowita=" + pCalkowita +
                ", pUzytkowa=" + pUzytkowa +
                ", DataWybudowania='" + DataWybudowania + '\'' +
                ", kanalizacja=" + kanalizacja +
                ", podatek=" + podatek +
                ", hipoteka=" + hipoteka +
                ", nrSpoldzielniMieszkaniowej=" + nrSpoldzielniMieszkaniowej +
                ", nrMieszkanca=" + nrMieszkanca +
                ", nrAdresu=" + nrAdresu +
                ", idZrodlaEnergii=" + idZrodlaEnergii +
                '}';
    }
}
