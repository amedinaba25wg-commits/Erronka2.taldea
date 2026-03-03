package Datuak;
import Objektuak.Erabiltzailea;

import java.util.Set;

public class ErabiltzaileZerrenda {
    private Set<Erabiltzailea> erabiltzaileak;

    public int gehituErabiltzailea(Erabiltzailea erabiltzailea) {
        boolean gehituta = erabiltzaileak.add(erabiltzailea);
        if (gehituta) {
            return 0;   // Ondo gehitu egin da
        }
        return -1;      // Ez da ondo gehitu
    }

}
