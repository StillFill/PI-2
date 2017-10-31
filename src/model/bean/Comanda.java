package model.bean;

import java.util.ArrayList;
import java.util.Date;

public class Comanda {
    public ArrayList<Venda> vendas = new ArrayList<Venda>();
    public String comandaId = "";
    public Date dataCriada;
    public Comanda(ArrayList<Venda> venda){
        this.dataCriada = new Date();
        this.vendas = venda;
    }
}
