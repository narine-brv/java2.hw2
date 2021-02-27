package com.narine;

public class Main {

    public static void main(String[] args) {

        createObject("Shirt").print();
        createObject("Jeans").print();
        createObject("Sneakers").print();

    }

    public static Printable createObject(String className) {
        Printable print = null;
        switch (className) {
            case "Shirt":
                print = new Shirt("Shirt", "pink");
                break;
            case "Jeans":
                print = new Jeans ("Jeans", 38);
                break;
            case "Sneakers":
                print = new Sneakers ("Sneakers", "Nike");
                break;
        } return print;
    }
}
