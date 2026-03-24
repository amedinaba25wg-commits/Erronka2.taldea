package Objektuak;

public class GenusTaxonomy {
    private String generoa;
    private String familia;
    private String ordena;
    private String klasea;
    private String filoa;

    public GenusTaxonomy(String generoa, String familia, String ordena, String klasea, String filoa) {
        this.generoa = generoa;
        this.familia = familia;
        this.ordena = ordena;
        this.klasea = klasea;
        this.filoa = filoa;
    }

    //Generate
    public String getGeneroa() {
        return generoa;
    }
    public String getFamilia() {
        return familia;
    }
    public String getOrdena() {
        return ordena;
    }
    public String getKlasea() {
        return klasea;
    }
    public String getFiloa() {
        return filoa;
    }
    //Setter
    public void setGeneroa(String generoa) {
        this.generoa = generoa;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
    }
    public void setOrdena(String ordena) {
        this.ordena = ordena;
    }
    public void setKlasea(String klasea) {
        this.klasea = klasea;
    }
    public void setFiloa(String filoa) {
        this.filoa = filoa;
    }
}
