package Objektuak.Erabiltzaileak;

public class Administratzailea extends Erabiltzailea {
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

    }
    public void ezabatuErabiltzailea(Erabiltzailea erabiltzailea) {

    }
    public void ErabiltzaileRolaAldatu(Erabiltzailea erabiltzailea) {

    }
}
