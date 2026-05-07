import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Sistema extends JFrame {

    private ArrayList<Veiculo> lista = new ArrayList<>();
    private DefaultTableModel modelo;
    private JTable tabela;

    private JTextField txtMarca, txtModelo, txtAno, txtBusca;
    private JComboBox<String> cbTipo;

    public Sistema() {

        setTitle("CRUD");
        setSize(750, 400);
        setLayout(new java.awt.FlowLayout());
        setLocationRelativeTo(null);

        cbTipo = new JComboBox<>(new String[]{"Carro", "Moto"});
        txtMarca = new JTextField(8);
        txtModelo = new JTextField(8);
        txtAno = new JTextField(5);
        txtBusca = new JTextField(10);

        JButton criar = new JButton("Criar");
        JButton editar = new JButton("Editar");
        JButton deletar = new JButton("Deletar");
        JButton buscar = new JButton("Buscar");
        JButton finalizar = new JButton("Finalizar");
        JButton tema = new JButton("Tema");

        modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Tipo", "Marca", "Modelo", "Ano"}
        );

        tabela = new JTable(modelo);

        // ===== CRIAR =====
        criar.addActionListener(e -> {
            try {
                String tipo = cbTipo.getSelectedItem().toString();
                String marca = txtMarca.getText();
                String modeloV = txtModelo.getText();
                int ano = Integer.parseInt(txtAno.getText());

                Veiculo v = tipo.equals("Carro")
                        ? new Carro(marca, modeloV, ano)
                        : new Moto(marca, modeloV, ano);

                lista.add(v);

                modelo.addRow(new Object[]{
                        v.getTipo(), v.getMarca(), v.getModelo(), v.getAno()
                });

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro nos dados!");
            }
        });

        // ===== EDITAR =====
        editar.addActionListener(e -> {
            int i = tabela.getSelectedRow();
            if (i != -1) {
                Veiculo v = lista.get(i);
                v.marca = txtMarca.getText();
                v.modelo = txtModelo.getText();
                v.ano = Integer.parseInt(txtAno.getText());

                modelo.setValueAt(v.getMarca(), i, 1);
                modelo.setValueAt(v.getModelo(), i, 2);
                modelo.setValueAt(v.getAno(), i, 3);
            }
        });

        // ===== DELETAR =====
        deletar.addActionListener(e -> {
            int i = tabela.getSelectedRow();
            if (i != -1) {
                lista.remove(i);
                modelo.removeRow(i);
            }
        });

        // ===== BUSCAR =====
        buscar.addActionListener(e -> {

            String texto = txtBusca.getText().toLowerCase();

            modelo.setRowCount(0);

            for (Veiculo v : lista) {
                if (v.getMarca().toLowerCase().contains(texto) ||
                    v.getModelo().toLowerCase().contains(texto)) {

                    modelo.addRow(new Object[]{
                            v.getTipo(),
                            v.getMarca(),
                            v.getModelo(),
                            v.getAno()
                    });
                }
            }
        });

        // ===== FINALIZAR =====
        finalizar.addActionListener(e -> {
            new TelaFinal(lista).setVisible(true);
            dispose();
        });

        // ===== TEMA =====
        tema.addActionListener(e -> Tema.alternarTema(this));

        // CLICK NA TABELA
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int i = tabela.getSelectedRow();
                txtMarca.setText(modelo.getValueAt(i, 1).toString());
                txtModelo.setText(modelo.getValueAt(i, 2).toString());
                txtAno.setText(modelo.getValueAt(i, 3).toString());
                cbTipo.setSelectedItem(modelo.getValueAt(i, 0));
            }
        });

        add(cbTipo); add(txtMarca); add(txtModelo); add(txtAno);
        add(criar); add(editar); add(deletar);
        add(new JLabel("Buscar:")); add(txtBusca); add(buscar);
        add(finalizar); add(tema);
        add(new JScrollPane(tabela));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}