package Objektuak.Erabiltzaileak;
import Objektuak.Pet;

import java.util.ArrayList;
import java.util.List;

public class Bezeroa extends Erabiltzailea {
    private List<Pet> maskotak;
    public Bezeroa(int id_erabiltzailea) {
        super(id_erabiltzailea);
        maskotak = new ArrayList<Pet>();
    }

    public Bezeroa(int id_erabiltzailea, String username, String password_hash) {
        super(id_erabiltzailea, username, password_hash);
        maskotak = new ArrayList<Pet>();
    }

    public void ikusiBereAnimaliak() {

    }
    public void maskotaGehitu() {

    }
    public void maskotaKendu() {

    }
}
