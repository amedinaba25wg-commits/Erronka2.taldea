package Objektuak;

import Objektuak.Erabiltzaileak.Erabiltzailea;

public class Pet extends Espeziea {
    private Espeziea espeziea;
    private Erabiltzailea jabea;
    public Pet(Erabiltzailea jabea, Espeziea espeziea) {
        this.jabea = jabea;
        this.espeziea = espeziea;
    }
}
