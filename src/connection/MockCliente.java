package connection;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Cliente;

public class MockCliente {

    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static int f = 1;

    public void inserir(Cliente cliente) {
        boolean existe = false;
        int anterior = clientes.size();
        for (int i = 0; i < clientes.size(); i++) {
            if (cliente.id.equals(clientes.get(i).id)) {
                clientes.set(i, cliente);
                existe = true;
            }
        }

        if (existe == false) {
            cliente.id = Integer.toString(f);
            clientes.add(cliente);
            f++;
        }
        if (clientes.size() > anterior) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente editado com sucesso");
        }
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

    public String acharId(String documentNumber) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).documentNumber.equals(documentNumber)) {
                return clientes.get(i).id;
            }
        }
        return "";
    }
}
