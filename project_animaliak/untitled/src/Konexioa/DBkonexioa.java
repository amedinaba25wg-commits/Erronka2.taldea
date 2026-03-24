package Konexioa;

import java.sql.*;

public class DBkonexioa {
    final private String DB_URL = "jdbc:oracle:thin:@zubirimanteo2026_high?TNS_ADMIN=C:/Users/ik012982i12/Downloads/Wallet_ZubiriManteo2026";
    final private String DB_USER = "TEAM02_01_25_26";
    final private String DB_PASS = "ZubiriManteo2026";

    private Connection kon;

    public DBkonexioa(){
        try {

            DriverManager.setLogWriter(new java.io.PrintWriter(System.out));
            System.out.println("Datu basean sartzen...");

            kon = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            System.out.println("Konexioa eginda!");

        } catch (SQLException e) {
            System.out.println("Errorea datu basera konektatzean: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void itxi(){
        try {
            kon.close();
            System.out.println("Datu basetik deskonektatuta.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void login(String username, String password) {

        String sql = "SELECT ID_ERABILTZAILEA, EMAIL, AKTIBOA FROM TEAM02_01_25_26.ERABILTZAILEA " +
                "WHERE USERNAME = ? AND PASSWORD_HASH = ?";

        try (PreparedStatement ps = kon.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Ongi etorri! Email: " + rs.getString("EMAIL"));
                } else {
                    System.out.println("Erabiltzaile edo pasahitz okerra.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void mascotenInformazioa() {
        String sql = "SELECT p.NAME, s.COMMON_NAME, s.AVG_LIFE_SPAN " +
                "FROM TEAM02_01_25_26.PETS p " +
                "JOIN TEAM02_01_25_26.SPECIES s ON p.SCIENTIFIC_NAME = s.SCIENTIFIC_NAME";

        try (Statement st = kon.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Mascota: " + rs.getString("NAME") +
                        " | Especie: " + rs.getString("COMMON_NAME") +
                        " | Bizi-itxaropena: " + rs.getString("AVG_LIFE_SPAN"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void erakutsiPribilegioak(String username) {
        String sql = "SELECT pri.IZENA " +
                "FROM TEAM02_01_25_26.ERABILTZAILEA u " +
                "JOIN TEAM02_01_25_26.ERABILTZAILE_ROLA ur ON u.ID_ERABILTZAILEA = ur.ID_ERABILTZAILEA " +
                "JOIN TEAM02_01_25_26.ROLA r ON ur.ID_ROLA = r.ID_ROLA " +
                "JOIN TEAM02_01_25_26.ROL_PRIBILEGIOA rp ON r.ID_ROLA = rp.ID_ROLA " +
                "JOIN TEAM02_01_25_26.PRIBILEGIOA pri ON rp.ID_PRIBILEGIOA = pri.ID_PRIBILEGIOA " +
                "WHERE u.USERNAME = ?";

        try (PreparedStatement ps = kon.prepareStatement(sql)) {
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            System.out.println("Privilegios de " + username + ":");
            while (rs.next()) {
                System.out.println("- " + rs.getString("IZENA"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void gordePet(int id, String name, String scientificName) {
        String sql = "INSERT INTO TEAM02_01_25_26.PETS (ID, NAME, SCIENTIFIC_NAME) VALUES (?, ?, ?)";

        try (PreparedStatement ps = kon.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, scientificName);

            int rows = ps.executeUpdate();
            if (rows > 0) System.out.println("Mascota ondo gorde da!");
        } catch (SQLException e) {
            System.out.println("Errorea gordetzean: " + e.getMessage());
        }
    }

    public Connection getKon() {
        return kon;
    }
}