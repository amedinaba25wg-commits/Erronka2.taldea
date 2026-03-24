package Objektuak;

import Objektuak.Erabiltzaileak.Erabiltzailea;

public class Pet {
    private Espeziea espeziea;
    private Erabiltzailea jabea;
    private String id;
    private String name;

    public Pet(Espeziea espeziea, String id) {
        this.espeziea = espeziea;
        this.id = id;
    }

    public void setJabea(Erabiltzailea jabea) {
        this.jabea = jabea;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEspeziea(Espeziea espeziea) {
        this.espeziea = espeziea;
    } //Berez espeziea sortzerakoan ezin da aldatu, baina erroreak egon ezkero aldatu daiteke
}
