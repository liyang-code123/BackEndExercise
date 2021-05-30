package com.company;

public class IceCar extends Car implements Seatable{
    @Override
    public int getNumberOfSeats() {
        return 0;
    }

    @Override
    public int getComfortableLevel() {
        return 0;
    }
    // Internal Combustile Engine
}
