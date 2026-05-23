package Desafio_interface;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class TelaSegundario {
    TelaEditar telaEditar;

    void CriarTelaSegundaria(){
        //CRIAR TABELA E ARRAY
        ArrayList <Carro> listaCarros = new ArrayList<>();
        String[] colunas = {"TIPO", "MARCA", "MODELO", "ANO", "VALOR", "CÂMBIO"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);
        JTable tabelaVeiculo = new JTable(model);

        JFrame telaSegundaria = new JFrame("CADASTRO DE VEÍCULOS");
        JButton btnCadastrar = new JButton("Cadastrar");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnEditar = new JButton("Editar");
        JButton btnDeletar = new JButton("Deletar");
        //EDITAR
        telaSegundaria.setLayout(null);
        telaSegundaria.setSize(700, 500);
        telaSegundaria.setLocation(500, 230);
        telaSegundaria.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        telaSegundaria.setVisible(true);
        btnCadastrar.setBounds(455, 0, 100, 40);
        btnBuscar.setBounds(455, 50, 100, 40);
        btnEditar.setBounds(580, 0, 100, 40);
        btnDeletar.setBounds(580, 50, 100, 40);
        JScrollPane scroll = new JScrollPane(tabelaVeiculo);
        scroll.setBounds(0,0, 450, 500);

        //ADICIONAR
        telaSegundaria.add(btnCadastrar);
        telaSegundaria.add(btnBuscar);
        telaSegundaria.add(btnEditar);
        telaSegundaria.add(btnDeletar);
        telaSegundaria.add(scroll);

        btnCadastrar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                TelaCadastro telaCadastro = new TelaCadastro(listaCarros, model);
                telaCadastro.CriarTelaCadastro();
            }
        }); 

        btnBuscar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("clicado buscar");
                JTextField tfBusca = new JTextField();
                JLabel lbPedir = new JLabel("O que deseja buscar:");
                JButton btnConfirmar = new JButton("Confirmar");

                lbPedir.setBounds(455, 100, 150, 30);
                tfBusca.setBounds(455, 130, 125, 30);
                btnConfirmar.setBounds(580, 130, 100, 30);
                telaSegundaria.add(tfBusca);
                telaSegundaria.add(lbPedir);
                telaSegundaria.add(btnConfirmar);
                btnConfirmar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //RECEBER O NOME PARA BUSCA
                        String busca = tfBusca.getText().toLowerCase(); // "getText" pega o texto de tfBusca e "toLowerCase" tranforma tudo para minusculo 
                        //LIMPAR TABELA
                        System.out.println(listaCarros.size());
                        model.setRowCount(0);
                        for(Carro c: listaCarros){
                            if(c.getTipo().toLowerCase().contains(busca)
                                ||c.getMarca().toLowerCase().contains(busca)
                                ||c.getModelo().toLowerCase().contains(busca)
                                ||c.getAno().contains(busca)
                                ||c.getCambio().toLowerCase().contains(busca)){
                                
                                model.addRow(new Object[]{
                                    c.getTipo(),
                                    c.getMarca(),
                                    c.getModelo(),
                                    c.getAno(),
                                    c.getValor(),
                                    c.getCambio()
                                });
                            }
                        }
                        
                    }
                });
                telaSegundaria.revalidate();
                telaSegundaria.repaint();
            }
        });
        btnDeletar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
            }
        });
        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int linha = tabelaVeiculo.getSelectedRow();
                Carro carroselecionado = listaCarros.get(linha);
                telaEditar = new TelaEditar(carroselecionado, model, linha);
                telaEditar.criartelaeditar();
            }
        });
        btnDeletar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int linha = tabelaVeiculo.getSelectedRow();
                listaCarros.remove(linha);
                model.removeRow(linha);
            }
        });
    }
}
