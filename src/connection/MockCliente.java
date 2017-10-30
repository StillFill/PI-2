package connection;

import java.util.ArrayList;
import model.bean.Cliente;

public class MockCliente {

    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    int f = 1;

    public void inserir(Cliente cliente) {
        boolean existe = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (cliente.clienteId == clientes.get(i).clienteId) {
                clientes.set(i, cliente);
                existe = true;
            }
        }
        if (!existe) {
            cliente.clienteId = f;
            clientes.add(cliente);
            f++;
        }
    }

    public void editar(Cliente cliente) {

    }

    public Cliente consultar(int id, String name, String cpf, String cnpj) {
        if (id != 0) {
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).clienteId == id) {
                    return clientes.get(i);
                }
            }
        }
        return null;
    }

    public void mostrar() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).name);
        }
    }
}
