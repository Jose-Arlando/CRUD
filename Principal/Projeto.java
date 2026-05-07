import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.ArrayList;

public class Projeto {
    public static void main(String[] args){
        JFrame janela = new JFrame("Minha janela");
        // JLabel LabelInicial = new JLabel();
        // LabelInicial.setText("Olá");
        
        
        
        //CONFIGURAR A JANELA
        janela.setVisible(true);
        janela.setBounds(300, 300, 500, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //CONFIGURAR A LABEL
        // LabelInicial.setBounds(200, 200, 100, 100);
        //ADICIONAR A JABELA
        // janela.add(LabelInicial);
    }
}
