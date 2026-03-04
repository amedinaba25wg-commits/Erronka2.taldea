package Datuak;
import Objektuak.Erabiltzaileak.Erabiltzailea;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Set;

public class ErabiltzaileZerrenda {
    private Set<Erabiltzailea> erabiltzaileak;
    private HashMap<Erabiltzailea, String> erabiltzaileRolak;
    public int gehituErabiltzailea(Erabiltzailea erabiltzailea) {
        boolean gehituta = erabiltzaileak.add(erabiltzailea);
        if (gehituta) {
            return 0;   // Ondo gehitu egin da
        }
        return -1;      // Ez da ondo gehitu
    }

    public Erabiltzailea login(String username, String password) {
        for (Erabiltzailea erabiltzailea : erabiltzaileak) {
            if (erabiltzailea.getUsername().equals(username) && erabiltzailea.getPassword_hash().equals(password)) {
                return erabiltzailea;
            }
        }
        return null; //Ez da aurkitu erabiltzailea, pasahitza edo erabiltzailea okerra
    }
}
