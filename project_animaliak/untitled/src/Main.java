import Windows.SaioaHasiMenua;
import Konexioa.DBkonexioa;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DBkonexioa db = new DBkonexioa();
        Connection nireKonexioa = db.getKon();

        if (nireKonexioa != null) {
            System.out.println("Aplikazioa martxan dago eta datu-basera konektatuta!");
            new SaioaHasiMenua();


            System.out.println("\n--- PROBAK HASTEN ---");

            db.login("joxe_admin", "123");
            db.erakutsiPribilegioak("joxe");

            db.mascotenInformazioa();


            db.gordePet(1, "Txerria", "Sus scrofa domesticus");


            db.itxi();
        } else {
            System.out.println("Ezin da aplikazioa hasi datu-baserik gabe.");

        }
    }
}