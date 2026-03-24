package Windows;
import Datuak.ErabiltzaileZerrenda;
import Objektuak.Erabiltzaileak.Administratzailea;
import Objektuak.Erabiltzaileak.Erabiltzailea;

import javax.swing.*;
import java.awt.*;

public class AdminMenua extends JFrame{
    private ErabiltzaileZerrenda zerrenda;
    private Administratzailea admin;

    AdminMenua(Erabiltzailea erabiltzailea) {
        super("Administrariaren menua");
        this.zerrenda = zerrenda;
        setLayout(new BorderLayout());
        setSize(new Dimension(300, 300));

        //Goiko partea
        JPanel goikoPanela = new JPanel();
        goikoPanela.setLayout(new BorderLayout());
        JButton sahioaItxi = new JButton("Saioa Itxi");
        JPanel sahioItxiPanel = new JPanel();
        sahioItxiPanel.setLayout(new BoxLayout(sahioItxiPanel, BoxLayout.X_AXIS));
        sahioItxiPanel.add(sahioaItxi);

        JLabel admin = new JLabel("Administratzailea");
        goikoPanela.add(admin, BorderLayout.WEST);
        goikoPanela.add(sahioItxiPanel, BorderLayout.EAST);
        add(goikoPanela, BorderLayout.NORTH);
        //Goiko partea bukatuta

        //Administratzailearen aukerak
        JPanel erdikoZatia = new JPanel();
        erdikoZatia.setLayout(new GridLayout(4, 1));
        JButton ikusiBotoia = new JButton("Erabiltzaileak ikusi");
        erdikoZatia.setPreferredSize(new Dimension(200, 200));
        erdikoZatia.setMaximumSize(new Dimension(200, 200));
        JButton gehituBotoia = new JButton("Erabiltzailea gehitu");
        JButton ezabatuBotoia = new JButton("Erabiltzailea ezabatu");
        JButton rolakEditatu = new JButton("Erabiltzaileen rolak editatu");
        erdikoZatia.add(ikusiBotoia);
        erdikoZatia.add(gehituBotoia);
        erdikoZatia.add(ezabatuBotoia);
        erdikoZatia.add(rolakEditatu);

        JPanel erdian = new JPanel();
        erdian.setLayout(new BoxLayout(erdian, BoxLayout.X_AXIS));
        erdian.add(erdikoZatia);
        add(erdian, BorderLayout.CENTER);

        setVisible(true);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        AdminMenua adminMenua = new AdminMenua(new Administratzailea(21, "admin Pepito", "dffdsljfds"));
    }

}
