package Objektuak;

public class Espeziea {
    private String izenZientifikoa;
    private String izenArrunta;
    private int biziIraupena;
    private String dietType;
    private String domesticationStatuts;
    private String genus;
    private String wildStatus;
    private String habitat;
    private String scientist;

    public Espeziea(String izenZientifikoa) {
        this.izenZientifikoa = izenZientifikoa;
    }

    public Espeziea(String izenZientifikoa, String izenArrunta, int biziIraupena, String dietType, String domesticationStatuts, String genus, String wildStatus, String habitat, String scientist) {
        this.izenZientifikoa = izenZientifikoa;
        this.izenArrunta = izenArrunta;
        this.biziIraupena = biziIraupena;
        this.dietType = dietType;
        this.domesticationStatuts = domesticationStatuts;
        this.genus = genus;
        this.wildStatus = wildStatus;
        this.habitat = habitat;
        this.scientist = scientist;
    }

    //Getter

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

    public String getDomesticationStatuts() {
        return domesticationStatuts;
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

    //setter

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

    public void setDomesticationStatuts(String domesticationStatuts) {
        this.domesticationStatuts = domesticationStatuts;
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
