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

}
