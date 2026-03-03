import java.sql.Connection;
import Datuak.DatuBasea;

public class TestConexion {
    public static void main(String[] args) {

        // ====== Probar conexión Oracle ======
        try (Connection conn = DatuBasea.getOracleConnection()) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("✅ Conectado correctamente a Oracle!");
            } else {
                System.out.println("❌ No se pudo conectar a Oracle");
            }
        } catch (Exception e) {
            System.out.println("❌ Error conectando a Oracle:");
            e.printStackTrace();
        }

        // ====== Probar conexión MySQL ======
        try (Connection conn = DatuBasea.getMySQLConnection()) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("✅ Conectado correctamente a MySQL!");
            } else {
                System.out.println("❌ No se pudo conectar a MySQL");
            }
        } catch (Exception e) {
            System.out.println("❌ Error conectando a MySQL:");
            e.printStackTrace();
        }
    }
}