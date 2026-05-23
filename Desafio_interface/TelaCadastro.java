package Desafio_interface;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.ArrayList;
import javax.swing.event.*;
import java.awt.event.*; //pesquisar as bibliotecas
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;


public class TelaCadastro {
    //CARRO
    ArrayList<Carro> listaCarros;
    DefaultTableModel model;
    //CRIAR
    JRadioButton rbtauto = new JRadioButton("Automático");
    JRadioButton rbtmanu = new JRadioButton("Manual");
    ButtonGroup grupo = new ButtonGroup();
    
    JFrame TelaCadastro = new JFrame("CADASTRAR VEÍCULO");
    JComboBox<String> cbtipo = new JComboBox<>(new String[]{"Carro", "Moto", "Caminhão"});
    // JLabel lbTipo = new JLabel("TIPO:");
    JLabel lbMarca = new JLabel("MARCA:");
    JLabel lbModelo = new JLabel("MODELO:");
    JLabel lbAno = new JLabel("ANO:");
    JLabel lbValor = new JLabel("VALOR:");
    JLabel lbCor = new JLabel("COR:");
    JButton btnSalvar = new JButton("Salvar");
    // JTextField tfTipo = new JTextField();
    JTextField tfMarca = new JTextField();
    JTextField tfModelo = new JTextField();
    JTextField tfAno = new JTextField();
    JTextField tfValor = new JTextField("R$");
    JTextField tfCor = new JTextField();

    void CriarTelaCadastro(){
        //EDITAR, 
        TelaCadastro.setLayout(null);
        TelaCadastro.setVisible(true);
        TelaCadastro.setBounds(500, 230, 500, 500);
        TelaCadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rbtauto.setBounds(240, 0, 100, 30);
        rbtmanu.setBounds(140, 0, 100, 30);
        // lbTipo.setBounds(20, 0, 100, 30);
        cbtipo.setBounds(20, 0, 100, 30);
        lbMarca.setBounds(20, 80, 100, 30);
        lbModelo.setBounds(20, 160, 100, 30);
        lbAno.setBounds(20, 240, 100, 30);
        lbValor.setBounds(20, 320, 100, 30);
        lbCor.setBounds(20, 400, 100, 30);
        btnSalvar.setBounds(350, 0, 100, 30);
        // tfTipo.setBounds(110, 0, 200, 30);
        tfMarca.setBounds(110, 80, 200, 30);
        tfModelo.setBounds(110, 160, 200, 30);
        tfAno.setBounds(110, 240, 200, 30);
        tfValor.setBounds(110, 320, 200, 30);
        tfCor.setBounds(110, 400, 200, 30);

        grupo.add(rbtauto);
        grupo.add(rbtmanu); 

        
        //ADICIONAR
        // TelaCadastro.add(lbTipo);
        TelaCadastro.add(cbtipo);
        TelaCadastro.add(lbMarca);
        TelaCadastro.add(lbModelo);
        TelaCadastro.add(lbAno);
        TelaCadastro.add(lbValor);
        // TelaCadastro.add(lbCor);
        // TelaCadastro.add(tfTipo);
        TelaCadastro.add(tfMarca);
        TelaCadastro.add(tfModelo);
        TelaCadastro.add(tfAno);
        TelaCadastro.add(tfValor);
        // TelaCadastro.add(tfCor);
        TelaCadastro.add(btnSalvar);
        TelaCadastro.add(rbtauto);
        TelaCadastro.add(rbtmanu);
        //EVENTOS
        btnSalvar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Carro c = new Carro(
                    cbtipo.getSelectedItem().toString(),
                    tfModelo.getText(),
                    tfMarca.getText(),
                    tfValor.getText(),
                    tfAno.getText(),
                    rbtauto.isSelected() ? "Automático" : "Manual"
                );
                listaCarros.add(c);
                model.addRow(new Object[]{
                    c.getTipo(),
                    c.getMarca(),
                    c.getModelo(),
                    c.getAno(),
                    c.getValor(),
                    c.getCambio()
                });
            }
        });
    }
    public TelaCadastro(){}

    public TelaCadastro(ArrayList<Carro> listaCarros, DefaultTableModel model){
        this.listaCarros = listaCarros;
        this.model = model;
    }
}
