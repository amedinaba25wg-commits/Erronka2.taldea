package Objektuak.Erabiltzaileak;

import Objektuak.Espeziea;
import Objektuak.GenusTaxonomy;

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
        if(espezieak.contains(espeziea)) {
            espezieak.remove(espeziea);
            //Hemen datu basetik ezabatzeko
        }
        else {
            System.out.println("Errorea, ez da aurkitu espeziea");
        }
    }
    public void espezieaGehitu(Espeziea espeziea) {
        if(espezieak.contains(espeziea)) {
            espezieak.remove(espeziea);
        }
        else {
            System.out.println("Errorea, ez da aurkitu espeziea");
        }
    }

    //Espeziaren taxonomia aldatu
    public void aldatuEspezieGeneroa(String espeziea, String generoa) {
        for(int i = 0; i < espezieak.size(); i++) {
            if(espezieak.get(i).getIzenZientifikoa() == espeziea) {
                espezieak.get(i).setGenus(generoa);
                //Hemen DatuBasearen aldaketa
            }
        }
    }
}
