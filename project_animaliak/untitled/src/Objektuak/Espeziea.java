package Objektuak;

public class Espeziea {
    private String izenZientifikoa;
    private String izenArrunta;
    private int biziIraupena;
    private String dietType;
    private String domesticationStatus;
    private String genus;
    private String wildStatus;
    private String habitat;
    private String scientist;

    public Espeziea(String izenZientifikoa, String genus, String scientist) {
        this.izenZientifikoa = izenZientifikoa;
        this.genus = genus;
        this.scientist = scientist;
    }

    public String getIzenZientifikoa() {
        return izenZientifikoa;
    }

    public String getIzenArrunta() {
        return izenArrunta;
    }

    public int getBiziIraupena() {
        return biziIraupena;
    }

    public String getDietType() {
        return dietType;
    }

    public String getDomesticationStatus() {
        return domesticationStatus;
    }

    public String getGenus() {
        return genus;
    }

    public String getWildStatus() {
        return wildStatus;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getScientist() {
        return scientist;
    }

    public void setIzenZientifikoa(String izenZientifikoa) {
        this.izenZientifikoa = izenZientifikoa;
    }

    public void setIzenArrunta(String izenArrunta) {
        this.izenArrunta = izenArrunta;
    }

    public void setBiziIraupena(int biziIraupena) {
        this.biziIraupena = biziIraupena;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public void setDomesticationStatus(String domesticationStatus) {
        this.domesticationStatus = domesticationStatus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public void setWildStatus(String wildStatus) {
        this.wildStatus = wildStatus;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setScientist(String scientist) {
        this.scientist = scientist;
    }
}
