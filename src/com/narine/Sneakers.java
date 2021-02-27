package com.narine;

public class Sneakers extends Look implements Printable{

    private String brand;

    public Sneakers (String name, String brand) {
        super(name);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\uD83D\uDC5F" + "\nBrand: " + brand);
    }
}
