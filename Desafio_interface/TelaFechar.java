package Desafio_interface;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TelaFechar {

    DefaultTableModel model;

    JFrame telaFechar = new JFrame("Concluído");

    public TelaFechar(DefaultTableModel model){
        this.model = model;
    }

    public void CriarTelaFechar(){

        telaFechar.setLayout(null);

        telaFechar.setBounds(500, 230, 700, 500);

        telaFechar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // TEXTO
        JLabel lbFechar = new JLabel("TABELA CONCLUÍDA!");

        lbFechar.setBounds(250, 20, 200, 30);

        // TABELA
        JTable tabela = new JTable(model);

        JScrollPane scroll = new JScrollPane(tabela);

        scroll.setBounds(50, 70, 580, 300);

        // ADICIONAR
        telaFechar.add(lbFechar);

        telaFechar.add(scroll);

        telaFechar.setVisible(true);
    }
}
