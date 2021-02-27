package com.narine;

public class Shirt extends Look implements Printable {

    private String color;

    public Shirt(String name, String color){
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\uD83D\uDC5A" + "\nColor: " + color);
    }
}

