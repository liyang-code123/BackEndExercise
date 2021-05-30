package com.anothercompany;

import com.company.Car;

public class Garage {
    private Car car;

    public Garage(Car car) {
        this.car = car;
    }

    public void modify() {
        car.nickName = "hello";
//        car.make = "Farai";
//        car.model = "";
//        car.vin = "";
    }
}
