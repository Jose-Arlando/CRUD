package Desafio_interface;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;


public class TelaEditar {
    JFrame telaEditar = new JFrame("Editar");
    DefaultTableModel model;
    JRadioButton rbtautoed = new JRadioButton("Automático");
    JRadioButton rbtmanued = new JRadioButton("Manual");
    int linha;
    Carro carroselecionado;
    public TelaEditar(Carro carroselecionado, DefaultTableModel model, int linha){
        this.carroselecionado = carroselecionado;
        this.model = model;
        this.linha = linha;
    }
    
    void criartelaeditar(){
        //CRIAR
        ButtonGroup grupoed = new ButtonGroup();
        grupoed.add(rbtautoed);
        grupoed.add(rbtmanued);

        JComboBox<String> cbtipoed = new JComboBox(new String[]{"Carro", "Moto", "Caminhão"});
        JLabel lbTipoed = new JLabel("TIPO:");
        JLabel lbMarcaed = new JLabel("MARCA:");
        JLabel lbModeloed = new JLabel("MODELO:");
        JLabel lbAnoed = new JLabel("ANO:");
        JLabel lbValored = new JLabel("VALOR:");
        
        JButton btnrecadastrar = new JButton("Recadastrar");
        // JTextField tfTipoed = new JTextField(carroselecionado.getTipo());
        JTextField tfMarcaed = new JTextField(carroselecionado.getMarca());
        JTextField tfModeloed = new JTextField(carroselecionado.getModelo());
        JTextField tfAnoed = new JTextField(carroselecionado.getAno());
        JTextField tfValored = new JTextField(carroselecionado.getValor());
        // JTextField tfCambioed = new JTextField(carroselecionado.getCambio());

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
        
        btnrecadastrar.setBounds(350, 0, 110, 30);
        cbtipoed.setBounds(20, 0, 100, 30);
        tfMarcaed.setBounds(110, 80, 200, 30);
        tfModeloed.setBounds(110, 160, 200, 30);
        tfAnoed.setBounds(110, 240, 200, 30);
        tfValored.setBounds(110, 320, 200, 30);
        // tfCored.setBounds(110, 400, 200, 30);
        rbtautoed.setBounds(240, 0, 100, 30);
        rbtmanued.setBounds(140, 0, 100, 30);

        //ADD
        // telaEditar.add(lbTipoed);
        telaEditar.add(lbMarcaed);
        telaEditar.add(lbModeloed);
        telaEditar.add(lbAnoed);
        telaEditar.add(lbValored);
        
        telaEditar.add(rbtautoed);
        telaEditar.add(rbtmanued);
        telaEditar.add(cbtipoed);
        telaEditar.add(tfMarcaed);
        telaEditar.add(tfModeloed);
        telaEditar.add(tfAnoed);
        telaEditar.add(tfValored);
        // telaEditar.add(tfCored);
        telaEditar.add(btnrecadastrar);

        btnrecadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                carroselecionado.setTipo(cbtipoed.getSelectedItem().toString());
                carroselecionado.setMarca(tfMarcaed.getText());
                carroselecionado.setModelo(tfModeloed.getText());
                carroselecionado.setAno(tfAnoed.getText());
                carroselecionado.setValor(tfValored.getText());
                String cambio = rbtautoed.isSelected()
            ? "Automático"
            : "Manual";

    carroselecionado.setCambio(cambio);
                System.out.println("Recadastrado");
                model.setValueAt(carroselecionado.getTipo(), linha, 0);
                model.setValueAt(tfMarcaed.getText(), linha, 1);
                model.setValueAt(tfModeloed.getText(), linha, 2);
                model.setValueAt(tfAnoed.getText(), linha, 3);
                model.setValueAt(tfValored.getText(), linha, 4);
                model.setValueAt(cambio, linha, 5);
            }
        });
    }
}
