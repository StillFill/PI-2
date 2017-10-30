package connection;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Comanda;

public class MockComanda {

    static ArrayList<Comanda> comandas = new ArrayList<Comanda>();
    static int f = 1;

    public void inserir(Comanda comanda) {
        comanda.comandaId = Integer.toString(f);
        comandas.add(comanda);
        JOptionPane.showMessageDialog(null, "Venda realizada com sucesso");
        f++;
    }

    public void editar(Comanda venda) {

    }

    public Comanda consultar(int id, String name, String cpf, String cnpj) {
        if (id != 0) {
            for (int i = 0; i < comandas.size(); i++) {
                if (comandas.get(i).comandaId.equals(id)) {
                    return comandas.get(i);
                }
            }
        }
        return null;
    }

    public void mostrar() {
        for (int i = 0; i < comandas.get(0).vendas.size(); i++) {
            System.out.println("---------------------------");
            System.out.println(comandas.get(0).vendas.get(i).description);
            System.out.println(comandas.get(0).vendas.get(i).discount);
            System.out.println(comandas.get(0).comandaId);
            System.out.println(comandas.get(0).vendas.get(i).quantity);
            System.out.println("---------------------------");
        }
    }
}
