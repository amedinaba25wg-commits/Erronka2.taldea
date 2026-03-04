package Windows;

import javax.swing.*;
import java.awt.*;

public class HasierakoMenua extends JFrame {

    public HasierakoMenua() {

        //
        setTitle("ZubiriAnimaliak");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Goiburua
        JLabel titulo = new JLabel("ZubiriAnimaliak", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        add(titulo, BorderLayout.NORTH);

        // erdialdeko panela
        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new BoxLayout(panelCentro, BoxLayout.Y_AXIS));

        // irudia
        ImageIcon iconoOriginal = new ImageIcon(getClass().getResource("/Windows/logoa.png"));
        ImageIcon icono = new ImageIcon(iconoOriginal.getImage().getScaledInstance(320, 200, java.awt.Image.SCALE_SMOOTH));
        JLabel imagen = new JLabel(icono);
        imagen.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelCentro.add(imagen);
        panelCentro.add(Box.createRigidArea(new Dimension(0, 20)));

        // Botones
        JButton btnLogin = new JButton("Iniciar sesión");
        JButton btnRegistro = new JButton("Registrarse");
        JButton btnInvitado = new JButton("Entrar como invitado");

        btnLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnRegistro.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnInvitado.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelCentro.add(btnLogin);
        panelCentro.add(Box.createRigidArea(new Dimension(0, 10)));
        panelCentro.add(btnRegistro);
        panelCentro.add(Box.createRigidArea(new Dimension(0, 10)));
        panelCentro.add(btnInvitado);

        add(panelCentro, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new HasierakoMenua().setVisible(true);
    }
}
