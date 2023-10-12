package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ornek1();
    }

    public static void ornek1() {
        Sedan sedan = new Sedan();
        sedan.startEngine();
        sedan.stopEngine();

        Truck truck = new Truck();
        truck.startEngine();
        truck.stopEngine();
    }
}