package Datuak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatuBasea {

    //Oracle konexioa
    private static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:XEPDB1";
    private static final String ORACLE_USER = "Team02_01_25_26";
    private static final String ORACLE_PASS = "ZubiriManteo2026";

    // MySQL konexioa
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/species";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASS = "root";

    public static Connection getOracleConnection() throws SQLException {
        return DriverManager.getConnection(ORACLE_URL, ORACLE_USER, ORACLE_PASS);
    }

    public static Connection getMySQLConnection() throws SQLException {
        return DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASS);
    }
}