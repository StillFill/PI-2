package connection;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Cliente;

public class MockCliente {

    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    int f = 1;

    public void inserir(Cliente cliente) {
        cliente.id = f;
        int anterior = clientes.size();
        clientes.add(cliente);
        f++;
        if (clientes.size() > anterior) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar o cliente!");
        }
    }

    public void editar(Cliente cliente) {

    }

    public ArrayList<Cliente> consultar(String type, String id) {
        ArrayList<Cliente> result = new ArrayList<Cliente>();
        if (type == "NOME") {
            for (Cliente cliente : clientes) {
                if (cliente.name.toUpperCase().contains(id.toUpperCase())) {
                    result.add(cliente);
                }
            }
        } else if (type == "CPF") {
            for (Cliente cliente : clientes) {
                if (cliente.documentNumber.contains(id)) {
                    result.add(cliente);
                }
            }
        }
        return result;
    }
}
