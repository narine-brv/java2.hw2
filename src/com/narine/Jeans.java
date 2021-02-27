package com.narine;

public class Jeans extends Look implements Printable {

    private int size;

    public Jeans (String name, int size){
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\uD83D\uDC56" + "\nSize: " + size);
    }
}
