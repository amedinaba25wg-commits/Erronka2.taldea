package Windows;
import Datuak.ErabiltzaileZerrenda;
import Objektuak.Erabiltzaileak.Erabiltzailea;

import javax.swing.*;
import java.awt.*;

public class SaioaHasiMenua extends JFrame {
    private ErabiltzaileZerrenda zerrenda;
    public SaioaHasiMenua() {
        super("Animaliak saioa hasi");
        this.zerrenda = zerrenda;

        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 220);
        setLocationRelativeTo(null);

        JPanel goiburua = new JPanel();
        JLabel titulua = new JLabel("Saioa hasi");
        goiburua.add(titulua);
        add(goiburua, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField txtErabiltzailea = new JTextField();
        txtErabiltzailea.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        panel.add(new JLabel("Erabiltzailea:"));
        panel.add(txtErabiltzailea);
        panel.add(Box.createVerticalStrut(10));

        JPasswordField txtPasahitza = new JPasswordField();
        txtPasahitza.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        panel.add(new JLabel("Pasahitza:"));
        panel.add(txtPasahitza);
        add(panel, BorderLayout.CENTER);

        JButton botoia = new JButton("Saioa hasi");
        add(botoia, BorderLayout.SOUTH);

        botoia.addActionListener(e -> {
            String erabiltzailea = txtErabiltzailea.getText();
            String pasahitza = new String(txtPasahitza.getPassword());

            Erabiltzailea erabiltzaileSartuta = this.zerrenda.login(erabiltzailea, pasahitza);

            if (erabiltzaileSartuta != null) {
                JOptionPane.showMessageDialog(this, "Login zuzena: " + erabiltzaileSartuta.getUsername());
            } else {
                JOptionPane.showMessageDialog(this, "Erabiltzailea edo pasahitza okerra");
            }
        });
    }

    public static void main(String[] args) {
        new SaioaHasiMenua();
    }
}
