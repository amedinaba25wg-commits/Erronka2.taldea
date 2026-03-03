package Objektuak;

public class Erabiltzailea {
    private int id_erabiltzailea;
    private String username;
    private String password_hash;
    private String email;
    private int aktiboa;
    Erabiltzailea(int id_erabiltzailea) {
        this.id_erabiltzailea = id_erabiltzailea;
    }
    Erabiltzailea(int id_erabiltzailea, String username, String password_hash) {
        this(id_erabiltzailea);
        this.username = username;
        this.password_hash = password_hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Erabiltzailea other = (Erabiltzailea) obj;
        return this.id_erabiltzailea == other.id_erabiltzailea || this.username == other.username;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id_erabiltzailea);
    }




}
