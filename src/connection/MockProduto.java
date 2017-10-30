package connection;

import java.util.ArrayList;
import model.bean.Produto;

public class MockProduto {

    static ArrayList<Produto> produtos = new ArrayList<Produto>();
    int f = 1;

    public void inserir(Produto produto) {
        boolean existe = false;
        for (int i = 0; i < produtos.size(); i++) {
            if (produto.produtoId == produtos.get(i).produtoId) {
                produtos.set(i, produto);
                existe = true;
            }
        }
        if (!existe) {
            produto.produtoId = Integer.toString(f);
            produtos.add(produto);
            f++;
        }
    }

    public void editar(Produto produto) {

    }

    public Produto consultar(int id) {
        if (id != 0) {
            for (int i = 0; i < produtos.size(); i++) {
                if (produtos.get(i).produtoId.equals(id)) {
                    return produtos.get(i);
                }
            }
        }
        return null;
    }

    public void mostrar() {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).description);
        }
    }
}
