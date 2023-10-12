package org.example;

public class Truck implements Car{
    @Override
    public void startEngine() {
        System.out.println("Tır motoru çalıştı");
    }

    @Override
    public void stopEngine() {
        System.out.println("Tır motoru durdu");
    }
}
