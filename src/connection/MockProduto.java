package connection;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Produto;

public class MockProduto {

    static ArrayList<Produto> produtos = new ArrayList<Produto>();
    int f = 1;

    public void inserir(Produto produto) {
        boolean existe = false;
        int anterior = produtos.size();
        for (int i = 0; i < produtos.size(); i++) {
            if (produto.id.equals(produtos.get(i).id)) {
                produtos.set(i, produto);
                existe = true;
            }
        }
        if (!existe) {
            produto.id = Integer.toString(f);
            produtos.add(produto);
            f++;
        }
        if (produtos.size() > anterior) {
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Produto editado com sucesso");
        }
    }

    public void editar(Produto produto) {

    }

    public ArrayList<Produto> consultar(String type, String id) {
        ArrayList<Produto> result = new ArrayList<Produto>();
        if (type == "DESCRIÇÃO") {
            for (Produto produto : produtos) {
                if (produto.description.toUpperCase().contains(id.toUpperCase())) {
                    result.add(produto);
                }
            }
        } else if (type == "TIPO") {
            for (Produto produto : produtos) {
                if (produto.type.contains(id)) {
                    result.add(produto);
                }
            }
        } else if (type == "COLEÇÃO") {
            for (Produto produto : produtos) {
                if (produto.colection.contains(id)) {
                    result.add(produto);
                }
            }
        }
        return result;
    }
}
