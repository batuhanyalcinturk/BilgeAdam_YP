package org.example;

public class Sedan implements Car{
    @Override
    public void startEngine() {
        System.out.println("Sedan motoru çalıştı");
    }

    @Override
    public void stopEngine() {
        System.out.println("Sedan motoru durdu");
    }
}
