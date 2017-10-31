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
        f++;
        int anterior = comandas.size();
        if (comandas.size() > anterior) {
            JOptionPane.showMessageDialog(null, "Venda cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar a venda!");
        }
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
}
