package org.example;

import org.example.vehicle.car.Sedan;
import org.example.vehicle.car.Truck;

public class Main {
    public static void main(String[] args) {
        ornek1();

    }

    public static void ornek1(){
        Sedan sedan = new Sedan(2015);
        sedan.go();
        sedan.stop();
        sedan.yakitTuru();
        sedan.getModelYili();
        sedan.yukTasima();
        Truck truck = new Truck(2018);
        truck.yakitTuru();
        truck.go();
        truck.getModelYili();
        truck.yukTasima();
    }

}