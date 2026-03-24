package Windows;

import Objektuak.Erabiltzaileak.Erabiltzailea;

import javax.swing.*;
import java.awt.*;

public class UserMenua extends JFrame {
    private Erabiltzailea erabiltzailea;
    UserMenua() {
        this.erabiltzailea = erabiltzailea;
        setTitle("Zubiri Animaliak");
        setSize(400, 400);
        setResizable(false);
        setLayout(new GridLayout(3, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Goian ezkerrean
        JPanel profila = new JPanel();
        profila.setSize(50, 50);
        profila.setLayout(new BorderLayout());
        ImageIcon argazkia = new ImageIcon("argazkiak/erabiltzailea.png");
        JLabel argazkiaLabel = new JLabel(argazkia);
        JLabel izena = new JLabel("erabiltzailea");
        profila.add(argazkiaLabel, BorderLayout.NORTH);
        profila.add(izena, BorderLayout.SOUTH);
        add(profila);

        setVisible(true);

    }
    public static void main(String[] args) {
        new UserMenua();
    }
}
