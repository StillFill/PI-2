package model.bean;

public class Venda {
    public String description;
    public int quantity;
    public double discount;

    public Venda(String id, String description, int quantity, double discount) {
        this.description = description;
        this.quantity = quantity;
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    
    
}
