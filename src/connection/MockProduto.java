package connection;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Produto;

public class MockProduto {

    static ArrayList<Produto> produtos = new ArrayList<Produto>();
    static int f = 1;

    public void inserir(Produto produto) {
        boolean existe = false;
        int anterior = produtos.size();
        System.out.println("ID -> "+produto.id);
        for (int i = 0; i < produtos.size(); i++) {
            if (produto.id.equals(produtos.get(i).id)) {
                produtos.set(i, produto);
                existe = true;
            }
        }
        if (!existe) {
            produto.id = Integer.toString(f);
            produtos.add(produto);
            System.out.println("produto inserido id: "+produto.id);
            f++;
        }
        if (produtos.size() > anterior) {
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Produto editado com sucesso");
        }
    }

    public String acharId(String description, String type, String material) {
        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).description.equals(description) && produtos.get(i).type.equals(type) && produtos.get(i).material.equals(material)){
                return produtos.get(i).id;
            }
        }
        return "";
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
    
    public void updateProduto(Produto produto, int index){
        
    }
    
    public int acharIndex(String id){
        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).id.equals(id)){
                return i + 1;
            }
        }
        System.out.println("não encontrou");
        return 0;
    }
}
