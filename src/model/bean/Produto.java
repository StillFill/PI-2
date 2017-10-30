/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Samuelson
 */
public class Produto {
 
    public String produtoId = "";
    public String description;
    public int quantity;
    public String type;
    public String material;
    public String stone;
    public double width;
    public double height;
    public double price;
    public int size;
    public String gender;
    public String thickness;
    public String bracelet;
    public String mostrador;
    public String resistance;
    public int ensure;
    public String movement;
    public String colection;

    public Produto(String id, String description, int quantity, String type, String material,String stone, double height, double price, int size, String gender, String thickness, String bracelet,String mostrador, String resistance, int ensure, String movement, String colection) {
        this.produtoId = id;
        this.description = description;
        this.quantity = quantity;
        this.type = type;
        this.material = material;
        this.stone = stone;
        this.height = height;
        this.price = price;
        this.size = size;
        this.gender = gender;
        this.thickness = thickness;
        this.bracelet = bracelet;
        this.resistance = resistance;
        this.ensure = ensure;
        this.movement = movement;
        this.colection = colection;
    }

    public String getId() {
        return produtoId;
    }

    public void setId(String id) {
        this.produtoId = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }

    public String getBracelet() {
        return bracelet;
    }

    public void setBracelet(String bracelet) {
        this.bracelet = bracelet;
    }

    public String getResistance() {
        return resistance;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }

    public int getEnsure() {
        return ensure;
    }

    public void setEnsure(int ensure) {
        this.ensure = ensure;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getColection() {
        return colection;
    }

    public void setColection(String colection) {
        this.colection = colection;
    }
}
