package connection;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Venda;

public class MockVenda {
    static ArrayList<Venda> vendas = new ArrayList<Venda>();
    int f = 1;
    public void inserir(Venda venda) {
        vendas.add(venda); 
        f++;
    }
}
