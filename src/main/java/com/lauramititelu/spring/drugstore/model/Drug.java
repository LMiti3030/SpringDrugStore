package com.lauramititelu.spring.drugstore.model;

public class Drug {

    private String name;
    private double price;
    private String EAN;

    public Drug(){
        this("", 0.0, "");
    }

    public Drug(String name, double price, String EAN){
        this.name = name;
        this.price = price;
        this.EAN = EAN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String EAN) {
        this.EAN = EAN;
    }

    @Override
    public String toString(){
        return "Drug name " + name + " price " + price+ " EAN " + EAN;
    }
}
