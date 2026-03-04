package Windows;

import javax.swing.*;
import java.awt.*;

public class ErregistroGabe extends JFrame {

    public ErregistroGabe() {

        setTitle("Gonbidatua");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // =========================
        // GOIKO PARTEA
        // =========================
        JPanel goikoPanela = new JPanel();
        goikoPanela.setLayout(new BorderLayout());

        JButton atzera = new JButton("Atzera");

        JPanel atzeraPanel = new JPanel();
        atzeraPanel.setLayout(new BoxLayout(atzeraPanel, BoxLayout.X_AXIS));
        atzeraPanel.add(atzera);

        JLabel gonbidatua = new JLabel("Gonbidatua");

        goikoPanela.add(gonbidatua, BorderLayout.WEST);
        goikoPanela.add(atzeraPanel, BorderLayout.EAST);

        add(goikoPanela, BorderLayout.NORTH);
        // GOIKO PARTEA AMAITUTA


        // ERDIKO PARTEA
        JPanel erdikoPanela = new JPanel();
        erdikoPanela.setLayout(new BoxLayout(erdikoPanela, BoxLayout.Y_AXIS));

        JButton btnEspezieGuztiak = new JButton("Ikusi espezie guztiak");
        JButton btnDomestikoak = new JButton("Ikusi espezie domestikoak");

        btnEspezieGuztiak.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnDomestikoak.setAlignmentX(Component.CENTER_ALIGNMENT);

        erdikoPanela.add(Box.createVerticalStrut(80));
        erdikoPanela.add(btnEspezieGuztiak);
        erdikoPanela.add(Box.createVerticalStrut(20));
        erdikoPanela.add(btnDomestikoak);

        add(erdikoPanela, BorderLayout.CENTER);

        // FUNTZIONALITATEA

        // atzera bueltatzeko BOTOIA
        atzera.addActionListener(e -> {
            dispose();
            new HasierakoMenua().setVisible(true);
        });

        //
        btnEspezieGuztiak.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Espezie guztiak erakutsi");
        });

        btnDomestikoak.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Espezie domestikoak erakutsi");
        });
    }
    public static void main(String[] args) {
        new ErregistroGabe().setVisible(true);
    }
}