package connection;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Venda;

public class MockVenda {
    static ArrayList<Venda> vendas = new ArrayList<Venda>();
    int f = 1;
    public void inserir(Venda venda) {
        int anterior = vendas.size();
        venda.id = Integer.toString(f);
        vendas.add(venda); 
        f++;
        if (vendas.size() > anterior) {
            JOptionPane.showMessageDialog(null, "Venda cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar a venda!");
        }
    }
    public void editar(Venda venda){
        
    }
    public Venda consultar(int id, String name, String cpf, String cnpj){
        if(id != 0){
            for(int i = 0; i < vendas.size(); i++){
                if(vendas.get(i).id.equals(id)){
                    return vendas.get(i);
                }
            }
        }
        return null;
    }
}
