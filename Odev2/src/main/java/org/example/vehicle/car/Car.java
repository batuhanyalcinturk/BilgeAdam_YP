package org.example.vehicle.car;

import org.example.vehicle.Vehicle;

abstract class Car extends Vehicle {

    private final Integer modelYili;


    protected Car(Integer modelYili) {
        this.modelYili = modelYili;
    }

    public abstract void yakitTuru();
    public abstract void yukTasima();

    public Integer getModelYili() {
        return modelYili;
    }


}
