package com.company;

public class TeslaCar extends EvCar implements Seatable {

//    @Override
//    public void charge() {
//
//        // SuperCharge
//    }


    @Override
    public void start() {
        super.start();
    }

    @Override
    public void turn(String direction) {

//        nickName = "bee";
//        make = "Toyota";
//        model = "CRV";
//        vin = "123";
        super.turn(direction);
    }

    @Override
    public void charge() {
        super.charge();
    }

    @Override
    public int getNumberOfSeats() {
        return 0;
    }

    @Override
    public int getComfortableLevel() {
        return 0;
    }
}

// use control + enter to override all.