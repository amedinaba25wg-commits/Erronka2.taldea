package Objektuak.Erabiltzaileak;

public class Erabiltzailea {
    private int id_erabiltzailea;
    private String username;
    private String password_hash;
    private String email;
    private int aktiboa;
    private String mota;

    public Erabiltzailea(int id_erabiltzailea, String username, String password_hash, String email, int aktiboa, String mota) {
        this.id_erabiltzailea = id_erabiltzailea;
        this.username = username;
        this.password_hash = password_hash;
        this.email = email;
        this.aktiboa = aktiboa;
        this.mota = mota;
    }

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

    //getter-ak
    public int getId_erabiltzailea() {
        return id_erabiltzailea;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public String getEmail() {
        return email;
    }

    public int getAktiboa() {
        return aktiboa;
    }

    public String getMota() {
        return mota;
    }

    //setter-ak
    public void setId_erabiltzailea(int id_erabiltzailea) {
        this.id_erabiltzailea = id_erabiltzailea;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAktiboa(int aktiboa) {
        this.aktiboa = aktiboa;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
