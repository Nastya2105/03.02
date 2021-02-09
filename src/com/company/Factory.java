package com.company;

public class Factory {

    public static void main(String[] args) {

        Car aCar = new MyCar("ford",20, "blue");
        aCar.gas(15);
        aCar.brake(15);
        aCar.description();

        CarInterface hc = new HisCar("kia", 40, "red");

        hc.gas(100);
        hc.brake(100);
        hc.description();
    }
}

