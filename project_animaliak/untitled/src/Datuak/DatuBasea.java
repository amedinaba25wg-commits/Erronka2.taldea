package Datuak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatuBasea {

    // =================== ORACLE REMOTO ===================
    // Aquí pondrás los datos sacados de SQL Developer
    private static final String ORACLE_HOST = "POD";          // ej: db1234567890.oraclecloud.com
    private static final String ORACLE_PORT = "1521";             // normalmente 1521
    private static final String ORACLE_SERVICE = "G68775243B6E1BA_ZUBIRIMANTEO2026_low.adb.oraclecloud.com";    // ej: XEPDB1
    private static final String ORACLE_USER = "Team02_01_25_26";       // usuario Oracle
    private static final String ORACLE_PASS = "ZubiriManteo2026";    // contraseña Oracle

    // Construimos la URL JDBC Oracle
    private static final String ORACLE_URL =
            "jdbc:oracle:thin:@//" + ORACLE_HOST + ":" + ORACLE_PORT + "/" + ORACLE_SERVICE;

    public static Connection getOracleConnection() throws SQLException {
        return DriverManager.getConnection(ORACLE_URL, ORACLE_USER, ORACLE_PASS);
    }

    // =================== MYSQL LOCAL ===================
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/species";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASS = "root";

    public static Connection getMySQLConnection() throws SQLException {
        return DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASS);
    }
}