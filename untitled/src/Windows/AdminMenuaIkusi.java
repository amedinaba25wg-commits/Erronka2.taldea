package Windows;

import javax.swing.*;
import java.awt.*;

public class AdminMenuaIkusi extends JFrame {
    AdminMenuaIkusi() {
        super("Erabiltzailea gehitu");
        //Goiko partea
        JPanel goikoPanela = new JPanel();
        goikoPanela.setLayout(new BorderLayout());
        JButton sahioaItxi = new JButton("sahioaItxi");
        JPanel sahioItxiPanel = new JPanel();
        sahioItxiPanel.setLayout(new BoxLayout(sahioItxiPanel, BoxLayout.X_AXIS));
        sahioItxiPanel.add(sahioaItxi);

        JLabel admin = new JLabel("Administratzailea");
        goikoPanela.add(admin, BorderLayout.WEST);
        goikoPanela.add(sahioItxiPanel, BorderLayout.EAST);
        add(goikoPanela, BorderLayout.NORTH);
        //Goiko partea bukatuta

        //Erdiko partea

        //Erdiko partea bukatuta

        //Orrialdeak

    }
    public static void main(String[] args) {

    }
}
