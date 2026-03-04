package Objektuak;

import Objektuak.Erabiltzaileak.Erabiltzailea;

public class Pet {
    private Erabiltzailea jabea;
    private Espeziea espeziea;
    public Pet(Erabiltzailea jabea, Espeziea espeziea) {
        this.jabea = jabea;
        this.espeziea = espeziea;
    }
    public Erabiltzailea getJabea() {
        return jabea;
    }

    public Espeziea getEspeziea() {
        return espeziea;
    }

    public void setJabea(Erabiltzailea jabea) {
        this.jabea = jabea;
    }

}
