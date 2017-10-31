package model.bean;

public class Venda {
    
    public String id = "";
    public String description;
    public double price;
    public int quantity;
    public double discount;

    public Venda(String id, String description, double price, int quantity, double discount) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }
    
    public String getCode() {
        return id;
    }

    public void setCode(String id) {
        this.id = id;
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
