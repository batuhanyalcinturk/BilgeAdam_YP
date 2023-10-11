package org.example.vehicle.car;

public class Sedan extends Car{

    private final Integer modelYili;

    public Sedan(Integer modelYili) {
        super(modelYili);
        this.modelYili = modelYili;
    }

    @Override
    public void go() {
        System.err.println("Sedan Hareket Ediyor");

    }

    @Override
    public void stop() {
        System.err.println("Sedan Duruyor");

    }

    @Override
    public void yakitTuru() {
        System.err.println("Sedan yakut türü : Benzin");
    }

    @Override
    public void yukTasima() {
        System.err.println("Sedan ağır yük taşıyamaz");
    }

    @Override
    public Integer getModelYili() {
        System.err.println("Sedan yıl : " + modelYili);
        return modelYili;
    }
}
