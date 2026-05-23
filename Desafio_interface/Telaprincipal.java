package Desafio_interface;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Image;


public class Telaprincipal {
    public static void main(String [] args){
        
        //CRIAR        
        ImageIcon img = new ImageIcon("C:\\Users\\wanderson\\Documents\\Meus Projetos\\CRUD\\Desafio_interface\\carro2.png");
        Image imgRedimensionada = img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        JLabel lbImagem = new JLabel(new ImageIcon(imgRedimensionada));

        JFrame telaPrincipal = new JFrame("CADASTRO VEÍCULOS");
        JLabel lbIniciar = new JLabel("BEM VINDO!");
        JLabel lbDescricao = new JLabel("O proposito deste sistema é realizar o cadastro de veículos!");
        JButton btnIniciar = new JButton("Começar");
        //EDITAR
        telaPrincipal.setLayout(null);
        telaPrincipal.setSize(500, 500);
        telaPrincipal.setLocation(500, 230);
        telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaPrincipal.setVisible(true);
        lbIniciar.setFont(new Font("Arial", 1, 30));
        lbIniciar.setBounds(150, 150, 200, 40);
        lbDescricao.setBounds(75, 200, 340, 40);
        btnIniciar.setBounds(207, 350, 85, 30);
        lbImagem.setBounds(200, 50, 100, 100);
        
        
        //ADICIONAR
        telaPrincipal.add(lbIniciar);
        telaPrincipal.add(btnIniciar);
        telaPrincipal.add(lbDescricao);
        telaPrincipal.add(lbImagem);
        //EVENTO
        btnIniciar.addActionListener(e -> {
            telaPrincipal.dispose();   
            TelaSegundario telaSegundaria = new TelaSegundario();
            telaSegundaria.CriarTelaSegundaria();
            
        });
    }
}
