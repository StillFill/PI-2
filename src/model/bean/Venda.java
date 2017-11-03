package model.bean;

public class Venda {
    public String clienteId;
    public String description;
    public double price;
    public int quantity;
    public double discount;

    public Venda(String description, double price, int quantity, double discount) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
