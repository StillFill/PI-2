package connection;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Venda;

public class MockVenda {
    static ArrayList<Venda> vendas = new ArrayList<Venda>();
    int f = 1;
    public void inserir(Venda venda) {
        int anterior = vendas.size();
        vendas.add(venda); 
        f++;
        if (vendas.size() > anterior) {
            JOptionPane.showMessageDialog(null, "Venda cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar a venda!");
        }
    }
}
