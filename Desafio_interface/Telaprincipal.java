package Desafio_interface;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Telaprincipal {
    public static void main(String [] args){
        //CRIAR
        JFrame telaPrincipal = new JFrame("CADASTRO VEÍCULOS");
        JLabel lbIniciar = new JLabel("BEM VINDO!");
        JButton btnIniciar = new JButton("Começar");
        //EDITAR
        telaPrincipal.setLayout(null);
        telaPrincipal.setSize(500, 500);
        telaPrincipal.setLocation(500, 230);
        telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaPrincipal.setVisible(true);
        lbIniciar.setBounds(200, 220, 100, 40);
        btnIniciar.setBounds(200, 260, 100, 40);
        
        //ADICIONAR
        telaPrincipal.add(lbIniciar);
        telaPrincipal.add(btnIniciar);

        //EVENTO
        btnIniciar.addActionListener(e -> {
            // telaPrincipal.dispose();   essa função fecha a TelaPrincipal e abre apenas a telaCadastro
            JFrame telaCadastro = new JFrame("CADASTRO VEÍCULOS");
            telaCadastro.setVisible(true);

        });
    }
}
