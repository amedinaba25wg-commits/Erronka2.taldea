package Objektuak.Erabiltzaileak;

import Datuak.ErabiltzaileZerrenda;

public class Administratzailea extends Erabiltzailea {
    private ErabiltzaileZerrenda zerrenda;
    public Administratzailea(int id_erabiltzailea) {
        super(id_erabiltzailea);
    }

    public Administratzailea(int id_erabiltzailea, String username, String password_hash) {
        super(id_erabiltzailea, username, password_hash);
    }

    public Administratzailea(Erabiltzailea erabiltzailea) {
        super(erabiltzailea.getId_erabiltzailea(), erabiltzailea.getUsername(), erabiltzailea.getPassword_hash());
    }
    public void gehituErabiltzailea(Erabiltzailea erabiltzailea) {
        zerrenda.gehituErabiltzailea(erabiltzailea);
    }
    public void ezabatuErabiltzailea(Erabiltzailea erabiltzailea) {
        zerrenda.ezabatuErabiltzailea(erabiltzailea);
    }
    public void ErabiltzaileRolaAldatu(Erabiltzailea erabiltzailea) {

    }
}
