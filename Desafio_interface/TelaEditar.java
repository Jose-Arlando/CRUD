package Desafio_interface;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class TelaEditar {
    JFrame telaEditar = new JFrame("Editar");
    
    Carro carroselecionado;
    public TelaEditar(Carro carroselecionado){
        this.carroselecionado = carroselecionado;
    }
    
    void criartelaeditar(){
        //CRIAR
        JLabel lbTipoed = new JLabel("TIPO:");
        JLabel lbMarcaed = new JLabel("MARCA:");
        JLabel lbModeloed = new JLabel("MODELO:");
        JLabel lbAnoed = new JLabel("ANO:");
        JLabel lbValored = new JLabel("VALOR:");
        JLabel lbCored = new JLabel("COR:");
        JButton btnrecadastrar = new JButton("Recadastrar");
        JTextField tfTipoed = new JTextField(carroselecionado.getTipo());
        JTextField tfMarcaed = new JTextField(carroselecionado.getMarca());
        JTextField tfModeloed = new JTextField(carroselecionado.getModelo());
        JTextField tfAnoed = new JTextField(carroselecionado.getAno());
        JTextField tfValored = new JTextField(carroselecionado.getValor());
        JTextField tfCored = new JTextField(carroselecionado.getCor());

        //EDITAR
        telaEditar.setLayout(null);
        telaEditar.setVisible(true);
        telaEditar.setBounds(500, 230, 500, 500);
        telaEditar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        lbTipoed.setBounds(20, 0, 100, 30);
        lbMarcaed.setBounds(20, 80, 100, 30);
        lbModeloed.setBounds(20, 160, 100, 30);
        lbAnoed.setBounds(20, 240, 100, 30);
        lbValored.setBounds(20, 320, 100, 30);
        lbCored.setBounds(20, 400, 100, 30);
        btnrecadastrar.setBounds(350, 0, 110, 30);
        tfTipoed.setBounds(110, 0, 200, 30);
        tfMarcaed.setBounds(110, 80, 200, 30);
        tfModeloed.setBounds(110, 160, 200, 30);
        tfAnoed.setBounds(110, 240, 200, 30);
        tfValored.setBounds(110, 320, 200, 30);
        tfCored.setBounds(110, 400, 200, 30);

        //ADD
        telaEditar.add(lbTipoed);
        telaEditar.add(lbMarcaed);
        telaEditar.add(lbModeloed);
        telaEditar.add(lbAnoed);
        telaEditar.add(lbValored);
        telaEditar.add(lbCored);
        telaEditar.add(tfTipoed);
        telaEditar.add(tfMarcaed);
        telaEditar.add(tfModeloed);
        telaEditar.add(tfAnoed);
        telaEditar.add(tfValored);
        telaEditar.add(tfCored);
        telaEditar.add(btnrecadastrar);

        btnrecadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Recadastrado");
                listaCarros.
            }
        });
    }
}
