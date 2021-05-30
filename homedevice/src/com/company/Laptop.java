package com.company;

public class Laptop implements Chargeable, Seatable {

    @Override
    public void charge() {

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
