package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

public class ZrodloEnergii {
    private int zrodloEnergii;
    private String nazwa;
    private String opis;

    public ZrodloEnergii(int zrodloEnergii, String nazwa, String opis) {
        super();
        this.zrodloEnergii = zrodloEnergii;
        this.nazwa = nazwa;
        this.opis = opis;
    }

    public int getZrodloEnergii() {
        return zrodloEnergii;
    }

    public void setZrodloEnergii(int zrodloEnergii) {
        this.zrodloEnergii = zrodloEnergii;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "zrodloEnergii{" +
                "zrodloEnergii=" + zrodloEnergii +
                ", nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
