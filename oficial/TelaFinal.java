import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class TelaFinal extends JFrame {

    public TelaFinal(ArrayList<Veiculo> lista) {

        setTitle("Tabela Final");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setLayout(new java.awt.FlowLayout());

        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Tipo", "Marca", "Modelo", "Ano"}
        );

        JTable tabela = new JTable(modelo);

        for (Veiculo v : lista) {
            modelo.addRow(new Object[]{
                    v.getTipo(),
                    v.getMarca(),
                    v.getModelo(),
                    v.getAno()
            });
        }

        JButton tema = new JButton("Tema");
        tema.addActionListener(e -> Tema.alternarTema(this));

        add(new JScrollPane(tabela));
        add(tema);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}