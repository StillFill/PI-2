package model.bean;

import java.util.ArrayList;

public class Comanda {
    public ArrayList<Venda> vendas = new ArrayList<Venda>();
    public String comandaId = "";
    public Comanda(ArrayList<Venda> vendas){
        this.vendas = vendas;
    }
}
