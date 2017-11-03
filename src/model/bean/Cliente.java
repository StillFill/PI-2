package model.bean;

import Pages.InternalCadastrarCliente;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    public String name;
    public String birthday;
    public String phoneNumber;
    public String email;
    public String type;
    public String gender;
    public String documentNumber;
    public String razaoSocial;
    public String cep;
    public String adress;
    public String adressNumber;
    public String neighborHood;
    public String city;
    public String complement;
    public String state;
    public String id = "";
    InternalCadastrarCliente t = new InternalCadastrarCliente();
    
    public Cliente(String id, String name, String birthday, String phoneNumber, String email, String type, String gender, String documentNumber, String razaoSocial, String cep, String adress, String adressNumber, String neighborHood, String city, String complement, String state){
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.type = type;
        this.gender = gender;
        this.documentNumber = documentNumber;
        this.razaoSocial = razaoSocial;
        this.cep = cep;
        this.adress = adress;
        this.city = city;
        this.complement = complement;
        this.state = state;
        this.adressNumber = adressNumber;
        this.neighborHood = neighborHood;
        
    }
    
    
    public String getAdressNumber() {
        return this.adressNumber;
    }

    public void setAdressNumber(String name) {
        this.adressNumber = adressNumber;
    }
    
    public String getNeighborHood() {
        return this.neighborHood;
    }

    public void setNeighborHood(String name) {
        this.neighborHood = neighborHood;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    
}
