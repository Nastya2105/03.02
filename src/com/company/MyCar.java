package com.company;

public class MyCar extends Car {


    public MyCar() {
    }

    public MyCar(String model, int speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
    }

    public void description() {
        System.out.println(this.model);
        System.out.println(this.speed);
        System.out.println(this.color);
    }


}

