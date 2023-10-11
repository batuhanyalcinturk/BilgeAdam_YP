package org.example.vehicle.car;

public class Truck extends Car{
    private final Integer modelYili;

    public Truck(Integer modelYili) {
        super(modelYili);
        this.modelYili = modelYili;
    }

    @Override
    public void go() {
        System.err.println("Truck hareket ediyor");

    }

    @Override
    public void stop() {
        System.err.println("Truck duruyor");
    }

    @Override
    public void yakitTuru() {
        System.err.println("Truck yakıt türü : Mazot");
    }

    @Override
    public void yukTasima() {
        System.err.println("Truck ağır yük taşıyabilir");
    }

    @Override
    public Integer getModelYili() {
        System.err.println("Truck yıl : " + modelYili);
        return modelYili;
    }
}
