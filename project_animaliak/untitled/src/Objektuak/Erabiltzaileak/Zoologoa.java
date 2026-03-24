package Objektuak.Erabiltzaileak;

import Objektuak.Espeziea;

import java.util.ArrayList;
import java.util.List;

public class Zoologoa extends Erabiltzailea {
    List<Espeziea> espezieak;

    Zoologoa(Erabiltzailea erabiltzailea) {
        super(erabiltzailea.getId_erabiltzailea(), erabiltzailea.getUsername(), erabiltzailea.getPassword_hash());

    }

    public Zoologoa(int id_erabiltzailea) {
        super(id_erabiltzailea);
        espezieak = new ArrayList<Espeziea>();
    }

    public Zoologoa(int id_erabiltzailea, String username, String password_hash) {
        super(id_erabiltzailea, username, password_hash);
        espezieak = new ArrayList<Espeziea>();
    }

    public void espezieaEzabatu(Espeziea espeziea) {

    }
    public void espezieaGehitu(Espeziea espeziea) {

    }

}
