import javax.swing.*;

public class SplashScreen extends JFrame {

    public SplashScreen() {
        setTitle("Tela Inicial");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new java.awt.FlowLayout());

        JLabel titulo = new JLabel("Sistema de Veículos");

        JButton iniciar = new JButton("Iniciar");
        JButton tema = new JButton("Tema");

        iniciar.addActionListener(e -> {
            new Sistema().setVisible(true);
            dispose();
        });

        tema.addActionListener(e -> Tema.alternarTema(this));

        add(titulo);
        add(iniciar);
        add(tema);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SplashScreen().setVisible(true);
    }
}